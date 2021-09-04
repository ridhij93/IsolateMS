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

import java.util.Calendar;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.ibm.websphere.samples.pbw.jpa.Order;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A class to hold an order's data.
 */
public class OrderInfo implements java.io.Serializable {

    /**
     * Constructor to create an OrderInfo by passing each field.
     */
    public OrderInfo(String billName, String billAddr1, String billAddr2, String billCity, String billState, String billZip, String billPhone, String shipName, String shipAddr1, String shipAddr2, String shipCity, String shipState, String shipZip, String shipPhone, int shippingMethod, String orderID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/orderinfo/orderinfo?callerId=" + this.id + "&billName=billName&billAddr1=billAddr1&billAddr2=billAddr2&billCity=billCity&billState=billState&billZip=billZip&billPhone=billPhone&shipName=shipName&shipAddr1=shipAddr1&shipAddr2=shipAddr2&shipCity=shipCity&shipState=shipState&shipZip=shipZip&shipPhone=shipPhone&shippingMethod=shippingMethod&orderID=orderID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Constructor to create an OrderInfo using an Order.
     *
     * @param order
     */
    public OrderInfo(Order order) {
        String uri = MicroserviceApplication.projectUri + "/ms5/orderinfo/orderinfo?callerId=" + this.id + "&orderId=order.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Get the shipping method name.
     */
    public String getShippingMethodName() {
        return (String) null;
    }

    /**
     * Set the shipping method by name
     */
    public void setShippingMethodName(String name) {
        return;
    }

    /**
     * Get shipping methods that are possible.
     *
     * @return String[] of method names
     */
    public String[] getShippingMethods() {
        return (String[]) null;
    }

    public int getShippingMethodCount() {
        return (Integer) null;
    }

    private void initLists() {
        return;
    }

    /**
     * @return the orderID
     */
    public String getID() {
        return (String) null;
    }

    /**
     * @param orderID
     *            the orderID to set
     */
    public void setID(String orderID) {
        return;
    }

    /**
     * @return the billName
     */
    public String getBillName() {
        return (String) null;
    }

    /**
     * @param billName
     *            the billName to set
     */
    public void setBillName(String billName) {
        return;
    }

    /**
     * @return the billAddr1
     */
    public String getBillAddr1() {
        return (String) null;
    }

    /**
     * @param billAddr1
     *            the billAddr1 to set
     */
    public void setBillAddr1(String billAddr1) {
        return;
    }

    /**
     * @return the billAddr2
     */
    public String getBillAddr2() {
        return (String) null;
    }

    /**
     * @param billAddr2
     *            the billAddr2 to set
     */
    public void setBillAddr2(String billAddr2) {
        return;
    }

    /**
     * @return the billCity
     */
    public String getBillCity() {
        return (String) null;
    }

    /**
     * @param billCity
     *            the billCity to set
     */
    public void setBillCity(String billCity) {
        return;
    }

    /**
     * @return the billState
     */
    public String getBillState() {
        return (String) null;
    }

    /**
     * @param billState
     *            the billState to set
     */
    public void setBillState(String billState) {
        return;
    }

    /**
     * @return the billZip
     */
    public String getBillZip() {
        return (String) null;
    }

    /**
     * @param billZip
     *            the billZip to set
     */
    public void setBillZip(String billZip) {
        return;
    }

    /**
     * @return the billPhone
     */
    public String getBillPhone() {
        return (String) null;
    }

    /**
     * @param billPhone
     *            the billPhone to set
     */
    public void setBillPhone(String billPhone) {
        return;
    }

    /**
     * @return the shipName
     */
    public String getShipName() {
        return (String) null;
    }

    /**
     * @param shipName
     *            the shipName to set
     */
    public void setShipName(String shipName) {
        return;
    }

    /**
     * @return the shipAddr1
     */
    public String getShipAddr1() {
        return (String) null;
    }

    /**
     * @param shipAddr1
     *            the shipAddr1 to set
     */
    public void setShipAddr1(String shipAddr1) {
        return;
    }

    /**
     * @return the shipAddr2
     */
    public String getShipAddr2() {
        return (String) null;
    }

    /**
     * @param shipAddr2
     *            the shipAddr2 to set
     */
    public void setShipAddr2(String shipAddr2) {
        return;
    }

    /**
     * @return the shipCity
     */
    public String getShipCity() {
        return (String) null;
    }

    /**
     * @param shipCity
     *            the shipCity to set
     */
    public void setShipCity(String shipCity) {
        return;
    }

    /**
     * @return the shipState
     */
    public String getShipState() {
        return (String) null;
    }

    /**
     * @param shipState
     *            the shipState to set
     */
    public void setShipState(String shipState) {
        return;
    }

    /**
     * @return the shipZip
     */
    public String getShipZip() {
        return (String) null;
    }

    /**
     * @param shipZip
     *            the shipZip to set
     */
    public void setShipZip(String shipZip) {
        return;
    }

    /**
     * @return the shipPhone
     */
    public String getShipPhone() {
        return (String) null;
    }

    /**
     * @param shipPhone
     *            the shipPhone to set
     */
    public void setShipPhone(String shipPhone) {
        return;
    }

    /**
     * @return the shippingMethod
     */
    public int getShippingMethod() {
        return (Integer) null;
    }

    /**
     * @param shippingMethod
     *            the shippingMethod to set
     */
    public void setShippingMethod(int shippingMethod) {
        return;
    }

    /**
     * @return the cardholderName
     */
    public String getCardholderName() {
        return (String) null;
    }

    /**
     * @param cardholderName
     *            the cardholderName to set
     */
    public void setCardholderName(String cardholderName) {
        return;
    }

    /**
     * @return the cardName
     */
    public String getCardName() {
        return (String) null;
    }

    /**
     * @param cardName
     *            the cardName to set
     */
    public void setCardName(String cardName) {
        return;
    }

    /**
     * @return the cardNum
     */
    public String getCardNum() {
        return (String) null;
    }

    /**
     * @param cardNum
     *            the cardNum to set
     */
    public void setCardNum(String cardNum) {
        return;
    }

    /**
     * @return the cardExpMonth
     */
    public String getCardExpMonth() {
        return (String) null;
    }

    /**
     * @param cardExpMonth
     *            the cardExpMonth to set
     */
    public void setCardExpMonth(String cardExpMonth) {
        return;
    }

    /**
     * @return the cardExpYear
     */
    public String getCardExpYear() {
        return (String) null;
    }

    /**
     * @param cardExpYear
     *            the cardExpYear to set
     */
    public void setCardExpYear(String cardExpYear) {
        return;
    }

    /**
     * @return the cardExpYears
     */
    public String[] getCardExpYears() {
        return (String[]) null;
    }

    /**
     * @param cardExpYears
     *            the cardExpYears to set
     */
    public void setCardExpYears(String[] cardExpYears) {
        return;
    }

    /**
     * @return the shipisbill
     */
    public boolean isShipisbill() {
        return (Boolean) null;
    }

    /**
     * @param shipisbill
     *            the shipisbill to set
     */
    public void setShipisbill(boolean shipisbill) {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setOrderID(String orderID) {
        return;
    }

    public String getOrderID() {
        return (String) null;
    }

    public boolean getShipisbill() {
        return (Boolean) null;
    }

    public int id = 0;

    public static OrderInfo getObject(int id) {
        OrderInfo obj = (OrderInfo) new Object();
        obj.id = id;
        return obj;
    }
}

