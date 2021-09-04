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
 * This class is a WebSocket EndPoint that sends the Market Summary in JSON form when requested
 *  and sends stock price changes when received from an MDB through a CDI event
 */
@ServerEndpoint(value = "/marketsummary", decoders = ActionDecoder.class)
public class MarketSummaryWebSocketWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MarketSummaryWebSocketServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "marketsummarywebsocket")
    public  @ResponseBody int MarketSummaryWebSocket() {
        MarketSummaryWebSocketServer newServerObj = new MarketSummaryWebSocketServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

