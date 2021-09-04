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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Bean mapping for BACKORDER table.
 */
@Entity(name = "BackOrder")
@Table(name = "BACKORDER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "findAllBackOrders", query = "select b from BackOrder b"), @NamedQuery(name = "findByInventoryID", query = "select b from BackOrder b where ((b.inventory.inventoryId = :id) and (b.status = 'Order Stock'))"), @NamedQuery(name = "removeAllBackOrder", query = "delete from BackOrder") })
public class BackOrder {

    public BackOrder() {
        String uri = MicroserviceApplication.projectUri + "/ms3/backorder/backordercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public BackOrder(String backOrderID) {
        String uri = MicroserviceApplication.projectUri + "/ms3/backorder/backorder?callerId=" + this.id + "&backOrderID=backOrderID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public BackOrder(Inventory inventory, int quantity) {
        String uri = MicroserviceApplication.projectUri + "/ms3/backorder/backorder?callerId=" + this.id + "&inventoryId=inventory.id&quantity=quantity";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getBackOrderID() {
        return (String) null;
    }

    public void setBackOrderID(String backOrderID) {
        return;
    }

    public long getLowDate() {
        return (Long) null;
    }

    public void setLowDate(long lowDate) {
        return;
    }

    public long getOrderDate() {
        return (Long) null;
    }

    public void setOrderDate(long orderDate) {
        return;
    }

    public int getQuantity() {
        return (Integer) null;
    }

    public void setQuantity(int quantity) {
        return;
    }

    public void increateQuantity(int delta) {
        return;
    }

    public String getStatus() {
        return (String) null;
    }

    public void setStatus(String status) {
        return;
    }

    public String getSupplierOrderID() {
        return (String) null;
    }

    public void setSupplierOrderID(String supplierOrderID) {
        return;
    }

    public Inventory getInventory() {
        return (Inventory) null;
    }

    public void setInventory(Inventory inventory) {
        return;
    }

    public int id = 0;

    public static BackOrder getObject(int id) {
        BackOrder obj = (BackOrder) new Object();
        obj.id = id;
        return obj;
    }
}

