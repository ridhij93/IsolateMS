/**
 * (C) Copyright IBM Corporation 2016.
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
 * Simple bean to get and set messages
 */
@Controller
@RequestMapping("/ms3/pingbean/")
public class PingBeanWrapper {

    /**
     * sets the message contained in the bean param message String
     */
    @RequestMapping(method = RequestMethod.GET, value = "setmsg")
    public @ResponseBody ResponseEntity<Void> setMsg(@RequestParam int callerId, @RequestParam String s) {
        PingBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setMsg(s);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, PingBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pingbean")
    public  @ResponseBody int PingBean() {
        PingBeanServer newServerObj = new PingBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

