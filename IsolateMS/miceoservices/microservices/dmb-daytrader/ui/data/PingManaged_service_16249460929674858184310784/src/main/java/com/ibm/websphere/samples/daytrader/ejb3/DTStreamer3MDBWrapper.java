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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
@MessageDriven(activationConfig = { @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"), @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"), @ActivationConfigProperty(propertyName = "destination", propertyValue = "TradeStreamerTopic"), @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "NonDurable") })
public class DTStreamer3MDBWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "onmessage")
    public @ResponseBody ResponseEntity<Void> onMessage(@RequestParam int callerId, @RequestParam int messageId) {
        DTStreamer3MDBServer callerObj = idObjMap.get(callerId);
        callerObj.onMessage(Message.getObject(messageId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, DTStreamer3MDBServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dtstreamer3mdb")
    public  @ResponseBody int DTStreamer3MDB() {
        DTStreamer3MDBServer newServerObj = new DTStreamer3MDBServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

