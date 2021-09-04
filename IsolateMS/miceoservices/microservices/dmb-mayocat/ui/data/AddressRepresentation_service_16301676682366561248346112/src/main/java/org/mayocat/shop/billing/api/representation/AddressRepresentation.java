/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.api.representation;

import org.mayocat.shop.customer.model.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 570302c177f9db0dc60886b3705b0cf808b51741 $
 */
public class AddressRepresentation {

    public AddressRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/ms2/addressrepresentation/addressrepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public AddressRepresentation(Address address) {
        String uri = MicroserviceApplication.projectUri + "/ms2/addressrepresentation/addressrepresentation?callerId=" + this.id + "&addressId=address.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
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

    public int id = 0;

    public static AddressRepresentation getObject(int id) {
        AddressRepresentation obj = (AddressRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

