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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Bean mapping for the ORDERITEM table.
 */
@Entity(name = "OrderItem")
@Table(name = "ORDERITEM", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllOrderItem", query = "delete from OrderItem") })
public class OrderItem {

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
            String uri = MicroserviceApplication.projectUri + "/msnull/pk/pkcallerId=" + this.id + "";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        public PK(String inventoryID, String argOrder) {
            String uri = MicroserviceApplication.projectUri + "/msnull/pk/pk?callerId=" + this.id + "&inventoryID=inventoryID&argOrder=argOrder";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        /**
         * Returns true if both keys are equal.
         */
        public boolean equals(java.lang.Object otherKey) {
            return (Boolean) null;
        }

        /**
         * Returns the hash code for the key.
         */
        public int hashCode() {
            return (Integer) null;
        }
    }

    public int getCategory() {
        return (Integer) null;
    }

    public void setCategory(int category) {
        return;
    }

    public float getCost() {
        return (Float) null;
    }

    public void setCost(float cost) {
        return;
    }

    public String getName() {
        return (String) null;
    }

    public void setName(String name) {
        return;
    }

    public String getPkginfo() {
        return (String) null;
    }

    public void setPkginfo(String pkginfo) {
        return;
    }

    public float getPrice() {
        return (Float) null;
    }

    public void setPrice(float price) {
        return;
    }

    public int getQuantity() {
        return (Integer) null;
    }

    public void setQuantity(int quantity) {
        return;
    }

    public String getSellDate() {
        return (String) null;
    }

    public void setSellDate(String sellDate) {
        return;
    }

    public OrderItem() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderitem/orderitemcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public OrderItem(Inventory inv) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderitem/orderitem?callerId=" + this.id + "&invId=inv.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public OrderItem(Order order, String orderID, Inventory inv, java.lang.String name, java.lang.String pkginfo, float price, float cost, int quantity, int category, java.lang.String sellDate) {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderitem/orderitem?callerId=" + this.id + "&orderId=order.id&orderID=orderID&invId=inv.id&name=name&pkginfo=pkginfo&price=price&cost=cost&quantity=quantity&category=category&sellDate=sellDate";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /*
	 * updates the primary key field with the composite orderId+inventoryId
	 */
    public void updatePK() {
        return;
    }

    public Inventory getInventory() {
        return (Inventory) null;
    }

    public void setInventory(Inventory inv) {
        return;
    }

    public Order getOrder() {
        return (Order) null;
    }

    /**
     * Sets the order for this item Also updates the sellDate
     *
     * @param order
     */
    public void setOrder(Order order) {
        return;
    }

    public String getInventoryId() {
        return (String) null;
    }

    public void setInventoryId(String inventoryId) {
        return;
    }

    public void setId(OrderItem.PK id) {
        return;
    }

    public OrderItem.PK getId() {
        return (PK) null;
    }

    public int id = 0;

    public static OrderItem getObject(int id) {
        OrderItem obj = (OrderItem) new Object();
        obj.id = id;
        return obj;
    }
}

