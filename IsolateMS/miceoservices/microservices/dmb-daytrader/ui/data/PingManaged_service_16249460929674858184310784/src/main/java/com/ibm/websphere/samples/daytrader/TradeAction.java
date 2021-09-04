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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * The TradeAction class provides the generic client side access to each of the
 * Trade brokerage user operations. These include login, logout, buy, sell,
 * getQuote, etc. The TradeAction class does not handle user interface
 * processing and should be used by a class that is UI specific. For example,
 * {trade_client.TradeServletAction}manages a web interface to Trade, making
 * calls to TradeAction methods to actually performance each operation.
 */
public class TradeAction implements TradeServices {

    // make this static so the trade impl can be cached
    // - ejb3 mode is the only thing that really uses this
    public TradeAction() {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/tradeactioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TradeAction(TradeServices trade) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/tradeaction?callerId=" + this.id + "&tradeId=trade.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    private void createTrade() {
        return;
    }

    /**
     * Market Summary is inherently a heavy database operation. For servers that
     * have a caching story this is a great place to cache data that is good for
     * a period of time. In order to provide a flexible framework for this we
     * allow the market summary operation to be invoked on every transaction,
     * time delayed or never. This is configurable in the configuration panel.
     *
     * @return An instance of the market summary
     */
    @Override
    public MarketSummaryDataBean getMarketSummary() throws Exception {
        return (MarketSummaryDataBean) null;
    }

    /**
     * Compute and return a snapshot of the current market conditions This
     * includes the TSIA - an index of the price of the top 100 Trade stock
     * quotes The openTSIA ( the index at the open) The volume of shares traded,
     * Top Stocks gain and loss
     *
     * @return A snapshot of the current market summary
     */
    public MarketSummaryDataBean getMarketSummaryInternal() throws Exception {
        return (MarketSummaryDataBean) null;
    }

    /**
     * Purchase a stock and create a new holding for the given user. Given a
     * stock symbol and quantity to purchase, retrieve the current quote price,
     * debit the user's account balance, and add holdings to user's portfolio.
     *
     * @param userID
     *            the customer requesting the stock purchase
     * @param symbol
     *            the symbol of the stock being purchased
     * @param quantity
     *            the quantity of shares to purchase
     * @return OrderDataBean providing the status of the newly created buy order
     */
    @Override
    public OrderDataBean buy(String userID, String symbol, double quantity, int orderProcessingMode) throws Exception {
        return (OrderDataBean) null;
    }

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
    public OrderDataBean sell(String userID, int holdingID, int orderProcessingMode) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/sell?callerId=" + this.id + "&userID=userID&holdingID=holdingID&orderProcessingMode=orderProcessingMode";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        OrderDataBean result = OrderDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (OrderDataBean) null;
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
    @Override
    public OrderDataBean sell(String userID, Integer holdingID, int orderProcessingMode) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/sell?callerId=" + this.id + "&userID=userID&holdingID=holdingID&orderProcessingMode=orderProcessingMode";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        OrderDataBean result = OrderDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (OrderDataBean) null;
    }

    /**
     * Queue the Order identified by orderID to be processed
     * <p/>
     * Orders are submitted through JMS to a Trading Broker and completed
     * asynchronously. This method queues the order for processing
     * <p/>
     * The boolean twoPhase specifies to the server implementation whether or
     * not the method is to participate in a global transaction
     *
     * @param orderID
     *            the Order being queued for processing
     */
    @Override
    public void queueOrder(Integer orderID, boolean twoPhase) {
        return;
    }

    /**
     * Complete the Order identefied by orderID Orders are submitted through JMS
     * to a Trading agent and completed asynchronously. This method completes
     * the order For a buy, the stock is purchased creating a holding and the
     * users account is debited For a sell, the stock holding is removed and the
     * users account is credited with the proceeds
     * <p/>
     * The boolean twoPhase specifies to the server implementation whether or
     * not the method is to participate in a global transaction
     *
     * @param orderID
     *            the Order to complete
     * @return OrderDataBean providing the status of the completed order
     */
    @Override
    public OrderDataBean completeOrder(Integer orderID, boolean twoPhase) {
        return (OrderDataBean) null;
    }

