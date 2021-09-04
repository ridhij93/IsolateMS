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
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import javax.enterprise.event.Observes;
import javax.jms.Message;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.WebSocketJMSMessage;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * This class is a WebSocket EndPoint that sends the Market Summary in JSON form when requested
 *  and sends stock price changes when received from an MDB through a CDI event
 */
@ServerEndpoint(value = "/marketsummary", decoders = ActionDecoder.class)
public class MarketSummaryWebSocket {

    @OnOpen
    public void onOpen(final Session session, EndpointConfig ec) {
        return;
    }

    @OnMessage
    public void sendMarketSummary(ActionMessage message, Session currentSession) {
        return;
    }

    @OnError
    public void onError(Throwable t, Session currentSession) {
        return;
    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
        return;
    }

    public static void onJMSMessage(@Observes @WebSocketJMSMessage Message message) {
        return;
    }

    private JsonObject mergeJsonObjects(JsonObject obj1, JsonObject obj2) {
        return (JsonObject) null;
    }

    public static Set<Session> getSessions() {
        return (Set<Session>) null;
    }

    public CountDownLatch getLatch() {
        return (CountDownLatch) null;
    }

    public int id = 0;

    public static MarketSummaryWebSocket getObject(int id) {
        MarketSummaryWebSocket obj = (MarketSummaryWebSocket) new Object();
        obj.id = id;
        return obj;
    }
}

