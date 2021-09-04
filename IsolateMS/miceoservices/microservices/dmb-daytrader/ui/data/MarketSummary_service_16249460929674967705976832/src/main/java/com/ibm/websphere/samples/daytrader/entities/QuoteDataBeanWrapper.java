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
package com.ibm.websphere.samples.daytrader.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Entity(name = "quoteejb")
@Table(name = "quoteejb")
@NamedQueries({ @NamedQuery(name = "quoteejb.allQuotes", query = "SELECT q FROM quoteejb q") })
@NamedNativeQueries({ @NamedNativeQuery(name = "quoteejb.quoteForUpdate", query = "select * from quoteejb q where q.symbol=? for update", resultClass = com.ibm.websphere.samples.daytrader.entities.QuoteDataBean.class) })
public class QuoteDataBeanWrapper {

    /* Accessor methods for persistent fields */
    /* symbol */
    /* companyName */
    /* volume */
    /* price */
    /* open1 price */
    /* low price */
    /* high price */
    /* price change */
    /* Accessor methods for relationship fields are not kept in the DataBean */
    @RequestMapping(method = RequestMethod.GET, value = "tohtml")
    public @ResponseBody String toHTML(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.toHTML();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getsymbol")
    public @ResponseBody String getSymbol(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSymbol();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcompanyname")
    public @ResponseBody String getCompanyName(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getCompanyName();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getprice")
    public @ResponseBody BigDecimal getPrice(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getPrice();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setprice")
    public @ResponseBody ResponseEntity<Void> setPrice(@RequestParam int callerId, @RequestParam BigDecimal price) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setPrice(price);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getopen")
    public @ResponseBody BigDecimal getOpen(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getOpen();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getlow")
    public @ResponseBody BigDecimal getLow(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getLow();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gethigh")
    public @ResponseBody BigDecimal getHigh(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getHigh();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setchange")
    public @ResponseBody ResponseEntity<Void> setChange(@RequestParam int callerId, @RequestParam double change) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setChange(change);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getvolume")
    public  @ResponseBody double getVolume(@RequestParam int callerId) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        double result = callerObj.getVolume();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setvolume")
    public @ResponseBody ResponseEntity<Void> setVolume(@RequestParam int callerId, @RequestParam double volume) {
        QuoteDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setVolume(volume);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, QuoteDataBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "quotedatabean")
    public  @ResponseBody int QuoteDataBean() {
        QuoteDataBeanServer newServerObj = new QuoteDataBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "quotedatabean")
    public  @ResponseBody int QuoteDataBean(@RequestParam String symbol, @RequestParam String companyName, @RequestParam double volume, @RequestParam BigDecimal price, @RequestParam BigDecimal open, @RequestParam BigDecimal low, @RequestParam BigDecimal high, @RequestParam double change) {
        QuoteDataBeanServer newServerObj = new QuoteDataBeanServer(symbol, companyName, volume, price, open, low, high, change);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "quotedatabean")
    public  @ResponseBody int QuoteDataBean(@RequestParam String symbol) {
        QuoteDataBeanServer newServerObj = new QuoteDataBeanServer(symbol);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

