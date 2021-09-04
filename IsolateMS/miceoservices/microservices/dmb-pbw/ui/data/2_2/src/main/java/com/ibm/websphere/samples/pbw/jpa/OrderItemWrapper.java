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
// (C) COPYRIGHT International Business Machines Corp., 2003,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
 * Bean mapping for the ORDERITEM table.
 */
@Entity(name = "OrderItem")
@Table(name = "ORDERITEM", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllOrderItem", query = "delete from OrderItem") })
public class OrderItemWrapper {

    /**
     * Composite Key class for Entity Bean: OrderItem
     *
     * Key consists of essentially two foreign key relations, but is mapped as foreign keys.
     */
    @Embeddable
    public static class PK implements java.io.Serializable {

        static final long serialVersionUID = 3206093459760846163L;

        @Column(name = "inventoryID")
        public String inventoryID;

        @Column(name = "ORDER_ORDERID")
        public String order_orderID;

        public PK() {
            Util.debug("OrderItem.PK()");
        }

        public PK(String inventoryID, String argOrder) {
            Util.debug("OrderItem.PK() inventoryID=" + inventoryID + "=");
            Util.debug("OrderItem.PK() orderID=" + argOrder + "=");
            this.inventoryID = inventoryID;
            this.order_orderID = argOrder;
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, OrderItemServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "orderitem")
    public  @ResponseBody int OrderItem() {
        OrderItemServer newServerObj = new OrderItemServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "orderitem")
    public  @ResponseBody int OrderItem(@RequestParam int invId) {
        OrderItemServer newServerObj = new OrderItemServer(Inventory.getObject(invId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "orderitem")
    public  @ResponseBody int OrderItem(@RequestParam int orderId, @RequestParam String orderID, @RequestParam int invId, @RequestParam java.lang.String name, @RequestParam java.lang.String pkginfo, @RequestParam float price, @RequestParam float cost, @RequestParam int quantity, @RequestParam int category, @RequestParam java.lang.String sellDate) {
        OrderItemServer newServerObj = new OrderItemServer(Order.getObject(orderId), orderID, Inventory.getObject(invId), name, pkginfo, price, cost, quantity, category, sellDate);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

