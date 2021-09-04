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
package com.ibm.websphere.samples.pbw.war;

import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A class to hold a back order item's data.
 */
public class BackOrderItem implements java.io.Serializable {

    /**
     * @see java.lang.Object#Object()
     */
    /**
     * Default constructor.
     */
    public BackOrderItem() {
        String uri = MicroserviceApplication.projectUri + "/ms2/backorderitem/backorderitemcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Method BackOrderItem.
     *
     * @param backOrderID
     * @param inventoryID
     * @param name
     * @param quantity
     * @param status
     */
    public BackOrderItem(String backOrderID, Inventory inventoryID, String name, int quantity, String status) {
        String uri = MicroserviceApplication.projectUri + "/ms2/backorderitem/backorderitem?callerId=" + this.id + "&backOrderID=backOrderID&inventoryIDId=inventoryID.id&name=name&quantity=quantity&status=status";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Method BackOrderItem.
     *
     * @param backOrder
     */
    public BackOrderItem(BackOrder backOrder) {
        String uri = MicroserviceApplication.projectUri + "/ms2/backorderitem/backorderitem?callerId=" + this.id + "&backOrderId=backOrder.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Method getBackOrderID.
     *
     * @return String
     */
    public String getBackOrderID() {
        return (String) null;
    }

    /**
     * Method setBackOrderID.
     *
     * @param backOrderID
     */
    public void setBackOrderID(String backOrderID) {
        return;
    }

    /**
     * Method getSupplierOrderID.
     *
     * @return String
     */
    public String getSupplierOrderID() {
        return (String) null;
    }

    /**
     * Method setSupplierOrderID.
     *
     * @param supplierOrderID
     */
    public void setSupplierOrderID(String supplierOrderID) {
        return;
    }

    /**
     * Method setQuantity.
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        return;
    }

    /**
     * Method getInventoryID.
     *
     * @return String
     */
    public Inventory getInventory() {
        return (Inventory) null;
    }

    /**
     * Method getName.
     *
     * @return String
     */
    public String getName() {
        return (String) null;
    }

    /**
     * Method setName.
     *
     * @param name
     */
    public void setName(String name) {
        return;
    }

    /**
     * Method getQuantity.
     *
     * @return int
     */
    public int getQuantity() {
        return (Integer) null;
    }

    /**
     * Method getInventoryQuantity.
     *
     * @return int
     */
    public int getInventoryQuantity() {
        return (Integer) null;
    }

    /**
     * Method setInventoryQuantity.
     *
     * @param quantity
     */
    public void setInventoryQuantity(int quantity) {
        return;
    }

    /**
     * Method getStatus.
     *
     * @return String
     */
    public String getStatus() {
        return (String) null;
    }

    /**
     * Method getLowDate.
     *
     * @return long
     */
    public long getLowDate() {
        return (Long) null;
    }

    /**
     * Method getOrderDate.
     *
     * @return long
     */
    public long getOrderDate() {
        return (Long) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setStatus(String status) {
        return;
    }

    public void setLowDate(long lowDate) {
        return;
    }

    public void setOrderDate(long orderDate) {
        return;
    }

    public void setInventory(Inventory inventory) {
        return;
    }

    public int id = 0;

    public static BackOrderItem getObject(int id) {
        BackOrderItem obj = (BackOrderItem) new Object();
        obj.id = id;
        return obj;
    }
}

