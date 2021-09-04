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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Customer is the bean mapping for the CUSTOMER table.
 *
 * @see Customer
 */
@Entity(name = "Customer")
@Table(name = "CUSTOMER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllCustomers", query = "delete from Customer") })
public class Customer {

    public Customer() {
        String uri = MicroserviceApplication.projectUri + "/ms5/customer/customercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Create a new Customer.
     *
     * @param key
     *            CustomerKey
     * @param password
     *            Password used for this customer account.
     * @param firstName
     *            First name of the customer.
     * @param lastName
     *            Last name of the customer
     * @param addr1
     *            Street address of the customer
     * @param addr2
     *            Street address of the customer
     * @param addrCity
     *            City
     * @param addrState
     *            State
     * @param addrZip
     *            Zip code
     * @param phone
     *            Phone number
     */
    public Customer(String key, String password, String firstName, String lastName, String addr1, String addr2, String addrCity, String addrState, String addrZip, String phone) {
        String uri = MicroserviceApplication.projectUri + "/ms5/customer/customer?callerId=" + this.id + "&key=key&password=password&firstName=firstName&lastName=lastName&addr1=addr1&addr2=addr2&addrCity=addrCity&addrState=addrState&addrZip=addrZip&phone=phone";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Verify password.
     *
     * @param password
     *            value to be checked.
     * @return True, if password matches one stored.
     */
    public boolean verifyPassword(String password) {
        return (Boolean) null;
    }

    /**
     * Get the customer's full name.
     *
     * @return String of customer's full name.
     */
    public String getFullName() {
        return (String) null;
    }

    public String getAddr1() {
        return (String) null;
    }

    public void setAddr1(String addr1) {
        return;
    }

    public String getAddr2() {
        return (String) null;
    }

    public void setAddr2(String addr2) {
        return;
    }

    public String getAddrCity() {
        return (String) null;
    }

    public void setAddrCity(String addrCity) {
        return;
    }

    public String getAddrState() {
        return (String) null;
    }

    public void setAddrState(String addrState) {
        return;
    }

    public String getAddrZip() {
        return (String) null;
    }

    public void setAddrZip(String addrZip) {
        return;
    }

    public String getCustomerID() {
        return (String) null;
    }

    public void setCustomerID(String customerID) {
        return;
    }

    public String getFirstName() {
        return (String) null;
    }

    public void setFirstName(String firstName) {
        return;
    }

    public String getLastName() {
        return (String) null;
    }

    public void setLastName(String lastName) {
        return;
    }

    public String getPassword() {
        return (String) null;
    }

    public void setPassword(String password) {
        return;
    }

    public String getPhone() {
        return (String) null;
    }

    public void setPhone(String phone) {
        return;
    }

    public int id = 0;

    public static Customer getObject(int id) {
        Customer obj = (Customer) new Object();
        obj.id = id;
        return obj;
    }
}

