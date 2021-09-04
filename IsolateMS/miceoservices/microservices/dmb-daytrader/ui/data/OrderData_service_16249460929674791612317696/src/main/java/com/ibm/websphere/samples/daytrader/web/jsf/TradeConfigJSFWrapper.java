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
package com.ibm.websphere.samples.daytrader.web.jsf;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.web.TradeBuildDB;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Named("tradeconfig")
@RequestScoped
public class TradeConfigJSFWrapper {

    // private String cachingType = TradeConfig.cachingTypeNames[TradeConfig.getCachingType()];
    @RequestMapping(method = RequestMethod.GET, value = "updateconfig")
    public @ResponseBody ResponseEntity<Void> updateConfig(@RequestParam int callerId) {
        TradeConfigJSFServer callerObj = idObjMap.get(callerId);
        callerObj.updateConfig();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "resettrade")
    public @ResponseBody String resetTrade(@RequestParam int callerId) {
        TradeConfigJSFServer callerObj = idObjMap.get(callerId);
        String result = callerObj.resetTrade();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "populatedatabase")
    public @ResponseBody String populateDatabase(@RequestParam int callerId) {
        TradeConfigJSFServer callerObj = idObjMap.get(callerId);
        String result = callerObj.populateDatabase();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "builddatabasetables")
    public @ResponseBody String buildDatabaseTables(@RequestParam int callerId) {
        TradeConfigJSFServer callerObj = idObjMap.get(callerId);
        String result = callerObj.buildDatabaseTables();
        return result;
    }

    /*
    public void setCachingType(String cachingType) {
        this.cachingType = cachingType;
    }

    public String getCachingType() {
        return cachingType;
    }

    public void setDistributedMapCacheSize(int distributedMapCacheSize) {
        this.distributedMapCacheSize = distributedMapCacheSize;
    }

    public int getDistributedMapCacheSize() {
        return distributedMapCacheSize;
    }*/
    /*public void setCachingTypeList(String[] cachingTypeList) {
        this.cachingTypeList = cachingTypeList;
    }

    public String[] getCachingTypeList() {
        return cachingTypeList;
    }*/
    private static int maxId = 0;

    public static HashMap<Integer, TradeConfigJSFServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradeconfigjsf")
    public  @ResponseBody int TradeConfigJSF() {
        TradeConfigJSFServer newServerObj = new TradeConfigJSFServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    /*
    public void setCachingType(String cachingType) {
        this.cachingType = cachingType;
    }

    public String getCachingType() {
        return cachingType;
    }

    public void setDistributedMapCacheSize(int distributedMapCacheSize) {
        this.distributedMapCacheSize = distributedMapCacheSize;
    }

    public int getDistributedMapCacheSize() {
        return distributedMapCacheSize;
    }*/
    /*public void setCachingTypeList(String[] cachingTypeList) {
        this.cachingTypeList = cachingTypeList;
    }

    public String[] getCachingTypeList() {
        return cachingTypeList;
    }*/
}

