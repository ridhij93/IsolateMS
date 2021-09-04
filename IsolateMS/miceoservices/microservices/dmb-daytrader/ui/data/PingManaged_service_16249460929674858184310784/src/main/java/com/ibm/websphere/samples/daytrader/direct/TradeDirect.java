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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

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
public class TradeDirect implements TradeServices {

    /**
     * Zero arg constructor for TradeDirect
     */
    public TradeDirect() {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradedirect/tradedirectcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TradeDirect(boolean inSession) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradedirect/tradedirect?callerId=" + this.id + "&inSession=inSession";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * @see TradeServices#getMarketSummary()
     */
    @Override
    public MarketSummaryDataBean getMarketSummary() throws Exception {
        return (MarketSummaryDataBean) null;
    }

    /**
     * @see TradeServices#buy(String, String, double)
     */
    @Override
    public OrderDataBean buy(String userID, String symbol, double quantity, int orderProcessingMode) throws Exception {
        return (OrderDataBean) null;
    }

    /**
     * @see TradeServices#sell(String, Integer)
     */
    @Override
    public OrderDataBean sell(String userID, Integer holdingID, int orderProcessingMode) throws Exception {
        return (OrderDataBean) null;
    }

    /**
     * @see TradeServices#queueOrder(Integer)
     */
    @Override
    public void queueOrder(Integer orderID, boolean twoPhase) throws Exception {
        return;
    }

    /**
     * @see TradeServices#completeOrder(Integer)
     */
    @Override
    public OrderDataBean completeOrder(Integer orderID, boolean twoPhase) throws Exception {
        return (OrderDataBean) null;
    }

    private OrderDataBean completeOrder(Connection conn, Integer orderID) throws Exception {
        return (OrderDataBean) null;
    }

    /**
     * @see TradeServices#cancelOrder(Integer, boolean)
     */
    @Override
    public void cancelOrder(Integer orderID, boolean twoPhase) throws Exception {
        return;
    }

    private void cancelOrder(Connection conn, Integer orderID) throws Exception {
        return;
    }

    @Override
    public void orderCompleted(String userID, Integer orderID) throws Exception {
        return;
    }

    private HoldingDataBean createHolding(Connection conn, int accountID, String symbol, double quantity, BigDecimal purchasePrice) throws Exception {
        return (HoldingDataBean) null;
    }

    private void removeHolding(Connection conn, int holdingID, int orderID) throws Exception {
        return;
    }

    private OrderDataBean createOrder(Connection conn, AccountDataBean accountData, QuoteDataBean quoteData, HoldingDataBean holdingData, String orderType, double quantity) throws Exception {
        return (OrderDataBean) null;
    }

    /**
     * @see TradeServices#getOrders(String)
     */
    @Override
    public Collection<OrderDataBean> getOrders(String userID) throws Exception {
        return (Collection) null;
    }

    /**
     * @see TradeServices#getClosedOrders(String)
     */
    @Override
    public Collection<OrderDataBean> getClosedOrders(String userID) throws Exception {
        return (Collection) null;
    }

    /**
     * @see TradeServices#createQuote(String, String, BigDecimal)
     */
    @Override
    public QuoteDataBean createQuote(String symbol, String companyName, BigDecimal price) throws Exception {
        return (QuoteDataBean) null;
    }

    /**
     * @see TradeServices#getQuote(String)
     */
    @Override
    public QuoteDataBean getQuote(String symbol) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradedirect/getquote?callerId=" + this.id + "&symbol=symbol";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        QuoteDataBean result = QuoteDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (QuoteDataBean) null;
    }

    private QuoteDataBean getQuote(Connection conn, String symbol) throws Exception {
        return (QuoteDataBean) null;
    }

    private QuoteDataBean getQuoteForUpdate(Connection conn, String symbol) throws Exception {
        return (QuoteDataBean) null;
    }

