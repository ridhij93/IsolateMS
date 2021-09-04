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
// import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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

@Entity(name = "orderejb")
@Table(name = "orderejb")
@NamedQueries({ @NamedQuery(name = "orderejb.findByOrderfee", query = "SELECT o FROM orderejb o WHERE o.orderFee = :orderfee"), @NamedQuery(name = "orderejb.findByCompletiondate", query = "SELECT o FROM orderejb o WHERE o.completionDate = :completiondate"), @NamedQuery(name = "orderejb.findByOrdertype", query = "SELECT o FROM orderejb o WHERE o.orderType = :ordertype"), @NamedQuery(name = "orderejb.findByOrderstatus", query = "SELECT o FROM orderejb o WHERE o.orderStatus = :orderstatus"), @NamedQuery(name = "orderejb.findByPrice", query = "SELECT o FROM orderejb o WHERE o.price = :price"), @NamedQuery(name = "orderejb.findByQuantity", query = "SELECT o FROM orderejb o WHERE o.quantity = :quantity"), @NamedQuery(name = "orderejb.findByOpendate", query = "SELECT o FROM orderejb o WHERE o.openDate = :opendate"), @NamedQuery(name = "orderejb.findByOrderid", query = "SELECT o FROM orderejb o WHERE o.orderID = :orderid"), @NamedQuery(name = "orderejb.findByAccountAccountid", query = "SELECT o FROM orderejb o WHERE o.account.accountID = :accountAccountid"), @NamedQuery(name = "orderejb.findByQuoteSymbol", query = "SELECT o FROM orderejb o WHERE o.quote.symbol = :quoteSymbol"), @NamedQuery(name = "orderejb.findByHoldingHoldingid", query = "SELECT o FROM orderejb o WHERE o.holding.holdingID = :holdingHoldingid"), @NamedQuery(name = "orderejb.closedOrders", query = "SELECT o FROM orderejb o WHERE o.orderStatus = 'closed' AND o.account.profile.userID  = :userID"), @NamedQuery(name = "orderejb.completeClosedOrders", query = "UPDATE orderejb o SET o.orderStatus = 'completed' WHERE o.orderStatus = 'closed' AND o.account.profile.userID  = :userID") })
public class OrderDataBeanWrapper {

    /* orderID */
    /* orderType (buy, sell, etc.) */
    /*
                                 * orderStatus (open, processing, completed,
                                 * closed, cancelled)
                                 */
    /* openDate (when the order was entered) */
    /* completionDate */
    /* quantity */
    /* price */
    /* price */
    @RequestMapping(method = RequestMethod.GET, value = "tohtml")
    public @ResponseBody String toHTML(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.toHTML();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getorderid")
    public @ResponseBody Integer getOrderID(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        Integer result = callerObj.getOrderID();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getordertype")
    public @ResponseBody String getOrderType(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getOrderType();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getorderstatus")
    public @ResponseBody String getOrderStatus(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getOrderStatus();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setorderstatus")
    public @ResponseBody ResponseEntity<Void> setOrderStatus(@RequestParam int callerId, @RequestParam String orderStatus) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setOrderStatus(orderStatus);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getopendate")
    public @ResponseBody Date getOpenDate(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        Date result = callerObj.getOpenDate();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcompletiondate")
    public @ResponseBody Date getCompletionDate(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        Date result = callerObj.getCompletionDate();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setcompletiondate")
    public @ResponseBody ResponseEntity<Void> setCompletionDate(@RequestParam int callerId, @RequestParam Date completionDate) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setCompletionDate(completionDate);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getquantity")
    public  @ResponseBody double getQuantity(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        double result = callerObj.getQuantity();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getprice")
    public @ResponseBody BigDecimal getPrice(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getPrice();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getorderfee")
    public @ResponseBody BigDecimal getOrderFee(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getOrderFee();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getsymbol")
    public @ResponseBody String getSymbol(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSymbol();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaccount")
    public @ResponseBody Integer getAccount(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        AccountDataBean result = callerObj.getAccount();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getquote")
    public @ResponseBody Integer getQuote(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        QuoteDataBean result = callerObj.getQuote();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getholding")
    public @ResponseBody Integer getHolding(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        HoldingDataBean result = callerObj.getHolding();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setholding")
    public @ResponseBody ResponseEntity<Void> setHolding(@RequestParam int callerId, @RequestParam int holdingId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setHolding(HoldingDataBean.getObject(holdingId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "isbuy")
    public  @ResponseBody boolean isBuy(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        boolean result = callerObj.isBuy();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "issell")
    public  @ResponseBody boolean isSell(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        boolean result = callerObj.isSell();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "iscompleted")
    public  @ResponseBody boolean isCompleted(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        boolean result = callerObj.isCompleted();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "cancel")
    public @ResponseBody ResponseEntity<Void> cancel(@RequestParam int callerId) {
        OrderDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.cancel();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, OrderDataBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "orderdatabean")
    public  @ResponseBody int OrderDataBean() {
        OrderDataBeanServer newServerObj = new OrderDataBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "orderdatabean")
    public  @ResponseBody int OrderDataBean(@RequestParam Integer orderID, @RequestParam String orderType, @RequestParam String orderStatus, @RequestParam Date openDate, @RequestParam Date completionDate, @RequestParam double quantity, @RequestParam BigDecimal price, @RequestParam BigDecimal orderFee, @RequestParam String symbol) {
        OrderDataBeanServer newServerObj = new OrderDataBeanServer(orderID, orderType, orderStatus, openDate, completionDate, quantity, price, orderFee, symbol);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "orderdatabean")
    public  @ResponseBody int OrderDataBean(@RequestParam String orderType, @RequestParam String orderStatus, @RequestParam Date openDate, @RequestParam Date completionDate, @RequestParam double quantity, @RequestParam BigDecimal price, @RequestParam BigDecimal orderFee, @RequestParam int accountId, @RequestParam int quoteId, @RequestParam int holdingId) {
        OrderDataBeanServer newServerObj = new OrderDataBeanServer(orderType, orderStatus, openDate, completionDate, quantity, price, orderFee, AccountDataBean.getObject(accountId), QuoteDataBean.getObject(quoteId), HoldingDataBean.getObject(holdingId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

