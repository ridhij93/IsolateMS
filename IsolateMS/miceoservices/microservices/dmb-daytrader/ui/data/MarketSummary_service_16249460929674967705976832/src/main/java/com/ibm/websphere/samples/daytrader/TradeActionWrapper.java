/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.websphere.samples.daytrader;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Collection;
// import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import javax.naming.InitialContext;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.ejb3.TradeSLSBLocal;
import com.ibm.websphere.samples.daytrader.ejb3.TradeSLSBRemote;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The TradeAction class provides the generic client side access to each of the
 * Trade brokerage user operations. These include login, logout, buy, sell,
 * getQuote, etc. The TradeAction class does not handle user interface
 * processing and should be used by a class that is UI specific. For example,
 * {trade_client.TradeServletAction}manages a web interface to Trade, making
 * calls to TradeAction methods to actually performance each operation.
 */
@Controller
@RequestMapping("/ms5/tradeaction/")
public class TradeActionWrapper {

    // make this static so the trade impl can be cached
    // - ejb3 mode is the only thing that really uses this
    /**
     * Sell(SOAP 2.2 Wrapper converting int to Integer) a stock holding and
     * removed the holding for the given user. Given a Holding, retrieve current
     * quote, credit user's account, and reduce holdings in user's portfolio.
     *
     * @param userID
     *            the customer requesting the sell
     * @param holdingID
     *            the users holding to be sold
     * @return OrderDataBean providing the status of the newly created sell
     *         order
     */
    @RequestMapping(method = RequestMethod.GET, value = "sell")
    public @ResponseBody ResponseEntity<Integer> sell(@RequestParam int callerId, @RequestParam String userID, @RequestParam int holdingID, @RequestParam int orderProcessingMode) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            OrderDataBean result = callerObj.sell(userID, holdingID, orderProcessingMode);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Sell a stock holding and removed the holding for the given user. Given a
     * Holding, retrieve current quote, credit user's account, and reduce
     * holdings in user's portfolio.
     *
     * @param userID
     *            the customer requesting the sell
     * @param holdingID
     *            the users holding to be sold
     * @return OrderDataBean providing the status of the newly created sell
     *         order
     */
    @RequestMapping(method = RequestMethod.GET, value = "sell")
    public @ResponseBody ResponseEntity<Integer> sell(@RequestParam int callerId, @RequestParam String userID, @RequestParam Integer holdingID, @RequestParam int orderProcessingMode) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            OrderDataBean result = callerObj.sell(userID, holdingID, orderProcessingMode);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "ordercompleted")
    public @ResponseBody ResponseEntity<Void> orderCompleted(@RequestParam int callerId, @RequestParam String userID, @RequestParam Integer orderID) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            callerObj.orderCompleted(userID, orderID);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Get the collection of all orders for a given account
     *
     * @param userID
     *            the customer account to retrieve orders for
     * @return Collection OrderDataBeans providing detailed order information
     */
    @RequestMapping(method = RequestMethod.GET, value = "getorders")
    public @ResponseBody ResponseEntity<Collection> getOrders(@RequestParam int callerId, @RequestParam String userID) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            Collection<?> result = callerObj.getOrders(userID);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Get the collection of completed orders for a given account that need to
     * be alerted to the user
     *
     * @param userID
     *            the customer account to retrieve orders for
     * @return Collection OrderDataBeans providing detailed order information
     */
    @RequestMapping(method = RequestMethod.GET, value = "getclosedorders")
    public @ResponseBody ResponseEntity<Collection> getClosedOrders(@RequestParam int callerId, @RequestParam String userID) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            Collection<?> result = callerObj.getClosedOrders(userID);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Return a {@link QuoteDataBean}describing a current quote for the given
     * stock symbol
     *
     * @param symbol
     *            the stock symbol to retrieve the current Quote
     * @return the QuoteDataBean
     */
    @RequestMapping(method = RequestMethod.GET, value = "getquote")
    public @ResponseBody ResponseEntity<Integer> getQuote(@RequestParam int callerId, @RequestParam String symbol) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            QuoteDataBean result = callerObj.getQuote(symbol);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Update the stock quote price for the specified stock symbol
     *
     * @param symbol
     *            for stock quote to update
     * @return the QuoteDataBean describing the stock
     */
    /**
     * Return the portfolio of stock holdings for the specified customer as a
     * collection of HoldingDataBeans
     *
     * @param userID
     *            the customer requesting the portfolio
     * @return Collection of the users portfolio of stock holdings
     */
    @RequestMapping(method = RequestMethod.GET, value = "getholdings")
    public @ResponseBody ResponseEntity<Collection> getHoldings(@RequestParam int callerId, @RequestParam String userID) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            Collection<?> result = callerObj.getHoldings(userID);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Return an AccountDataBean object for userID describing the account
     *
     * @param userID
     *            the account userID to lookup
     * @return User account data in AccountDataBean
     */
    @RequestMapping(method = RequestMethod.GET, value = "getaccountdata")
    public @ResponseBody ResponseEntity<Integer> getAccountData(@RequestParam int callerId, @RequestParam String userID) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            AccountDataBean result = callerObj.getAccountData(userID);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Reset the TradeData by - removing all newly registered users by scenario
     * servlet (i.e. users with userID's beginning with "ru:") * - removing all
     * buy/sell order pairs - setting logoutCount = loginCount
     *
     * return statistics for this benchmark run
     */
    @RequestMapping(method = RequestMethod.GET, value = "resettrade")
    public @ResponseBody ResponseEntity<Integer> resetTrade(@RequestParam int callerId, @RequestParam boolean deleteAll) {
        try {
            TradeActionServer callerObj = idObjMap.get(callerId);
            RunStatsDataBean result = callerObj.resetTrade(deleteAll);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "settrade")
    public static @ResponseBody ResponseEntity<Void> setTrade(@RequestParam int tradeId) {
        TradeActionServer.setTrade(TradeServices.getObject(tradeId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, TradeActionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradeaction")
    public  @ResponseBody int TradeAction() {
        TradeActionServer newServerObj = new TradeActionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tradeaction")
    public  @ResponseBody int TradeAction(@RequestParam int tradeId) {
        TradeActionServer newServerObj = new TradeActionServer(TradeServices.getObject(tradeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

