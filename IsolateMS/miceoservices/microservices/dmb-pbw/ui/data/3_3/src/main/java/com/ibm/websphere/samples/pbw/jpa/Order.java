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

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Bean mapping for the ORDER1 table.
 */
@Entity(name = "Order")
@Table(name = "ORDER1", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllOrders", query = "delete from Order") })
public class Order {

    /**
     * Constructor to create an Order.
     *
     * @param customer
     *            - customer who created the order
     * @param billName
     *            - billing name
     * @param billAddr1
     *            - billing address line 1
     * @param billAddr2
     *            - billing address line 2
     * @param billCity
     *            - billing address city
     * @param billState
     *            - billing address state
     * @param billZip
     *            - billing address zip code
     * @param billPhone
     *            - billing phone
     * @param shipName
     *            - shippng name
     * @param shipAddr1
     *            - shippng address line 1
     * @param shipAddr2
     *            - shippng address line 2
     * @param shipCity
     *            - shippng address city
     * @param shipState
     *            - shippng address state
     * @param shipZip
     *            - shippng address zip code
     * @param shipPhone
     *            - shippng phone
     * @param creditCard
     *            - credit card
     * @param ccNum
     *            - credit card number
     * @param ccExpireMonth
     *            - credit card expiration month
     * @param ccExpireYear
     *            - credit card expiration year
     * @param cardHolder
     *            - credit card holder name
     * @param shippingMethod
     *            int of shipping method used
     * @param items
     *            vector of StoreItems ordered
     */
    public Order(Customer customer, String billName, String billAddr1, String billAddr2, String billCity, String billState, String billZip, String billPhone, String shipName, String shipAddr1, String shipAddr2, String shipCity, String shipState, String shipZip, String shipPhone, String creditCard, String ccNum, String ccExpireMonth, String ccExpireYear, String cardHolder, int shippingMethod, Collection<OrderItem> items) {
        String uri = MicroserviceApplication.projectUri + "/ms5/order/order?callerId=" + this.id + "&customerId=customer.id&billName=billName&billAddr1=billAddr1&billAddr2=billAddr2&billCity=billCity&billState=billState&billZip=billZip&billPhone=billPhone&shipName=shipName&shipAddr1=shipAddr1&shipAddr2=shipAddr2&shipCity=shipCity&shipState=shipState&shipZip=shipZip&shipPhone=shipPhone&creditCard=creditCard&ccNum=ccNum&ccExpireMonth=ccExpireMonth&ccExpireYear=ccExpireYear&cardHolder=cardHolder&shippingMethod=shippingMethod&itemsId=items.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Order(String orderID) {
        String uri = MicroserviceApplication.projectUri + "/ms5/order/order?callerId=" + this.id + "&orderID=orderID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Order() {
        String uri = MicroserviceApplication.projectUri + "/ms5/order/ordercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getBillAddr1() {
        return (String) null;
    }

    public void setBillAddr1(String billAddr1) {
        return;
    }

    public String getBillAddr2() {
        return (String) null;
    }

    public void setBillAddr2(String billAddr2) {
        return;
    }

    public String getBillCity() {
        return (String) null;
    }

    public void setBillCity(String billCity) {
        return;
    }

    public String getBillName() {
        return (String) null;
    }

    public void setBillName(String billName) {
        return;
    }

    public String getBillPhone() {
        return (String) null;
    }

    public void setBillPhone(String billPhone) {
        return;
    }

    public String getBillState() {
        return (String) null;
    }

    public void setBillState(String billState) {
        return;
    }

    public String getBillZip() {
        return (String) null;
    }

    public void setBillZip(String billZip) {
        return;
    }

    public String getCardHolder() {
        return (String) null;
    }

    public void setCardHolder(String cardHolder) {
        return;
    }

    public String getCcExpireMonth() {
        return (String) null;
    }

    public void setCcExpireMonth(String ccExpireMonth) {
        return;
    }

    public String getCcExpireYear() {
        return (String) null;
    }

    public void setCcExpireYear(String ccExpireYear) {
        return;
    }

    public String getCcNum() {
        return (String) null;
    }

    public void setCcNum(String ccNum) {
        return;
    }

    public String getCreditCard() {
        return (String) null;
    }

    public void setCreditCard(String creditCard) {
        return;
    }

    public Customer getCustomer() {
        return (Customer) null;
    }

    public void setCustomer(Customer customer) {
        return;
    }

    public Collection<OrderItem> getItems() {
        return (Collection) null;
    }

    public void setItems(Collection<OrderItem> items) {
        return;
    }

    public String getOrderID() {
        return (String) null;
    }

    public void setOrderID(String orderID) {
        return;
    }

    public Collection getOrderItems() {
        return (Collection) null;
    }

    public void setOrderItems(Collection orderItems) {
        return;
    }

    public float getProfit() {
        return (Float) null;
    }

    public void setProfit(float profit) {
        return;
    }

    public String getSellDate() {
        return (String) null;
    }

    public void setSellDate(String sellDate) {
        return;
    }

    public String getShipAddr1() {
        return (String) null;
    }

    public void setShipAddr1(String shipAddr1) {
        return;
    }

    public String getShipAddr2() {
        return (String) null;
    }

    public void setShipAddr2(String shipAddr2) {
        return;
    }

    public String getShipCity() {
        return (String) null;
    }

    public void setShipCity(String shipCity) {
        return;
    }

    public String getShipName() {
        return (String) null;
    }

    public void setShipName(String shipName) {
        return;
    }

    public String getShipPhone() {
        return (String) null;
    }

    public void setShipPhone(String shipPhone) {
        return;
    }

    public int getShippingMethod() {
        return (Integer) null;
    }

    public void setShippingMethod(int shippingMethod) {
        return;
    }

    public String getShipZip() {
        return (String) null;
    }

    public void setShipZip(String shipZip) {
        return;
    }

    public String getShipState() {
        return (String) null;
    }

    public void setShipState(String shipState) {
        return;
    }

    public static String getORDER_INFO_TABLE_NAME() {
        return (String) null;
    }

    public static String getORDER_ITEMS_TABLE_NAME() {
        return (String) null;
    }

    public int id = 0;

    public static Order getObject(int id) {
        Order obj = (Order) new Object();
        obj.id = id;
        return obj;
    }
}

