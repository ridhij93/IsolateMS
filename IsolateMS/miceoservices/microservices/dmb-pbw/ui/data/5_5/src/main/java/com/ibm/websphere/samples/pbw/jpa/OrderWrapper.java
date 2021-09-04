// 
// COPYRIGHT LICENSE: This information contains sample code provided in source code form. You may copy,
// modify, and distribute these sample programs in any form without payment to IBM for the purposes of
// developing, using, marketing or distributing application programs conforming to the application
// programming interface for the operating platform for which the sample code is written.
// Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON AN "AS IS" BASIS
// AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED
// WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE,
// TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT,
// INDIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF THE
// SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS
// OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.
// 
// (C) COPYRIGHT International Business Machines Corp., 2001,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.jpa;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import com.ibm.websphere.samples.pbw.utils.Util;
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
 * Bean mapping for the ORDER1 table.
 */
@Entity(name = "Order")
@Table(name = "ORDER1", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllOrders", query = "delete from Order") })
public class OrderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, OrderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "order")
    public  @ResponseBody int Order(@RequestParam int customerId, @RequestParam String billName, @RequestParam String billAddr1, @RequestParam String billAddr2, @RequestParam String billCity, @RequestParam String billState, @RequestParam String billZip, @RequestParam String billPhone, @RequestParam String shipName, @RequestParam String shipAddr1, @RequestParam String shipAddr2, @RequestParam String shipCity, @RequestParam String shipState, @RequestParam String shipZip, @RequestParam String shipPhone, @RequestParam String creditCard, @RequestParam String ccNum, @RequestParam String ccExpireMonth, @RequestParam String ccExpireYear, @RequestParam String cardHolder, @RequestParam int shippingMethod, @RequestParam int itemsId) {
        OrderServer newServerObj = new OrderServer(Customer.getObject(customerId), billName, billAddr1, billAddr2, billCity, billState, billZip, billPhone, shipName, shipAddr1, shipAddr2, shipCity, shipState, shipZip, shipPhone, creditCard, ccNum, ccExpireMonth, ccExpireYear, cardHolder, shippingMethod, (Collection<OrderItem>) new Object());
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "order")
    public  @ResponseBody int Order(@RequestParam String orderID) {
        OrderServer newServerObj = new OrderServer(orderID);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "order")
    public  @ResponseBody int Order() {
        OrderServer newServerObj = new OrderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