    /**
     * Cancel the Order identified by orderID
     * <p/>
     * Orders are submitted through JMS to a Trading Broker and completed
     * asynchronously. This method queues the order for processing
     * <p/>
     * The boolean twoPhase specifies to the server implementation whether or
     * not the method is to participate in a global transaction
     *
     * @param orderID
     *            the Order being queued for processing
     */
    @Override
    public void cancelOrder(Integer orderID, boolean twoPhase) {
        return;
    }

    @Override
    public void orderCompleted(String userID, Integer orderID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/ordercompleted?callerId=" + this.id + "&userID=userID&orderID=orderID";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    /**
     * Get the collection of all orders for a given account
     *
     * @param userID
     *            the customer account to retrieve orders for
     * @return Collection OrderDataBeans providing detailed order information
     */
    @Override
    public Collection<?> getOrders(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/getorders?callerId=" + this.id + "&userID=userID";
        ResponseEntity<Collection> resultTemp = new RestTemplate().getForEntity(uri, Collection.class);
        Collection<?> result = resultTemp.getBody();
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (Collection) null;
    }

    /**
     * Get the collection of completed orders for a given account that need to
     * be alerted to the user
     *
     * @param userID
     *            the customer account to retrieve orders for
     * @return Collection OrderDataBeans providing detailed order information
     */
    @Override
    public Collection<?> getClosedOrders(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/getclosedorders?callerId=" + this.id + "&userID=userID";
        ResponseEntity<Collection> resultTemp = new RestTemplate().getForEntity(uri, Collection.class);
        Collection<?> result = resultTemp.getBody();
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (Collection) null;
    }

    /**
     * Given a market symbol, price, and details, create and return a new
     * {@link QuoteDataBean}
     *
     * @param symbol
     *            the symbol of the stock
     * @param price
     *            the current stock price
     * @return a new QuoteDataBean or null if Quote could not be created
     */
    @Override
    public QuoteDataBean createQuote(String symbol, String companyName, BigDecimal price) throws Exception {
        return (QuoteDataBean) null;
    }

    /**
     * Return a collection of {@link QuoteDataBean}describing all current quotes
     *
     * @return the collection of QuoteDataBean
     */
    @Override
    public Collection<?> getAllQuotes() throws Exception {
        return (Collection) null;
    }

    /**
     * Return a {@link QuoteDataBean}describing a current quote for the given
     * stock symbol
     *
     * @param symbol
     *            the stock symbol to retrieve the current Quote
     * @return the QuoteDataBean
     */
    @Override
    public QuoteDataBean getQuote(String symbol) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/getquote?callerId=" + this.id + "&symbol=symbol";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        QuoteDataBean result = QuoteDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (QuoteDataBean) null;
    }

    /**
     * Update the stock quote price for the specified stock symbol
     *
     * @param symbol
     *            for stock quote to update
     * @return the QuoteDataBean describing the stock
     */
    /* avoid data collision with synch */
    @Override
    public QuoteDataBean updateQuotePriceVolume(String symbol, BigDecimal changeFactor, double sharesTraded) throws Exception {
        return (QuoteDataBean) null;
    }

    /**
     * Return the portfolio of stock holdings for the specified customer as a
     * collection of HoldingDataBeans
     *
     * @param userID
     *            the customer requesting the portfolio
     * @return Collection of the users portfolio of stock holdings
     */
    @Override
    public Collection<?> getHoldings(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/getholdings?callerId=" + this.id + "&userID=userID";
        ResponseEntity<Collection> resultTemp = new RestTemplate().getForEntity(uri, Collection.class);
        Collection<?> result = resultTemp.getBody();
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (Collection) null;
    }

    /**
     * Return a specific user stock holding identifed by the holdingID
     *
     * @param holdingID
     *            the holdingID to return
     * @return a HoldingDataBean describing the holding
     */
    @Override
    public HoldingDataBean getHolding(Integer holdingID) throws Exception {
        return (HoldingDataBean) null;
    }

