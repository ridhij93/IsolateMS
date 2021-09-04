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
package com.ibm.websphere.samples.pbw.war;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Provides backing bean support for the product web page. Accessed via the shopping bean.
 */
public class ProductBean implements Serializable {

    protected ProductBean(Inventory inventory) {
        String uri = MicroserviceApplication.projectUri + "/ms3/productbean/productbean?callerId=" + this.id + "&inventoryId=inventory.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getCategoryName() {
        return (String) null;
    }

    public Inventory getInventory() {
        return (Inventory) null;
    }

    public String getMenuString() {
        return (String) null;
    }

    public String getPrice() {
        return (String) null;
    }

    public int getQuantity() {
        return (Integer) null;
    }

    public void setQuantity(int quantity) {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setInventory(Inventory inventory) {
        return;
    }

    public int id = 0;

    public static ProductBean getObject(int id) {
        ProductBean obj = (ProductBean) new Object();
        obj.id = id;
        return obj;
    }
}

