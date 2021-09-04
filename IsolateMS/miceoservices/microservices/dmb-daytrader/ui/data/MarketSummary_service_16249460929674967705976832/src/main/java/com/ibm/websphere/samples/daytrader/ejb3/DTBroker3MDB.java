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
package com.ibm.websphere.samples.daytrader.ejb3;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import com.ibm.websphere.samples.daytrader.TradeServices;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.MDBStats;
import com.ibm.websphere.samples.daytrader.util.TimerStat;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
@MessageDriven(activationConfig = { @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"), @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"), @ActivationConfigProperty(propertyName = "destination", propertyValue = "TradeBrokerQueue"), @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "NonDurable") })
public class DTBroker3MDB implements MessageListener {

    public DTBroker3MDB() {
        String uri = MicroserviceApplication.projectUri + "/ms5/dtbroker3mdb/dtbroker3mdbcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void onMessage(Message message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/dtbroker3mdb/onmessage?callerId=" + this.id + "&messageId=message.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    private TradeServices getTrade(boolean direct) throws Exception {
        return (TradeServices) null;
    }

    public MDBStats getMdbStats() {
        return (MDBStats) null;
    }

    public void setStatInterval(int statInterval) {
        return;
    }

    public int getStatInterval() {
        return (Integer) null;
    }

    public void setTradeSLSB(TradeSLSBLocal tradeSLSB) {
        return;
    }

    public TradeSLSBLocal getTradeSLSB() {
        return (TradeSLSBLocal) null;
    }

    public void setMdc(MessageDrivenContext mdc) {
        return;
    }

    public MessageDrivenContext getMdc() {
        return (MessageDrivenContext) null;
    }

    public int id = 0;

    public static DTBroker3MDB getObject(int id) {
        DTBroker3MDB obj = (DTBroker3MDB) new Object();
        obj.id = id;
        return obj;
    }
}

