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
package com.ibm.websphere.samples.daytrader.util;

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
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
@Controller
@RequestMapping("/ms7/mdbstats/")
public class MDBStatsWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getinstance")
    public static synchronized @ResponseBody Integer getInstance() {
        MDBStats result = MDBStatsServer.getInstance();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "addtiming")
    public @ResponseBody Integer addTiming(@RequestParam int callerId, @RequestParam String type, @RequestParam long sendTime, @RequestParam long recvTime) {
        MDBStatsServer callerObj = idObjMap.get(callerId);
        TimerStat result = callerObj.addTiming(type, sendTime, recvTime);
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "reset")
    public synchronized @ResponseBody ResponseEntity<Void> reset(@RequestParam int callerId) {
        MDBStatsServer callerObj = idObjMap.get(callerId);
        callerObj.reset();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, MDBStatsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mdbstats")
    public  @ResponseBody int MDBStats() {
        MDBStatsServer newServerObj = new MDBStatsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

