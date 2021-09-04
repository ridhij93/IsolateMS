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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Provides a combination of JSF action and backing bean support for the account web page.
 */
@Named(value = "account")
@SessionScoped
public class AccountBean implements Serializable {

    public String performAccount() {
        return (String) null;
    }

    public String performAccountUpdate() {
        return (String) null;
    }

    public String performCheckoutFinal() {
        return (String) null;
    }

    public String performCompleteCheckout() {
        return (String) null;
    }

    public String performLogin() {
        return (String) null;
    }

    public String performLoginComplete() {
        return (String) null;
    }

    public String performOrderInfo() {
        return (String) null;
    }

    public String performRegister() {
        return (String) null;
    }

    public Customer getCustomer() {
        return (Customer) null;
    }

    public String getLastOrderNum() {
        return (String) null;
    }

    public LoginInfo getLoginInfo() {
        return (LoginInfo) null;
    }

    public OrderInfo getOrderInfo() {
        return (OrderInfo) null;
    }

    public boolean isCheckingOut() {
        return (Boolean) null;
    }

    public boolean isRegister() {
        return (Boolean) null;
    }

    public boolean isUpdating() {
        return (Boolean) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public static String getACTION_ACCOUNT() {
        String uri = MicroserviceApplication.projectUri + "/ms5/accountbean/getaction_account";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_CHECKOUT_FINAL() {
        String uri = MicroserviceApplication.projectUri + "/ms5/accountbean/getaction_checkout_final";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_LOGIN() {
        String uri = MicroserviceApplication.projectUri + "/ms5/accountbean/getaction_login";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_ORDERDONE() {
        String uri = MicroserviceApplication.projectUri + "/ms5/accountbean/getaction_orderdone";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_ORDERINFO() {
        String uri = MicroserviceApplication.projectUri + "/ms5/accountbean/getaction_orderinfo";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_PROMO() {
        String uri = MicroserviceApplication.projectUri + "/ms5/accountbean/getaction_promo";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getACTION_REGISTER() {
        String uri = MicroserviceApplication.projectUri + "/ms5/accountbean/getaction_register";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setLogin(CustomerMgr login) {
        return;
    }

    public CustomerMgr getLogin() {
        return (CustomerMgr) null;
    }

    public void setMailer(MailerBean mailer) {
        return;
    }

    public MailerBean getMailer() {
        return (MailerBean) null;
    }

    public void setShoppingCart(ShoppingCartBean shoppingCart) {
        return;
    }

    public ShoppingCartBean getShoppingCart() {
        return (ShoppingCartBean) null;
    }

    public void setCheckingOut(boolean checkingOut) {
        return;
    }

    public boolean getCheckingOut() {
        return (Boolean) null;
    }

    public void setCustomer(Customer customer) {
        return;
    }

    public void setLastOrderNum(String lastOrderNum) {
        return;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        return;
    }

    public void setNewCustomer(Customer newCustomer) {
        return;
    }

    public Customer getNewCustomer() {
        return (Customer) null;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        return;
    }

    public void setOrderNum(int orderNum) {
        return;
    }

    public int getOrderNum() {
        return (Integer) null;
    }

    public void setRegister(boolean register) {
        return;
    }

    public boolean getRegister() {
        return (Boolean) null;
    }

    public void setUpdating(boolean updating) {
        return;
    }

    public boolean getUpdating() {
        return (Boolean) null;
    }

    public int id = 0;

    public static AccountBean getObject(int id) {
        AccountBean obj = (AccountBean) new Object();
        obj.id = id;
        return obj;
    }
}

