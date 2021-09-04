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
 * This class is a holds the last 5 stock changes, used by the MarketSummary WebSocket
 */
@Controller
@RequestMapping("/ms8/recentstockchangelist/")
public class RecentStockChangeListWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "addstockchange")
    public static @ResponseBody ResponseEntity<Void> addStockChange(@RequestParam int messageId) {
        RecentStockChangeListServer.addStockChange(Message.getObject(messageId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "stockchangesinjson")
    public static @ResponseBody Integer stockChangesInJSON() {
        JsonObject result = RecentStockChangeListServer.stockChangesInJSON();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "isempty")
    public static  @ResponseBody boolean isEmpty() {
        boolean result = RecentStockChangeListServer.isEmpty();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, RecentStockChangeListServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "recentstockchangelist")
    public  @ResponseBody int RecentStockChangeList() {
        RecentStockChangeListServer newServerObj = new RecentStockChangeListServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

