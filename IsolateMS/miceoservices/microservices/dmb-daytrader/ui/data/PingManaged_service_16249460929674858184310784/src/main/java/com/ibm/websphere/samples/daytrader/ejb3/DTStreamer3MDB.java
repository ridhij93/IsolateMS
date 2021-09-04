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
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.MDBStats;
import com.ibm.websphere.samples.daytrader.util.TimerStat;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.util.WebSocketJMSMessage;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
@MessageDriven(activationConfig = { @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"), @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"), @ActivationConfigProperty(propertyName = "destination", propertyValue = "TradeStreamerTopic"), @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "NonDurable") })
public class DTStreamer3MDB implements MessageListener {

    /**
     * Creates a new instance of TradeSteamerMDB
     */
    public DTStreamer3MDB() {
        String uri = MicroserviceApplication.projectUri + "/ms4/dtstreamer3mdb/dtstreamer3mdbcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void onMessage(Message message) {
        String uri = MicroserviceApplication.projectUri + "/ms4/dtstreamer3mdb/onmessage?callerId=" + this.id + "&messageId=message.id";
        new RestTemplate().getForObject(uri, void.class);
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

    public void setMdc(MessageDrivenContext mdc) {
        return;
    }

    public MessageDrivenContext getMdc() {
        return (MessageDrivenContext) null;
    }

    public void setJmsEvent(Event<Message> jmsEvent) {
        return;
    }

    public Event<Message> getJmsEvent() {
        return (Event<Message>) null;
    }

    public int id = 0;

    public static DTStreamer3MDB getObject(int id) {
        DTStreamer3MDB obj = (DTStreamer3MDB) new Object();
        obj.id = id;
        return obj;
    }
}

