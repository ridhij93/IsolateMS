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
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import com.ibm.websphere.samples.daytrader.web.websocket.JsonDecoder;
import com.ibm.websphere.samples.daytrader.web.websocket.JsonEncoder;
import com.ibm.websphere.samples.daytrader.web.websocket.JsonMessage;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * This class a simple websocket that sends the number of times it has been pinged.
 */
@ServerEndpoint(value = "/pingWebSocketJson", encoders = JsonEncoder.class, decoders = JsonDecoder.class)
public class PingWebSocketJson {

    @OnOpen
    public void onOpen(final Session session, EndpointConfig ec) {
        return;
    }

    @OnMessage
    public void ping(JsonMessage message) throws IOException {
        return;
    }

    @OnError
    public void onError(Throwable t) {
        return;
    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
        return;
    }

    public void setCurrentSession(Session currentSession) {
        return;
    }

    public Session getCurrentSession() {
        return (Session) null;
    }

    public void setSentHitCount(Integer sentHitCount) {
        return;
    }

    public Integer getSentHitCount() {
        return (Integer) null;
    }

    public void setReceivedHitCount(Integer receivedHitCount) {
        return;
    }

    public Integer getReceivedHitCount() {
        return (Integer) null;
    }

    public int id = 0;

    public static PingWebSocketJson getObject(int id) {
        PingWebSocketJson obj = (PingWebSocketJson) new Object();
        obj.id = id;
        return obj;
    }
}

