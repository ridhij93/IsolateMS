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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.jms.Message;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * This class is a holds the last 5 stock changes, used by the MarketSummary WebSocket
 */
public class RecentStockChangeList {

    public static void addStockChange(Message message) {
        String uri = MicroserviceApplication.projectUri + "/ms8/recentstockchangelist/addstockchange?messageId=message.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    public static JsonObject stockChangesInJSON() {
        String uri = MicroserviceApplication.projectUri + "/ms8/recentstockchangelist/stockchangesinjson";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        JsonObject result = JsonObject.getObject(resultTemp);
        return result;
    }

    public static boolean isEmpty() {
        String uri = MicroserviceApplication.projectUri + "/ms8/recentstockchangelist/isempty";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public static void setStockChanges(List<Message> stockChanges) {
        return;
    }

    public static List<Message> getStockChanges() {
        return (List<Message>) null;
    }

    public int id = 0;

    public static RecentStockChangeList getObject(int id) {
        RecentStockChangeList obj = (RecentStockChangeList) new Object();
        obj.id = id;
        return obj;
    }
}

