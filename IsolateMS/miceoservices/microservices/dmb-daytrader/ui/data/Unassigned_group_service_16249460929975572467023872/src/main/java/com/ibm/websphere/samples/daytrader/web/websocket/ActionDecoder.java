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

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

// This is coded to be a Text type decoder expecting JSON format.
// It will decode incoming messages into object of type String
public class ActionDecoder implements Decoder.Text<ActionMessage> {

    public ActionDecoder() {
        String uri = MicroserviceApplication.projectUri + "/ms8/actiondecoder/actiondecodercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void destroy() {
        return;
    }

    @Override
    public void init(EndpointConfig config) {
        return;
    }

    @Override
    public ActionMessage decode(String jsonText) throws DecodeException {
        return (ActionMessage) null;
    }

    @Override
    public boolean willDecode(String s) {
        return (Boolean) null;
    }

    public int id = 0;

    public static ActionDecoder getObject(int id) {
        ActionDecoder obj = (ActionDecoder) new Object();
        obj.id = id;
        return obj;
    }
}

