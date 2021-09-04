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
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
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

@Entity(name = "holdingejb")
@Table(name = "holdingejb")
public class HoldingDataBeanWrapper {

    /* persistent/relationship fields */
    /* holdingID */
    /* quantity */
    /* purchasePrice */
    /* purchaseDate */
    /* Holding(*) ---> Quote(1) */
    @RequestMapping(method = RequestMethod.GET, value = "tohtml")
    public @ResponseBody String toHTML(@RequestParam int callerId) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.toHTML();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getholdingid")
    public @ResponseBody Integer getHoldingID(@RequestParam int callerId) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        Integer result = callerObj.getHoldingID();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getquantity")
    public  @ResponseBody double getQuantity(@RequestParam int callerId) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        double result = callerObj.getQuantity();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpurchaseprice")
    public @ResponseBody BigDecimal getPurchasePrice(@RequestParam int callerId) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getPurchasePrice();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpurchasedate")
    public @ResponseBody Date getPurchaseDate(@RequestParam int callerId) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        Date result = callerObj.getPurchaseDate();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setpurchasedate")
    public @ResponseBody ResponseEntity<Void> setPurchaseDate(@RequestParam int callerId, @RequestParam Date purchaseDate) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setPurchaseDate(purchaseDate);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getquoteid")
    public @ResponseBody String getQuoteID(@RequestParam int callerId) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getQuoteID();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getquote")
    public @ResponseBody Integer getQuote(@RequestParam int callerId) {
        HoldingDataBeanServer callerObj = idObjMap.get(callerId);
        QuoteDataBean result = callerObj.getQuote();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, HoldingDataBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "holdingdatabean")
    public  @ResponseBody int HoldingDataBean() {
        HoldingDataBeanServer newServerObj = new HoldingDataBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "holdingdatabean")
    public  @ResponseBody int HoldingDataBean(@RequestParam Integer holdingID, @RequestParam double quantity, @RequestParam BigDecimal purchasePrice, @RequestParam Date purchaseDate, @RequestParam String quoteID) {
        HoldingDataBeanServer newServerObj = new HoldingDataBeanServer(holdingID, quantity, purchasePrice, purchaseDate, quoteID);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "holdingdatabean")
    public  @ResponseBody int HoldingDataBean(@RequestParam double quantity, @RequestParam BigDecimal purchasePrice, @RequestParam Date purchaseDate, @RequestParam int accountId, @RequestParam int quoteId) {
        HoldingDataBeanServer newServerObj = new HoldingDataBeanServer(quantity, purchasePrice, purchaseDate, AccountDataBean.getObject(accountId), QuoteDataBean.getObject(quoteId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