    /**
     * @see TradeServices#getAllQuotes(String)
     */
    @Override
    public Collection<QuoteDataBean> getAllQuotes() throws Exception {
        return (Collection) null;
    }

    /**
     * @see TradeServices#getHoldings(String)
     */
    @Override
    public Collection<HoldingDataBean> getHoldings(String userID) throws Exception {
        return (Collection) null;
    }

    /**
     * @see TradeServices#getHolding(Integer)
     */
    @Override
    public HoldingDataBean getHolding(Integer holdingID) throws Exception {
        return (HoldingDataBean) null;
    }

    /**
     * @see TradeServices#getAccountData(String)
     */
    @Override
    public AccountDataBean getAccountData(String userID) throws Exception {
        return (AccountDataBean) null;
    }

    private AccountDataBean getAccountData(Connection conn, String userID) throws Exception {
        return (AccountDataBean) null;
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
    /**
     * @see TradeServices#getAccountData(String)
     */
    public AccountDataBean getAccountData(int accountID) throws Exception {
        return (AccountDataBean) null;
    }

    private AccountDataBean getAccountData(int accountID, Connection conn) throws Exception {
        return (AccountDataBean) null;
    }

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
    private QuoteDataBean getQuoteData(Connection conn, String symbol) throws Exception {
        return (QuoteDataBean) null;
    }

    private HoldingDataBean getHoldingData(int holdingID) throws Exception {
        return (HoldingDataBean) null;
    }

    private HoldingDataBean getHoldingData(Connection conn, int holdingID) throws Exception {
        return (HoldingDataBean) null;
    }

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
    private OrderDataBean getOrderData(Connection conn, int orderID) throws Exception {
        return (OrderDataBean) null;
    }

    /**
     * @see TradeServices#getAccountProfileData(String)
     */
    @Override
    public AccountProfileDataBean getAccountProfileData(String userID) throws Exception {
        return (AccountProfileDataBean) null;
    }

    private AccountProfileDataBean getAccountProfileData(Connection conn, String userID) throws Exception {
        return (AccountProfileDataBean) null;
    }

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
    private AccountProfileDataBean getAccountProfileData(Connection conn, Integer accountID) throws Exception {
        return (AccountProfileDataBean) null;
    }

    /**
     * @see TradeServices#updateAccountProfile(AccountProfileDataBean)
     */
    @Override
    public AccountProfileDataBean updateAccountProfile(AccountProfileDataBean profileData) throws Exception {
        return (AccountProfileDataBean) null;
    }

    private void creditAccountBalance(Connection conn, AccountDataBean accountData, BigDecimal credit) throws Exception {
        return;
    }

    // Set Timestamp to zero to denote sell is inflight
    // UPDATE -- could add a "status" attribute to holding
    private void updateHoldingStatus(Connection conn, Integer holdingID, String symbol) throws Exception {
        return;
    }

    private void updateOrderStatus(Connection conn, Integer orderID, String status) throws Exception {
        return;
    }

    private void updateOrderHolding(Connection conn, int orderID, int holdingID) throws Exception {
        return;
    }

    private void updateAccountProfile(Connection conn, AccountProfileDataBean profileData) throws Exception {
        return;
    }

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
    @Override
    public QuoteDataBean updateQuotePriceVolume(String symbol, BigDecimal changeFactor, double sharesTraded) throws Exception {
        return (QuoteDataBean) null;
    }

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
    public QuoteDataBean updateQuotePriceVolumeInt(String symbol, BigDecimal changeFactor, double sharesTraded, boolean publishQuotePriceChange) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradedirect/updatequotepricevolumeint?callerId=" + this.id + "&symbol=symbol&changeFactor=changeFactor&sharesTraded=sharesTraded&publishQuotePriceChange=publishQuotePriceChange";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        QuoteDataBean result = QuoteDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (QuoteDataBean) null;
    }

    private void updateQuotePriceVolume(Connection conn, String symbol, BigDecimal newPrice, double newVolume, double change) throws Exception {
        return;
    }

