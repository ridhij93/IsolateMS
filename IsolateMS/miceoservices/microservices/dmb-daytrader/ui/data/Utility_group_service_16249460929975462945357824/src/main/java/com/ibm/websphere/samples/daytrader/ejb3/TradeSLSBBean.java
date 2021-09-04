/**
 * (C) Copyright IBM Corporation 2015, 2021
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
package com.ibm.websphere.samples.daytrader.ejb3;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnectionFactory;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.RollbackException;
import com.ibm.websphere.samples.daytrader.TradeAction;
// import com.ibm.websphere.samples.daytrader.TradeServices;
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
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TradeSLSBBean implements TradeSLSBRemote, TradeSLSBLocal {

    /* JBoss 
    @Resource(name = "java:/jms/QueueConnectionFactory", authenticationType = javax.annotation.Resource.AuthenticationType.APPLICATION)
    private QueueConnectionFactory queueConnectionFactory;

    @Resource(name = "java:/jms/TopicConnectionFactory", authenticationType = javax.annotation.Resource.AuthenticationType.APPLICATION)
    private TopicConnectionFactory topicConnectionFactory;

    @Resource(lookup = "java:/jms/TradeStreamerTopic")
    private Topic tradeStreamerTopic;
        
    @Resource(lookup = "java:/jms/TradeBrokerQueue")
    private Queue tradeBrokerQueue;
    */
    /**
     * Creates a new instance of TradeSLSBBean
     */
    public TradeSLSBBean() {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradeslsbbean/tradeslsbbeancallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public MarketSummaryDataBean getMarketSummary() {
        return (MarketSummaryDataBean) null;
    }

    @Override
    public OrderDataBean buy(String userID, String symbol, double quantity, int orderProcessingMode) {
        return (OrderDataBean) null;
    }

    @Override
    public OrderDataBean sell(final String userID, final Integer holdingID, int orderProcessingMode) {
        return (OrderDataBean) null;
    }

    @Override
    public void queueOrder(Integer orderID, boolean twoPhase) {
        return;
    }

    @Override
    public OrderDataBean completeOrder(Integer orderID, boolean twoPhase) throws Exception {
        return (OrderDataBean) null;
    }

    @Override
    public void cancelOrder(Integer orderID, boolean twoPhase) {
        return;
    }

    @Override
    public void orderCompleted(String userID, Integer orderID) {
        return;
    }

    @Override
    public Collection<OrderDataBean> getOrders(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradeslsbbean/getorders?callerId=" + this.id + "&userID=userID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Collection<OrderDataBean> result = (Collection<OrderDataBean>) new Object();
        return result;
    }

    @Override
    public Collection<OrderDataBean> getClosedOrders(String userID) {
        return (Collection) null;
    }

    @Override
    public QuoteDataBean createQuote(String symbol, String companyName, BigDecimal price) {
        return (QuoteDataBean) null;
    }

    @Override
    public QuoteDataBean getQuote(String symbol) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradeslsbbean/getquote?callerId=" + this.id + "&symbol=symbol";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        QuoteDataBean result = QuoteDataBean.getObject(resultTemp);
        return result;
    }

    @Override
    public Collection<QuoteDataBean> getAllQuotes() {
        return (Collection) null;
    }

    @Override
    public QuoteDataBean updateQuotePriceVolume(String symbol, BigDecimal changeFactor, double sharesTraded) {
        return (QuoteDataBean) null;
    }

    @Override
    public Collection<HoldingDataBean> getHoldings(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradeslsbbean/getholdings?callerId=" + this.id + "&userID=userID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Collection<HoldingDataBean> result = (Collection<HoldingDataBean>) new Object();
        return result;
    }

    @Override
    public HoldingDataBean getHolding(Integer holdingID) {
        return (HoldingDataBean) null;
    }

    @Override
    public AccountDataBean getAccountData(String userID) {
        return (AccountDataBean) null;
    }

    @Override
    public AccountProfileDataBean getAccountProfileData(String userID) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradeslsbbean/getaccountprofiledata?callerId=" + this.id + "&userID=userID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        AccountProfileDataBean result = AccountProfileDataBean.getObject(resultTemp);
        return result;
    }

    @Override
    public AccountProfileDataBean updateAccountProfile(AccountProfileDataBean profileData) {
        return (AccountProfileDataBean) null;
    }

    @Override
    public AccountDataBean login(String userID, String password) throws RollbackException {
        return (AccountDataBean) null;
    }

    @Override
    public void logout(String userID) {
        return;
    }

    @Override
    public AccountDataBean register(String userID, String password, String fullname, String address, String email, String creditcard, BigDecimal openBalance) {
        return (AccountDataBean) null;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public RunStatsDataBean resetTrade(boolean deleteAll) throws Exception {
        return (RunStatsDataBean) null;
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void publishQuotePriceChange(QuoteDataBean quote, BigDecimal oldPrice, BigDecimal changeFactor, double sharesTraded) {
        return;
    }

    private OrderDataBean createOrder(AccountDataBean account, QuoteDataBean quote, HoldingDataBean holding, String orderType, double quantity) {
        return (OrderDataBean) null;
    }

    private HoldingDataBean createHolding(AccountDataBean account, QuoteDataBean quote, double quantity, BigDecimal purchasePrice) throws Exception {
        return (HoldingDataBean) null;
    }

    public double investmentReturn(double investment, double NetValue) throws Exception {
        return (Double) null;
    }

    public QuoteDataBean pingTwoPhase(String symbol) {
        String uri = MicroserviceApplication.projectUri + "/ms1/tradeslsbbean/pingtwophase?callerId=" + this.id + "&symbol=symbol";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        QuoteDataBean result = QuoteDataBean.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (QuoteDataBean) null;
    }

    class quotePriceComparator implements Comparator<Object> {

        @Override
        public int compare(Object quote1, Object quote2) {
            return (Integer) null;
        }
    }

    @PostConstruct
    public void postConstruct() {
        return;
    }

    public void setQueueConnectionFactory(QueueConnectionFactory queueConnectionFactory) {
        return;
    }

    public QueueConnectionFactory getQueueConnectionFactory() {
        return (QueueConnectionFactory) null;
    }

    public void setTopicConnectionFactory(TopicConnectionFactory topicConnectionFactory) {
        return;
    }

    public TopicConnectionFactory getTopicConnectionFactory() {
        return (TopicConnectionFactory) null;
    }

    public void setTradeStreamerTopic(Topic tradeStreamerTopic) {
        return;
    }

    public Topic getTradeStreamerTopic() {
        return (Topic) null;
    }

    public void setTradeBrokerQueue(Queue tradeBrokerQueue) {
        return;
    }

    public Queue getTradeBrokerQueue() {
        return (Queue) null;
    }

    public void setManagedThreadFactory(ManagedThreadFactory managedThreadFactory) {
        return;
    }

    public ManagedThreadFactory getManagedThreadFactory() {
        return (ManagedThreadFactory) null;
    }

    public void setEntityManager(EntityManager entityManager) {
        return;
    }

    public EntityManager getEntityManager() {
        return (EntityManager) null;
    }

    public void setContext(SessionContext context) {
        return;
    }

    public SessionContext getContext() {
        return (SessionContext) null;
    }

    public void setMarketSummarySingleton(MarketSummarySingleton marketSummarySingleton) {
        return;
    }

    public MarketSummarySingleton getMarketSummarySingleton() {
        return (MarketSummarySingleton) null;
    }

    public int id = 0;

    public static TradeSLSBBean getObject(int id) {
        TradeSLSBBean obj = (TradeSLSBBean) new Object();
        obj.id = id;
        return obj;
    }
}

