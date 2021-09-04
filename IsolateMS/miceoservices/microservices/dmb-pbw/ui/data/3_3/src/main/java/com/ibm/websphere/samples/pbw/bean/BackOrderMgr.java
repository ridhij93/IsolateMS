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
package com.ibm.websphere.samples.pbw.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * The BackOrderMgr provides a transactional and secured facade to access back order information.
 * This bean no longer requires an interface as there is one and only one implementation.
 */
@Dependent
@RolesAllowed("SampAdmin")
public class BackOrderMgr implements Serializable {

    /**
     * Method createBackOrder.
     *
     * @param inventoryID
     * @param amountToOrder
     * @param maximumItems
     */
    public void createBackOrder(String inventoryID, int amountToOrder, int maximumItems) {
        return;
    }

    /**
     * Method findBackOrderItems.
     *
     * @return Collection
     */
    @SuppressWarnings("unchecked")
    public Collection<BackOrder> findBackOrders() {
        return (Collection) null;
    }

    /**
     * Method deleteBackOrder.
     *
     * @param backOrderID
     */
    public void deleteBackOrder(String backOrderID) {
        return;
    }

    /**
     * Method receiveConfirmation.
     *
     * @param backOrderID
     *            / public int receiveConfirmation(String backOrderID) { int rc = 0; BackOrder
     *            backOrder; Util.debug(
     *            "BackOrderMgr.receiveConfirmation() - Finding Back Order for backOrderID=" +
     *            backOrderID); backOrder = em.find(BackOrder.class, backOrderID);
     *            backOrder.setStatus(Util.STATUS_RECEIVEDSTOCK); Util.debug(
     *            "BackOrderMgr.receiveConfirmation() - Updating status(" +
     *            Util.STATUS_RECEIVEDSTOCK + ") of backOrderID(" + backOrderID + ")"); return (rc);
     *            }
     */
    /**
     * Method orderStock.
     *
     * @param backOrderID
     * @param quantity
     *            / public void orderStock(String backOrderID, int quantity) {
     *            this.setBackOrderStatus(backOrderID, Util.STATUS_ORDEREDSTOCK);
     *            this.setBackOrderQuantity(backOrderID, quantity);
     *            this.setBackOrderOrderDate(backOrderID); }
     */
    /**
     * Method updateStock.
     *
     * @param backOrderID
     * @param quantity
     */
    public void updateStock(String backOrderID, int quantity) {
        return;
    }

    /**
     * @param backOrderID
     *            / public void abortorderStock(String backOrderID) { Util.debug(
     *            "backOrderStockBean.abortorderStock() - Aborting orderStock transation for backorderID: "
     *            + backOrderID); // Reset the back order status since the order failed.
     *            this.setBackOrderStatus(backOrderID, Util.STATUS_ORDERSTOCK); }
     */
    /**
     * Method getBackOrderID.
     *
     * @param backOrderID
     * @return String / public String getBackOrderID(String backOrderID) { String retbackOrderID =
     *         ""; Util.debug( "BackOrderMgr.getBackOrderID() - Entered"); // BackOrderLocal
     *         backOrder = getBackOrderLocalHome().findByPrimaryKey(new BackOrderKey(backOrderID));
     *         BackOrder backOrder = em.find(BackOrder.class, backOrderID); retbackOrderID =
     *         backOrder.getBackOrderID(); return retbackOrderID; }
     */
    /**
     * Method getBackOrderInventoryID.
     *
     * @param backOrderID
     * @return String
     */
    public String getBackOrderInventoryID(String backOrderID) {
        return (String) null;
    }

    /**
     * Method getBackOrderQuantity.
     *
     * @param backOrderID
     * @return int
     */
    public int getBackOrderQuantity(String backOrderID) {
        return (Integer) null;
    }

    /**
     * Method setBackOrderQuantity.
     *
     * @param backOrderID
     * @param quantity
     */
    public void setBackOrderQuantity(String backOrderID, int quantity) {
        return;
    }

    /**
     * Method setBackOrderStatus.
     *
     * @param backOrderID
     * @param Status
     */
    public void setBackOrderStatus(String backOrderID, String Status) {
        return;
    }

    /**
     * Method setBackOrderOrderDate.
     *
     * @param backOrderID
     */
    public void setBackOrderOrderDate(String backOrderID) {
        return;
    }

    public void setEm(EntityManager em) {
        return;
    }

    public EntityManager getEm() {
        return (EntityManager) null;
    }

    public int id = 0;

    public static BackOrderMgr getObject(int id) {
        BackOrderMgr obj = (BackOrderMgr) new Object();
        obj.id = id;
        return obj;
    }
}