    private void publishQuotePriceChange(QuoteDataBean quoteData, BigDecimal oldPrice, BigDecimal changeFactor, double sharesTraded) throws Exception {
        return;
    }

    /**
     * @see TradeServices#login(String, String)
     */
    @Override
    public AccountDataBean login(String userID, String password) throws Exception {
        return (AccountDataBean) null;
    }

    /**
     * @see TradeServices#logout(String)
     */
    @Override
    public void logout(String userID) throws Exception {
        return;
    }

    /**
     * @see TradeServices#register(String, String, String, String, String,
     *      String, BigDecimal, boolean)
     */
    @Override
    public AccountDataBean register(String userID, String password, String fullname, String address, String email, String creditcard, BigDecimal openBalance) throws Exception {
        return (AccountDataBean) null;
    }

    private AccountDataBean getAccountDataFromResultSet(ResultSet rs) throws Exception {
        return (AccountDataBean) null;
    }

    private AccountProfileDataBean getAccountProfileDataFromResultSet(ResultSet rs) throws Exception {
        return (AccountProfileDataBean) null;
    }

    private HoldingDataBean getHoldingDataFromResultSet(ResultSet rs) throws Exception {
        return (HoldingDataBean) null;
    }

    private QuoteDataBean getQuoteDataFromResultSet(ResultSet rs) throws Exception {
        return (QuoteDataBean) null;
    }

    private OrderDataBean getOrderDataFromResultSet(ResultSet rs) throws Exception {
        return (OrderDataBean) null;
    }

    public String checkDBProductName() {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradedirect/checkdbproductnamecallerId=" + this.id + "";
        ResponseEntity<String> resultTemp = new RestTemplate().getForEntity(uri, String.class);
        String result = resultTemp.getBody();
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (String) null;
    }

    public boolean recreateDBTables(Object[] sqlBuffer, java.io.PrintWriter out) throws Exception {
        return (Boolean) null;
    }

    @Override
    public RunStatsDataBean resetTrade(boolean deleteAll) throws Exception {
        return (RunStatsDataBean) null;
    }

    private void releaseConn(Connection conn) throws Exception {
        return;
    }

    /*
     * Lookup the TradeData datasource
     */
    private void getDataSource() throws Exception {
        return;
    }

    private Connection getConn() throws Exception {
        return (Connection) null;
    }

    public Connection getConnPublic() {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradedirect/getconnpubliccallerId=" + this.id + "";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        Connection result = Connection.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (Connection) null;
    }

    /*
     * Commit the provided connection if not under Global Transaction scope -
     * conn.commit() is not allowed in a global transaction. the txn manager
     * will perform the commit
     */
    private void commit(Connection conn) throws Exception {
        return;
    }

    /*
     * Rollback the statement for the given connection
     */
    private void rollBack(Connection conn, Exception e) throws Exception {
        return;
    }

    /*
     * Allocate a new prepared statment for this connection
     */
    private PreparedStatement getStatement(Connection conn, String sql) throws Exception {
        return (PreparedStatement) null;
    }

    private PreparedStatement getStatement(Connection conn, String sql, int type, int concurrency) throws Exception {
        return (PreparedStatement) null;
    }

    public static synchronized void init() {
        return;
    }

    public static void destroy() {
        return;
    }

    /**
     * Gets the inGlobalTxn
     *
     * @return Returns a boolean
     */
    private boolean getInGlobalTxn() {
        return (Boolean) null;
    }

    /**
     * Sets the inGlobalTxn
     *
     * @param inGlobalTxn
     *            The inGlobalTxn to set
     */
    private void setInGlobalTxn(boolean inGlobalTxn) {
        return;
    }

    public static void setDsName(String dsName) {
        return;
    }

    public static String getDsName() {
        return (String) null;
    }

    public static void setDatasource(DataSource datasource) {
        return;
    }

    public static DataSource getDatasource() {
        return (DataSource) null;
    }

