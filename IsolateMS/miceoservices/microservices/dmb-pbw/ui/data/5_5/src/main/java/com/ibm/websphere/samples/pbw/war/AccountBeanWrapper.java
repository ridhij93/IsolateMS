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
import javax.enterprise.context.SessionScoped;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import com.ibm.websphere.samples.pbw.bean.CustomerMgr;
import com.ibm.websphere.samples.pbw.bean.MailerAppException;
import com.ibm.websphere.samples.pbw.bean.MailerBean;
import com.ibm.websphere.samples.pbw.bean.ShoppingCartBean;
import com.ibm.websphere.samples.pbw.jpa.Customer;
import com.ibm.websphere.samples.pbw.utils.Util;
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
 * Provides a combination of JSF action and backing bean support for the account web page.
 */
@Named(value = "account")
@SessionScoped
public class AccountBeanWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getaction_account")
    public static @ResponseBody String getACTION_ACCOUNT() {
        String result = AccountBeanServer.getACTION_ACCOUNT();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaction_checkout_final")
    public static @ResponseBody String getACTION_CHECKOUT_FINAL() {
        String result = AccountBeanServer.getACTION_CHECKOUT_FINAL();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaction_login")
    public static @ResponseBody String getACTION_LOGIN() {
        String result = AccountBeanServer.getACTION_LOGIN();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaction_orderdone")
    public static @ResponseBody String getACTION_ORDERDONE() {
        String result = AccountBeanServer.getACTION_ORDERDONE();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaction_orderinfo")
    public static @ResponseBody String getACTION_ORDERINFO() {
        String result = AccountBeanServer.getACTION_ORDERINFO();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaction_promo")
    public static @ResponseBody String getACTION_PROMO() {
        String result = AccountBeanServer.getACTION_PROMO();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaction_register")
    public static @ResponseBody String getACTION_REGISTER() {
        String result = AccountBeanServer.getACTION_REGISTER();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, AccountBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "accountbean")
    public  @ResponseBody int AccountBean() {
        AccountBeanServer newServerObj = new AccountBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

