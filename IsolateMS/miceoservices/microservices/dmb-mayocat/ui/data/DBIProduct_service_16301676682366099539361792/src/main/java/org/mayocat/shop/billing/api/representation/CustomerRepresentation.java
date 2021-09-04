/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.api.representation;

import org.mayocat.shop.customer.model.Customer;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 12b82c86c29b2eb012bb8945fe19e62a2b63452e $
 */
public class CustomerRepresentation {

    public CustomerRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/ms1/customerrepresentation/customerrepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public CustomerRepresentation(Customer customer) {
        String uri = MicroserviceApplication.projectUri + "/ms1/customerrepresentation/customerrepresentation?callerId=" + this.id + "&customerId=customer.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
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

    public String getEmail() {
        return (String) null;
    }

    public void setEmail(String email) {
        return;
    }

    public String getPhoneNumber() {
        return (String) null;
    }

    public void setPhoneNumber(String phoneNumber) {
        return;
    }

    public int id = 0;

    public static CustomerRepresentation getObject(int id) {
        CustomerRepresentation obj = (CustomerRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

