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
// (C) COPYRIGHT International Business Machines Corp., 2004,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.bean;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.Vector;
import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * ResetDBBean provides a transactional and secure facade to reset all the database information for
 * the PlantsByWebSphere application.
 */
@Named(value = "resetbean")
@Dependent
@RolesAllowed("SampAdmin")
public class ResetDBBean implements Serializable {

    public void resetDB() {
        return;
    }

    /**
     * @param itemID
     * @param fileName
     * @param catalog
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void addImage(String itemID, String fileName, CatalogMgr catalog) throws FileNotFoundException, IOException {
        return;
    }

    public void populateDB() {
        return;
    }

    @Transactional
    public void deleteAll() {
        return;
    }

    public void setCatalog(CatalogMgr catalog) {
        return;
    }

    public CatalogMgr getCatalog() {
        return (CatalogMgr) null;
    }

    public void setCustomer(CustomerMgr customer) {
        return;
    }

    public CustomerMgr getCustomer() {
        return (CustomerMgr) null;
    }

    public void setCart(ShoppingCartBean cart) {
        return;
    }

    public ShoppingCartBean getCart() {
        return (ShoppingCartBean) null;
    }

    public void setBackOrderStock(BackOrderMgr backOrderStock) {
        return;
    }

    public BackOrderMgr getBackOrderStock() {
        return (BackOrderMgr) null;
    }

    public void setSuppliers(SuppliersBean suppliers) {
        return;
    }

    public SuppliersBean getSuppliers() {
        return (SuppliersBean) null;
    }

    public void setEm(EntityManager em) {
        return;
    }

    public EntityManager getEm() {
        return (EntityManager) null;
    }

    public void setTx(UserTransaction tx) {
        return;
    }

    public UserTransaction getTx() {
        return (UserTransaction) null;
    }

    public int id = 0;

    public static ResetDBBean getObject(int id) {
        ResetDBBean obj = (ResetDBBean) new Object();
        obj.id = id;
        return obj;
    }
}

