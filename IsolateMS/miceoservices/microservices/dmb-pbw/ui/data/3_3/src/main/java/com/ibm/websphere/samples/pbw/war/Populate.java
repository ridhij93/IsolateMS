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
package com.ibm.websphere.samples.pbw.war;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Vector;
import com.ibm.websphere.samples.pbw.bean.BackOrderMgr;
import com.ibm.websphere.samples.pbw.bean.CatalogMgr;
import com.ibm.websphere.samples.pbw.bean.CustomerMgr;
import com.ibm.websphere.samples.pbw.bean.ResetDBBean;
import com.ibm.websphere.samples.pbw.bean.ShoppingCartBean;
import com.ibm.websphere.samples.pbw.bean.SuppliersBean;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A basic POJO class for resetting the database.
 */
public class Populate {

    /**
     */
    public Populate() {
        String uri = MicroserviceApplication.projectUri + "/ms3/populate/populatecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Populate(ResetDBBean resetDB, CatalogMgr c, CustomerMgr l, BackOrderMgr b, SuppliersBean s) {
        String uri = MicroserviceApplication.projectUri + "/ms3/populate/populate?callerId=" + this.id + "&resetDBId=resetDB.id&cId=c.id&lId=l.id&bId=b.id&sId=s.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
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

    /**
     */
    public void doPopulate() {
        return;
    }

    public void setResetDB(ResetDBBean resetDB) {
        return;
    }

    public ResetDBBean getResetDB() {
        return (ResetDBBean) null;
    }

    public void setCatalog(CatalogMgr catalog) {
        return;
    }

    public CatalogMgr getCatalog() {
        return (CatalogMgr) null;
    }

    public void setLogin(CustomerMgr login) {
        return;
    }

    public CustomerMgr getLogin() {
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

    public int id = 0;

    public static Populate getObject(int id) {
        Populate obj = (Populate) new Object();
        obj.id = id;
        return obj;
    }
}

