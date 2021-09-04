/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.model;

import java.util.UUID;
import org.mayocat.model.Identifiable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 0949d59be050f06fcf1270e4040384b8e7b07e63 $
 */
public class Address implements Identifiable {

    public UUID getId() {
        return (UUID) null;
    }

    public void setId(UUID id) {
        return;
    }

    public UUID getCustomerId() {
        return (UUID) null;
    }

    public void setCustomerId(UUID customerId) {
        return;
    }

    public String getCompany() {
        return (String) null;
    }

    public void setCompany(String company) {
        return;
    }

    public String getFullName() {
        return (String) null;
    }

    public void setFullName(String fullName) {
        return;
    }

    public String getStreet() {
        return (String) null;
    }

    public void setStreet(String street) {
        return;
    }

    public String getStreetComplement() {
        return (String) null;
    }

    public void setStreetComplement(String streetComplement) {
        return;
    }

    public String getZip() {
        return (String) null;
    }

    public void setZip(String zip) {
        return;
    }

    public String getCity() {
        return (String) null;
    }

    public void setCity(String city) {
        return;
    }

    public String getCountry() {
        return (String) null;
    }

    public void setCountry(String country) {
        return;
    }

    public String getNote() {
        return (String) null;
    }

    public void setNote(String note) {
        return;
    }

    public String getType() {
        return (String) null;
    }

    public void setType(String type) {
        return;
    }

    public int id = 0;

    public static Address getObject(int id) {
        Address obj = (Address) new Object();
        obj.id = id;
        return obj;
    }
}

