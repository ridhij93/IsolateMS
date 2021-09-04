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
// (C) COPYRIGHT International Business Machines Corp., 2001,2011
// All Rights Reserved * Licensed Materials - Property of IBM
// 
package com.ibm.websphere.samples.pbw.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
 * Customer is the bean mapping for the CUSTOMER table.
 *
 * @see Customer
 */
@Entity(name = "Customer")
@Table(name = "CUSTOMER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllCustomers", query = "delete from Customer") })
public class CustomerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CustomerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customer")
    public  @ResponseBody int Customer() {
        CustomerServer newServerObj = new CustomerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "customer")
    public  @ResponseBody int Customer(@RequestParam String key, @RequestParam String password, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String addr1, @RequestParam String addr2, @RequestParam String addrCity, @RequestParam String addrState, @RequestParam String addrZip, @RequestParam String phone) {
        CustomerServer newServerObj = new CustomerServer(key, password, firstName, lastName, addr1, addr2, addrCity, addrState, addrZip, phone);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