    /**
     * Return an AccountDataBean object for userID describing the account
     *
     * @param userID
     *            the account userID to lookup
     * @return User account data in AccountDataBean
     */
    @Override
    public AccountDataBean getAccountData(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/getaccountdata?callerId=" + this.id + "&userID=userID";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        AccountDataBean result = AccountDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (AccountDataBean) null;
    }

    /**
     * Return an AccountProfileDataBean for userID providing the users profile
     *
     * @param userID
     *            the account userID to lookup
     */
    @Override
    public AccountProfileDataBean getAccountProfileData(String userID) throws Exception {
        return (AccountProfileDataBean) null;
    }

    /**
     * Update userID's account profile information using the provided
     * AccountProfileDataBean object
     *
     * @param accountProfileData
     *            account profile data in AccountProfileDataBean
     */
    @Override
    public AccountProfileDataBean updateAccountProfile(AccountProfileDataBean accountProfileData) throws Exception {
        return (AccountProfileDataBean) null;
    }

    /**
     * Attempt to authenticate and login a user with the given password
     *
     * @param userID
     *            the customer to login
     * @param password
     *            the password entered by the customer for authentication
     * @return User account data in AccountDataBean
     */
    @Override
    public AccountDataBean login(String userID, String password) throws Exception {
        return (AccountDataBean) null;
    }

    /**
     * Logout the given user
     *
     * @param userID
     *            the customer to logout
     */
    @Override
    public void logout(String userID) throws Exception {
        return;
    }

    /**
     * Register a new Trade customer. Create a new user profile, user registry
     * entry, account with initial balance, and empty portfolio.
     *
     * @param userID
     *            the new customer to register
     * @param password
     *            the customers password
     * @param fullname
     *            the customers fullname
     * @param address
     *            the customers street address
     * @param email
     *            the customers email address
     * @param creditCard
     *            the customers creditcard number
     * @param openBalance
     *            the amount to charge to the customers credit to open the
     *            account and set the initial balance
     * @return the userID if successful, null otherwise
     */
    @Override
    public AccountDataBean register(String userID, String password, String fullname, String address, String email, String creditCard, BigDecimal openBalance) throws Exception {
        return (AccountDataBean) null;
    }

    public AccountDataBean register(String userID, String password, String fullname, String address, String email, String creditCard, String openBalanceString) throws Exception {
        return (AccountDataBean) null;
    }

    /**
     * Reset the TradeData by - removing all newly registered users by scenario
     * servlet (i.e. users with userID's beginning with "ru:") * - removing all
     * buy/sell order pairs - setting logoutCount = loginCount
     *
     * return statistics for this benchmark run
     */
    @Override
    public RunStatsDataBean resetTrade(boolean deleteAll) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/resettrade?callerId=" + this.id + "&deleteAll=deleteAll";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        RunStatsDataBean result = RunStatsDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (RunStatsDataBean) null;
    }

    public static Integer getMarketSummaryLock() {
        return (Integer) null;
    }

    public static void setNextMarketSummary(long nextMarketSummary) {
        return;
    }

    public static long getNextMarketSummary() {
        return (Long) null;
    }

    public static void setCachedMSDB(MarketSummaryDataBean cachedMSDB) {
        return;
    }

    public static MarketSummaryDataBean getCachedMSDB() {
        return (MarketSummaryDataBean) null;
    }

    public static void setTrade(TradeServices trade) {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeaction/settrade?tradeId=trade.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static TradeServices getTrade() {
        return (TradeServices) null;
    }

    public static void setTradeLocal(TradeServices tradeLocal) {
        return;
    }

    public static TradeServices getTradeLocal() {
        return (TradeServices) null;
    }

    public static void setTradeRemote(TradeServices tradeRemote) {
        return;
    }

    public static TradeServices getTradeRemote() {
        return (TradeServices) null;
    }

    public int id = 0;

    public static TradeAction getObject(int id) {
        TradeAction obj = (TradeAction) new Object();
        obj.id = id;
        return obj;
    }
}

