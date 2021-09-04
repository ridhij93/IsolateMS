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
package com.ibm.websphere.samples.daytrader.direct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import com.ibm.websphere.samples.daytrader.util.KeyBlock;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms0/keysequencedirect/")
public class KeySequenceDirectWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getnextid")
    public static synchronized @ResponseBody ResponseEntity<Integer> getNextID(@RequestParam int connId, @RequestParam String keyName, @RequestParam boolean inSession, @RequestParam boolean inGlobalTxn) {
        try {
            Integer result = KeySequenceDirectServer.getNextID(Connection.getObject(connId), keyName, inSession, inGlobalTxn);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, KeySequenceDirectServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "keysequencedirect")
    public  @ResponseBody int KeySequenceDirect() {
        KeySequenceDirectServer newServerObj = new KeySequenceDirectServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

