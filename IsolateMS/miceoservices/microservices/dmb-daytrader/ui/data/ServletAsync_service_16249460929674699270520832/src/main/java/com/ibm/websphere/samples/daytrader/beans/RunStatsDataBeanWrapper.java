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
package com.ibm.websphere.samples.daytrader.beans;

import java.io.Serializable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms0/runstatsdatabean/")
public class RunStatsDataBeanWrapper {

    // count of new registered users in this run (users w/ userID like 'ru:%')
    /**
     * Sets the tradeUserCount
     *
     * @param tradeUserCount
     *            The tradeUserCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "settradeusercount")
    public @ResponseBody ResponseEntity<Void> setTradeUserCount(@RequestParam int callerId, @RequestParam int tradeUserCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setTradeUserCount(tradeUserCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the newUserCount
     *
     * @param newUserCount
     *            The newUserCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setnewusercount")
    public @ResponseBody ResponseEntity<Void> setNewUserCount(@RequestParam int callerId, @RequestParam int newUserCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setNewUserCount(newUserCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the sumLoginCount
     *
     * @param sumLoginCount
     *            The sumLoginCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setsumlogincount")
    public @ResponseBody ResponseEntity<Void> setSumLoginCount(@RequestParam int callerId, @RequestParam int sumLoginCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setSumLoginCount(sumLoginCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the sumLogoutCount
     *
     * @param sumLogoutCount
     *            The sumLogoutCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setsumlogoutcount")
    public @ResponseBody ResponseEntity<Void> setSumLogoutCount(@RequestParam int callerId, @RequestParam int sumLogoutCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setSumLogoutCount(sumLogoutCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the holdingCount
     *
     * @param holdingCount
     *            The holdingCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setholdingcount")
    public @ResponseBody ResponseEntity<Void> setHoldingCount(@RequestParam int callerId, @RequestParam int holdingCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setHoldingCount(holdingCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the buyOrderCount
     *
     * @param buyOrderCount
     *            The buyOrderCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setbuyordercount")
    public @ResponseBody ResponseEntity<Void> setBuyOrderCount(@RequestParam int callerId, @RequestParam int buyOrderCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setBuyOrderCount(buyOrderCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the sellOrderCount
     *
     * @param sellOrderCount
     *            The sellOrderCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setsellordercount")
    public @ResponseBody ResponseEntity<Void> setSellOrderCount(@RequestParam int callerId, @RequestParam int sellOrderCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setSellOrderCount(sellOrderCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the cancelledOrderCount
     *
     * @param cancelledOrderCount
     *            The cancelledOrderCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setcancelledordercount")
    public @ResponseBody ResponseEntity<Void> setCancelledOrderCount(@RequestParam int callerId, @RequestParam int cancelledOrderCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setCancelledOrderCount(cancelledOrderCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the openOrderCount
     *
     * @param openOrderCount
     *            The openOrderCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setopenordercount")
    public @ResponseBody ResponseEntity<Void> setOpenOrderCount(@RequestParam int callerId, @RequestParam int openOrderCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setOpenOrderCount(openOrderCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the deletedOrderCount
     *
     * @param deletedOrderCount
     *            The deletedOrderCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setdeletedordercount")
    public @ResponseBody ResponseEntity<Void> setDeletedOrderCount(@RequestParam int callerId, @RequestParam int deletedOrderCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setDeletedOrderCount(deletedOrderCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the orderCount
     *
     * @param orderCount
     *            The orderCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "setordercount")
    public @ResponseBody ResponseEntity<Void> setOrderCount(@RequestParam int callerId, @RequestParam int orderCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setOrderCount(orderCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Sets the tradeStockCount
     *
     * @param tradeStockCount
     *            The tradeStockCount to set
     */
    @RequestMapping(method = RequestMethod.GET, value = "settradestockcount")
    public @ResponseBody ResponseEntity<Void> setTradeStockCount(@RequestParam int callerId, @RequestParam int tradeStockCount) {
        RunStatsDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setTradeStockCount(tradeStockCount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, RunStatsDataBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "runstatsdatabean")
    public  @ResponseBody int RunStatsDataBean() {
        RunStatsDataBeanServer newServerObj = new RunStatsDataBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

