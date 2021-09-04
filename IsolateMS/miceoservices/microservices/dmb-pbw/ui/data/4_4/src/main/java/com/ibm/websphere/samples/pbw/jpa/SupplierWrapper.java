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
 * Bean mapping for the SUPPLIER table.
 */
@Entity(name = "Supplier")
@Table(name = "SUPPLIER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "findAllSuppliers", query = "select s from Supplier s"), @NamedQuery(name = "removeAllSupplier", query = "delete from Supplier") })
public class SupplierWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SupplierServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "supplier")
    public  @ResponseBody int Supplier() {
        SupplierServer newServerObj = new SupplierServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "supplier")
    public  @ResponseBody int Supplier(@RequestParam String supplierID) {
        SupplierServer newServerObj = new SupplierServer(supplierID);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "supplier")
    public  @ResponseBody int Supplier(@RequestParam String supplierID, @RequestParam String name, @RequestParam String street, @RequestParam String city, @RequestParam String state, @RequestParam String zip, @RequestParam String phone, @RequestParam String url) {
        SupplierServer newServerObj = new SupplierServer(supplierID, name, street, city, state, zip, phone, url);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

