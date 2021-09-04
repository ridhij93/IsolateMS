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
package com.ibm.websphere.samples.daytrader.direct;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.transaction.UserTransaction;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.TradeServices;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.CompleteOrderThread;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.MDBStats;
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
 * TradeDirect uses direct JDBC and JMS access to a
 * <code>javax.sql.DataSource</code> to implement the business methods of the
 * Trade online broker application. These business methods represent the
 * features and operations that can be performed by customers of the brokerage
 * such as login, logout, get a stock quote, buy or sell a stock, etc. and are
 * specified in the {@link com.ibm.websphere.samples.daytrader.TradeServices}
 * interface
 *
 * Note: In order for this class to be thread-safe, a new TradeJDBC must be
 * created for each call to a method from the TradeInterface interface.
 * Otherwise, pooled connections may not be released.
 *
 * @see com.ibm.websphere.samples.daytrader.TradeServices
 */
@Controller
@RequestMapping("/ms1/tradedirect/")
public class TradeDirectWrapper {

    /**
     * @see TradeServices#getQuote(String)
     */
    @RequestMapping(method = RequestMethod.GET, value = "getquote")
    public @ResponseBody ResponseEntity<Integer> getQuote(@RequestParam int callerId, @RequestParam String symbol) {
        try {
            TradeDirectServer callerObj = idObjMap.get(callerId);
            QuoteDataBean result = callerObj.getQuote(symbol);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*private AccountDataBean getAccountDataForUpdate(Connection conn,
            String userID) throws Exception {
        PreparedStatement stmt = getStatement(conn,
                getAccountForUserForUpdateSQL);
        stmt.setString(1, userID);
        ResultSet rs = stmt.executeQuery();
        AccountDataBean accountData = getAccountDataFromResultSet(rs);
        stmt.close();
        return accountData;
    }*/
    /*
    private AccountDataBean getAccountDataForUpdate(int accountID,
            Connection conn) throws Exception {
        PreparedStatement stmt = getStatement(conn, getAccountForUpdateSQL);
        stmt.setInt(1, accountID);
        ResultSet rs = stmt.executeQuery();
        AccountDataBean accountData = getAccountDataFromResultSet(rs);
        stmt.close();
        return accountData;
    }
     */
    /*
    private QuoteDataBean getQuoteData(String symbol) throws Exception {
        QuoteDataBean quoteData = null;
        Connection conn = null;
        try {
            conn = getConn();
            quoteData = getQuoteData(conn, symbol);
            commit(conn);
        } catch (Exception e) {
            Log.error("TradeDirect:getQuoteData -- error getting data", e);
            rollBack(conn, e);
        } finally {
            releaseConn(conn);
        }
        return quoteData;
    }
     */
    /*
    private OrderDataBean getOrderData(int orderID) throws Exception {
        OrderDataBean orderData = null;
        Connection conn = null;
        try {
            conn = getConn();
            orderData = getOrderData(conn, orderID);
            commit(conn);
        } catch (Exception e) {
            Log.error("TradeDirect:getOrderData -- error getting data", e);
            rollBack(conn, e);
        } finally {
            releaseConn(conn);
        }
        return orderData;
    }
     */
    /*
    private AccountProfileDataBean getAccountProfileData(Integer accountID)
    throws Exception {
        AccountProfileDataBean accountProfileData = null;
        Connection conn = null;

        try {
            if (Log.doTrace()) {
                Log.trace("TradeDirect:getAccountProfileData", accountID);
            }

            conn = getConn();
            accountProfileData = getAccountProfileData(conn, accountID);
            commit(conn);
        } catch (Exception e) {
            Log.error(
                    "TradeDirect:getAccountProfileData -- error getting profile data",
                    e);
            rollBack(conn, e);
        } finally {
            releaseConn(conn);
        }
        return accountProfileData;
    }
     */
    // Set Timestamp to zero to denote sell is inflight
    /*
    private void updateQuoteVolume(Connection conn, QuoteDataBean quoteData,
            double quantity) throws Exception {
        PreparedStatement stmt = getStatement(conn, updateQuoteVolumeSQL);

        stmt.setDouble(1, quantity);
        stmt.setString(2, quoteData.getSymbol());

        stmt.executeUpdate();
        stmt.close();
    }
     */
    /**
     * Update a quote's price and volume
     *
     * @param symbol
     *            The PK of the quote
     * @param changeFactor
     *            the percent to change the old price by (between 50% and 150%)
     * @param sharedTraded
     *            the ammount to add to the current volume
     * @param publishQuotePriceChange
     *            used by the PingJDBCWrite Primitive to ensure no JMS is used,
     *            should be true for all normal calls to this API
     */
    @RequestMapping(method = RequestMethod.GET, value = "updatequotepricevolumeint")
    public @ResponseBody ResponseEntity<Integer> updateQuotePriceVolumeInt(@RequestParam int callerId, @RequestParam String symbol, @RequestParam BigDecimal changeFactor, @RequestParam double sharesTraded, @RequestParam boolean publishQuotePriceChange) {
        try {
            TradeDirectServer callerObj = idObjMap.get(callerId);
            QuoteDataBean result = callerObj.updateQuotePriceVolumeInt(symbol, changeFactor, sharesTraded, publishQuotePriceChange);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * @see TradeServices#login(String, String)
     */
    /**
     * @see TradeServices#register(String, String, String, String, String,
     *      String, BigDecimal, boolean)
     */
    @RequestMapping(method = RequestMethod.GET, value = "checkdbproductname")
    public @ResponseBody ResponseEntity<String> checkDBProductName(@RequestParam int callerId) {
        try {
            TradeDirectServer callerObj = idObjMap.get(callerId);
            String result = callerObj.checkDBProductName();
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "getconnpublic")
    public @ResponseBody ResponseEntity<Integer> getConnPublic(@RequestParam int callerId) {
        try {
            TradeDirectServer callerObj = idObjMap.get(callerId);
            Connection result = callerObj.getConnPublic();
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, TradeDirectServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradedirect")
    public  @ResponseBody int TradeDirect() {
        TradeDirectServer newServerObj = new TradeDirectServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tradedirect")
    public  @ResponseBody int TradeDirect(@RequestParam boolean inSession) {
        TradeDirectServer newServerObj = new TradeDirectServer(inSession);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

