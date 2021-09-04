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
@RequestMapping("/ms7/timerstat/")
public class TimerStatWrapper {

    /**
     * Returns the count.
     *
     * @return int
     */
    @RequestMapping(method = RequestMethod.GET, value = "getcount")
    public  @ResponseBody int getCount(@RequestParam int callerId) {
        TimerStatServer callerObj = idObjMap.get(callerId);
        int result = callerObj.getCount();
        return result;
    }

    /**
     * Returns the max in Secs
     *
     * @return double
     */
    @RequestMapping(method = RequestMethod.GET, value = "getmaxsecs")
    public  @ResponseBody double getMaxSecs(@RequestParam int callerId) {
        TimerStatServer callerObj = idObjMap.get(callerId);
        double result = callerObj.getMaxSecs();
        return result;
    }

    /**
     * Returns the min in Secs
     *
     * @return double
     */
    @RequestMapping(method = RequestMethod.GET, value = "getminsecs")
    public  @ResponseBody double getMinSecs(@RequestParam int callerId) {
        TimerStatServer callerObj = idObjMap.get(callerId);
        double result = callerObj.getMinSecs();
        return result;
    }

    /**
     * Returns the average time in Secs
     *
     * @return double
     */
    @RequestMapping(method = RequestMethod.GET, value = "getavgsecs")
    public  @ResponseBody double getAvgSecs(@RequestParam int callerId) {
        TimerStatServer callerObj = idObjMap.get(callerId);
        double result = callerObj.getAvgSecs();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, TimerStatServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "timerstat")
    public  @ResponseBody int TimerStat() {
        TimerStatServer newServerObj = new TimerStatServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

