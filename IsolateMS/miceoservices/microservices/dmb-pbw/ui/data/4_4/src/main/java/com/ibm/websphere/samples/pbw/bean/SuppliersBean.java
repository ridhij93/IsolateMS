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

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.ibm.websphere.samples.pbw.jpa.Supplier;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Bean implementation class for Enterprise Bean: Suppliers
 */
@Dependent
public class SuppliersBean implements Serializable {

    /**
     * @param supplierID
     * @param name
     * @param street
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param url
     */
    public void createSupplier(String supplierID, String name, String street, String city, String state, String zip, String phone, String url) {
        return;
    }

    /**
     * @return Supplier
     */
    public Supplier getSupplier() {
        return (Supplier) null;
    }

    /**
     * @param supplierID
     * @param name
     * @param street
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param url
     * @return supplierInfo
     */
    public Supplier updateSupplier(String supplierID, String name, String street, String city, String state, String zip, String phone, String url) {
        return (Supplier) null;
    }

    /**
     * @return suppliers
     */
    @SuppressWarnings("unchecked")
    private Collection<Supplier> findSuppliers() {
        return (Collection) null;
    }

    public void setEm(EntityManager em) {
        return;
    }

    public EntityManager getEm() {
        return (EntityManager) null;
    }

    public int id = 0;

    public static SuppliersBean getObject(int id) {
        SuppliersBean obj = (SuppliersBean) new Object();
        obj.id = id;
        return obj;
    }
}

