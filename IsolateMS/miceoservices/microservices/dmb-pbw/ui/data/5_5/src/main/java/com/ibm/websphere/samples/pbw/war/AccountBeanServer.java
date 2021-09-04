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

/**
 * Provides a combination of JSF action and backing bean support for the account web page.
 */
@Named(value = "account")
@SessionScoped
public class AccountBeanServer implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String ACTION_ACCOUNT = "account";

    private static final String ACTION_CHECKOUT_FINAL = "checkout_final";

    private static final String ACTION_LOGIN = "login";

    private static final String ACTION_ORDERDONE = "orderdone";

    private static final String ACTION_ORDERINFO = "orderinfo";

    private static final String ACTION_PROMO = "promo";

    private static final String ACTION_REGISTER = "register";

    @Inject
    private CustomerMgr login;

    @Inject
    private MailerBean mailer;

    @Inject
    private ShoppingCartBean shoppingCart;

    private boolean checkingOut;

    private Customer customer;

    private String lastOrderNum;

    private LoginInfo loginInfo;

    private Customer newCustomer;

    private OrderInfo orderInfo;

    private int orderNum = 1;

    private boolean register;

    private boolean updating;

    public String performAccount() {
        if (customer == null || loginInfo == null) {
            checkingOut = false;
            loginInfo = new LoginInfo();
            register = false;
            updating = true;
            loginInfo.setMessage("You must log in first.");
            return AccountBean.getACTION_LOGIN();
        } else {
            return AccountBean.getACTION_ACCOUNT();
        }
    }

    public String performAccountUpdate() {
        if (register) {
            customer = login.createCustomer(loginInfo.getEmail(), loginInfo.getPassword(), newCustomer.getFirstName(), newCustomer.getLastName(), newCustomer.getAddr1(), newCustomer.getAddr2(), newCustomer.getAddrCity(), newCustomer.getAddrState(), newCustomer.getAddrZip(), newCustomer.getPhone());
            register = false;
        } else {
            customer = login.updateUser(customer.getCustomerID(), customer.getFirstName(), customer.getLastName(), customer.getAddr1(), customer.getAddr2(), customer.getAddrCity(), customer.getAddrState(), customer.getAddrZip(), customer.getPhone());
        }
        return AccountBean.getACTION_PROMO();
    }

    public String performCheckoutFinal() {
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ShoppingBean shopping = (ShoppingBean) app.createValueBinding("#{shopping}").getValue(context);
        shopping.setShippingCost(Util.getShippingMethodPrice(orderInfo.getShippingMethod()));
        return AccountBean.getACTION_CHECKOUT_FINAL();
    }

    public String performCompleteCheckout() {
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        app.createValueBinding("#{shopping}").getValue(context);
        // persist the order
        OrderInfo oi = new OrderInfo(shoppingCart.createOrder(customer.getCustomerID(), orderInfo.getBillName(), orderInfo.getBillAddr1(), orderInfo.getBillAddr2(), orderInfo.getBillCity(), orderInfo.getBillState(), orderInfo.getBillZip(), orderInfo.getBillPhone(), orderInfo.getShipName(), orderInfo.getShipAddr1(), orderInfo.getShipAddr2(), orderInfo.getShipCity(), orderInfo.getShipState(), orderInfo.getShipZip(), orderInfo.getShipPhone(), orderInfo.getCardName(), orderInfo.getCardNum(), orderInfo.getCardExpMonth(), orderInfo.getCardExpYear(), orderInfo.getCardholderName(), orderInfo.getShippingMethod(), shoppingCart.getItems()));
        lastOrderNum = oi.getID();
        Util.debug("Account.performCompleteCheckout: order id =" + orderInfo);
        /*
		 * // Check the available inventory and backorder if necessary. if (shoppingCart != null) {
		 * Inventory si; Collection<Inventory> items = shoppingCart.getItems(); for (Object o :
		 * items) { si = (Inventory) o; shoppingCart.checkInventory(si); Util.debug(
		 * "ShoppingCart.checkInventory() - checking Inventory quantity of item: " + si.getID()); }
		 * }
		 */
        try {
            mailer.createAndSendMail(customer, oi.getID());
        } catch (MailerAppException e) {
            System.out.println("MailerAppException:" + e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception during create and send mail :" + e);
            e.printStackTrace();
        }
        orderInfo = null;
        // shoppingCart.setCartContents (new ShoppingCartContents());
        shoppingCart.removeAllItems();
        return AccountBean.getACTION_ORDERDONE();
    }

    public String performLogin() {
        checkingOut = false;
        loginInfo = new LoginInfo();
        register = false;
        updating = false;
        loginInfo.setMessage("");
        return AccountBean.getACTION_LOGIN();
    }

    public String performLoginComplete() {
        String message;
        // Attempt to log in the user.
        message = login.verifyUserAndPassword(loginInfo.getEmail(), loginInfo.getPassword());
        if (message != null) {
            // Error, so go back to the login page.
            loginInfo.setMessage(message);
            return AccountBean.getACTION_LOGIN();
        }
        // Otherwise, no error, so continue to the correct page.
        customer = login.getCustomer(loginInfo.getEmail());
        if (isCheckingOut()) {
            return performOrderInfo();
        }
        if (isUpdating()) {
            return performAccount();
        }
        return AccountBean.getACTION_PROMO();
    }

    public String performOrderInfo() {
        if (customer == null) {
            checkingOut = true;
            loginInfo = new LoginInfo();
            register = false;
            updating = false;
            loginInfo.setMessage("You must log in first.");
            return AccountBean.getACTION_LOGIN();
        } else {
            if (orderInfo == null) {
                orderInfo = new OrderInfo(customer.getFirstName() + " " + customer.getLastName(), customer.getAddr1(), customer.getAddr2(), customer.getAddrCity(), customer.getAddrState(), customer.getAddrZip(), customer.getPhone(), "", "", "", "", "", "", "", 0, "" + (orderNum++));
            }
            return AccountBean.getACTION_ORDERINFO();
        }
    }

    public String performRegister() {
        loginInfo = new LoginInfo();
        newCustomer = new Customer("", "", "", "", "", "", "", "", "", "");
        register = true;
        updating = false;
        return AccountBean.getACTION_REGISTER();
    }

    public Customer getCustomer() {
        return (isRegister() ? newCustomer : customer);
    }

    public String getLastOrderNum() {
        return lastOrderNum;
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public boolean isCheckingOut() {
        return checkingOut;
    }

    public boolean isRegister() {
        return register;
    }

    public boolean isUpdating() {
        return updating;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getACTION_ACCOUNT() {
        return ACTION_ACCOUNT;
    }

    public static String getACTION_CHECKOUT_FINAL() {
        return ACTION_CHECKOUT_FINAL;
    }

    public static String getACTION_LOGIN() {
        return ACTION_LOGIN;
    }

    public static String getACTION_ORDERDONE() {
        return ACTION_ORDERDONE;
    }

    public static String getACTION_ORDERINFO() {
        return ACTION_ORDERINFO;
    }

    public static String getACTION_PROMO() {
        return ACTION_PROMO;
    }

    public static String getACTION_REGISTER() {
        return ACTION_REGISTER;
    }

    public void setLogin(CustomerMgr login) {
        this.login = login;
    }

    public CustomerMgr getLogin() {
        return login;
    }

    public void setMailer(MailerBean mailer) {
        this.mailer = mailer;
    }

    public MailerBean getMailer() {
        return mailer;
    }

    public void setShoppingCart(ShoppingCartBean shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ShoppingCartBean getShoppingCart() {
        return shoppingCart;
    }

    public void setCheckingOut(boolean checkingOut) {
        this.checkingOut = checkingOut;
    }

    public boolean getCheckingOut() {
        return checkingOut;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setLastOrderNum(String lastOrderNum) {
        this.lastOrderNum = lastOrderNum;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    public void setNewCustomer(Customer newCustomer) {
        this.newCustomer = newCustomer;
    }

    public Customer getNewCustomer() {
        return newCustomer;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }

    public boolean getRegister() {
        return register;
    }

    public void setUpdating(boolean updating) {
        this.updating = updating;
    }

    public boolean getUpdating() {
        return updating;
    }
}

