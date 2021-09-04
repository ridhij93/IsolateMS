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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TradeSLSBBeanWrapper {

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
    @RequestMapping(method = RequestMethod.GET, value = "getorders")
    public @ResponseBody Integer getOrders(@RequestParam int callerId, @RequestParam String userID) {
        TradeSLSBBeanServer callerObj = idObjMap.get(callerId);
        Collection<OrderDataBean> result = callerObj.getOrders(userID);
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getquote")
    public @ResponseBody Integer getQuote(@RequestParam int callerId, @RequestParam String symbol) {
        TradeSLSBBeanServer callerObj = idObjMap.get(callerId);
        QuoteDataBean result = callerObj.getQuote(symbol);
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getholdings")
    public @ResponseBody Integer getHoldings(@RequestParam int callerId, @RequestParam String userID) {
        TradeSLSBBeanServer callerObj = idObjMap.get(callerId);
        Collection<HoldingDataBean> result = callerObj.getHoldings(userID);
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaccountprofiledata")
    public @ResponseBody Integer getAccountProfileData(@RequestParam int callerId, @RequestParam String userID) {
        TradeSLSBBeanServer callerObj = idObjMap.get(callerId);
        AccountProfileDataBean result = callerObj.getAccountProfileData(userID);
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "pingtwophase")
    public @ResponseBody ResponseEntity<Integer> pingTwoPhase(@RequestParam int callerId, @RequestParam String symbol) {
        try {
            TradeSLSBBeanServer callerObj = idObjMap.get(callerId);
            QuoteDataBean result = callerObj.pingTwoPhase(symbol);
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    class quotePriceComparator implements Comparator<Object> {
    }

    private static int maxId = 0;

    public static HashMap<Integer, TradeSLSBBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradeslsbbean")
    public  @ResponseBody int TradeSLSBBean() {
        TradeSLSBBeanServer newServerObj = new TradeSLSBBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

