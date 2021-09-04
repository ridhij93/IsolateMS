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
package com.ibm.websphere.samples.pbw.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Bean mapping for the SUPPLIER table.
 */
@Entity(name = "Supplier")
@Table(name = "SUPPLIER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "findAllSuppliers", query = "select s from Supplier s"), @NamedQuery(name = "removeAllSupplier", query = "delete from Supplier") })
public class Supplier {

    public String getCity() {
        return (String) null;
    }

    public void setCity(String city) {
        return;
    }

    public String getName() {
        return (String) null;
    }

    public void setName(String name) {
        return;
    }

    public String getPhone() {
        return (String) null;
    }

    public void setPhone(String phone) {
        return;
    }

    public String getStreet() {
        return (String) null;
    }

    public void setStreet(String street) {
        return;
    }

    public String getSupplierID() {
        return (String) null;
    }

    public void setSupplierID(String supplierID) {
        return;
    }

    public String getUrl() {
        return (String) null;
    }

    public void setUrl(String url) {
        return;
    }

    public String getUsstate() {
        return (String) null;
    }

    public void setUsstate(String usstate) {
        return;
    }

    public String getZip() {
        return (String) null;
    }

    public void setZip(String zip) {
        return;
    }

    public Supplier() {
        String uri = MicroserviceApplication.projectUri + "/ms4/supplier/suppliercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Supplier(String supplierID) {
        String uri = MicroserviceApplication.projectUri + "/ms4/supplier/supplier?callerId=" + this.id + "&supplierID=supplierID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
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
     */
    public Supplier(String supplierID, String name, String street, String city, String state, String zip, String phone, String url) {
        String uri = MicroserviceApplication.projectUri + "/ms4/supplier/supplier?callerId=" + this.id + "&supplierID=supplierID&name=name&street=street&city=city&state=state&zip=zip&phone=phone&url=url";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static Supplier getObject(int id) {
        Supplier obj = (Supplier) new Object();
        obj.id = id;
        return obj;
    }
}

