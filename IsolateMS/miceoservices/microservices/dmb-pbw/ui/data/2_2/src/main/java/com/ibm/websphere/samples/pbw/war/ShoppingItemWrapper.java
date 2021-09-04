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

import java.io.Serializable;
import javax.validation.constraints.Min;
import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
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
 * ShoppingItem wraps the JPA Inventory entity class to provide additional methods needed by the web
 * app.
 */
@Controller
@RequestMapping("/ms2/shoppingitem/")
public class ShoppingItemWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ShoppingItemServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "shoppingitem")
    public  @ResponseBody int ShoppingItem() {
        ShoppingItemServer newServerObj = new ShoppingItemServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "shoppingitem")
    public  @ResponseBody int ShoppingItem(@RequestParam int iId) {
        ShoppingItemServer newServerObj = new ShoppingItemServer(Inventory.getObject(iId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "shoppingitem")
    public  @ResponseBody int ShoppingItem(@RequestParam String key, @RequestParam String name, @RequestParam String heading, @RequestParam String desc, @RequestParam String pkginfo, @RequestParam String image, @RequestParam float price, @RequestParam float cost, @RequestParam int quantity, @RequestParam int category, @RequestParam String notes, @RequestParam boolean isPublic) {
        ShoppingItemServer newServerObj = new ShoppingItemServer(key, name, heading, desc, pkginfo, image, price, cost, quantity, category, notes, isPublic);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

