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
package com.ibm.websphere.samples.pbw.bean;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import com.ibm.websphere.samples.pbw.jpa.Customer;
import com.ibm.websphere.samples.pbw.utils.Util;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * The CustomerMgr provides a transactional facade for access to a user DB as well as simple
 * authentication support for those users.
 */
@Transactional
@Dependent
public class CustomerMgr implements Serializable {

    /**
     * Create a new user.
     *
     * @param customerID
     *            The new customer ID.
     * @param password
     *            The password for the customer ID.
     * @param firstName
     *            First name.
     * @param lastName
     *            Last name.
     * @param addr1
     *            Address line 1.
     * @param addr2
     *            Address line 2.
     * @param addrCity
     *            City address information.
     * @param addrState
     *            State address information.
     * @param addrZip
     *            Zip code address information.
     * @param phone
     *            User's phone number.
     * @return Customer
     */
    public Customer createCustomer(String customerID, String password, String firstName, String lastName, String addr1, String addr2, String addrCity, String addrState, String addrZip, String phone) {
        return (Customer) null;
    }

    /**
     * Retrieve an existing user.
     *
     * @param customerID
     *            The customer ID.
     * @return Customer
     */
    public Customer getCustomer(String customerID) {
        return (Customer) null;
    }

    /**
     * Update an existing user.
     *
     * @param customerID
     *            The customer ID.
     * @param firstName
     *            First name.
     * @param lastName
     *            Last name.
     * @param addr1
     *            Address line 1.
     * @param addr2
     *            Address line 2.
     * @param addrCity
     *            City address information.
     * @param addrState
     *            State address information.
     * @param addrZip
     *            Zip code address information.
     * @param phone
     *            User's phone number.
     * @return Customer
     */
    public Customer updateUser(String customerID, String firstName, String lastName, String addr1, String addr2, String addrCity, String addrState, String addrZip, String phone) {
        return (Customer) null;
    }

    /**
     * Verify that the user exists and the password is value.
     *
     * @param customerID
     *            The customer ID
     * @param password
     *            The password for the customer ID
     * @return String with a results message.
     */
    public String verifyUserAndPassword(String customerID, String password) {
        return (String) null;
    }

    public void setEm(EntityManager em) {
        return;
    }

    public EntityManager getEm() {
        return (EntityManager) null;
    }

    public int id = 0;

    public static CustomerMgr getObject(int id) {
        CustomerMgr obj = (CustomerMgr) new Object();
        obj.id = id;
        return obj;
    }
}