    public static void setZERO(BigDecimal ZERO) {
        return;
    }

    public static BigDecimal getZERO() {
        return (BigDecimal) null;
    }

    public void setInSession(boolean inSession) {
        return;
    }

    public boolean getInSession() {
        return (Boolean) null;
    }

    public static void setConnCount(int connCount) {
        return;
    }

    public static int getConnCount() {
        return (Integer) null;
    }

    public static void setLock(Integer lock) {
        return;
    }

    public static Integer getLock() {
        return (Integer) null;
    }

    public static String getCreateQuoteSQL() {
        return (String) null;
    }

    public static String getCreateAccountSQL() {
        return (String) null;
    }

    public static String getCreateAccountProfileSQL() {
        return (String) null;
    }

    public static String getCreateHoldingSQL() {
        return (String) null;
    }

    public static String getCreateOrderSQL() {
        return (String) null;
    }

    public static String getRemoveHoldingSQL() {
        return (String) null;
    }

    public static String getRemoveHoldingFromOrderSQL() {
        return (String) null;
    }

    public static String getUpdateAccountProfileSQL() {
        return (String) null;
    }

    public static String getLoginSQL() {
        return (String) null;
    }

    public static String getLogoutSQL() {
        return (String) null;
    }

    public static String getGetAccountSQL() {
        return (String) null;
    }

    public static String getGetAccountProfileSQL() {
        return (String) null;
    }

    public static String getGetAccountProfileForAccountSQL() {
        return (String) null;
    }

    public static String getGetAccountForUserSQL() {
        return (String) null;
    }

    public static String getGetHoldingSQL() {
        return (String) null;
    }

    public static String getGetHoldingsForUserSQL() {
        return (String) null;
    }

    public static String getGetOrderSQL() {
        return (String) null;
    }

    public static String getGetOrdersByUserSQL() {
        return (String) null;
    }

    public static String getGetClosedOrdersSQL() {
        return (String) null;
    }

    public static String getGetQuoteSQL() {
        return (String) null;
    }

    public static String getGetAllQuotesSQL() {
        return (String) null;
    }

    public static String getGetQuoteForUpdateSQL() {
        return (String) null;
    }

    public static String getGetTSIAQuotesOrderByChangeSQL() {
        return (String) null;
    }

    public static String getGetTSIASQL() {
        return (String) null;
    }

    public static String getGetOpenTSIASQL() {
        return (String) null;
    }

    public static String getGetTSIATotalVolumeSQL() {
        return (String) null;
    }

    public static String getCreditAccountBalanceSQL() {
        return (String) null;
    }

    public static String getUpdateOrderStatusSQL() {
        return (String) null;
    }

    public static String getUpdateOrderHoldingSQL() {
        return (String) null;
    }

    public static String getUpdateQuotePriceVolumeSQL() {
        return (String) null;
    }

    public static void setInitialized(boolean initialized) {
        return;
    }

    public static boolean getInitialized() {
        return (Boolean) null;
    }

    public static void setContext(InitialContext context) {
        return;
    }

    public static InitialContext getContext() {
        return (InitialContext) null;
    }

    public static void setQConnFactory(ConnectionFactory qConnFactory) {
        return;
    }

    public static ConnectionFactory getQConnFactory() {
        return (ConnectionFactory) null;
    }

    public static void setBrokerQueue(Queue brokerQueue) {
        return;
    }

    public static Queue getBrokerQueue() {
        return (Queue) null;
    }

    public static void setTConnFactory(ConnectionFactory tConnFactory) {
        return;
    }

    public static ConnectionFactory getTConnFactory() {
        return (ConnectionFactory) null;
    }

    public static void setStreamerTopic(Topic streamerTopic) {
        return;
    }

    public static Topic getStreamerTopic() {
        return (Topic) null;
    }

    public int id = 0;

    public static TradeDirect getObject(int id) {
        TradeDirect obj = (TradeDirect) new Object();
        obj.id = id;
        return obj;
    }
}

