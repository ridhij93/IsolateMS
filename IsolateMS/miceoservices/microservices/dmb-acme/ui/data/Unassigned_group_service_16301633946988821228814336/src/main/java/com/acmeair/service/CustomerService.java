/**
 * ****************************************************************************
 *  Copyright (c) 2013-2015 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * *****************************************************************************
 */
package com.acmeair.service;

import javax.inject.Inject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.acmeair.web.dto.CustomerInfo;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public abstract class CustomerService {

    public abstract void createCustomer(String username, String password, String status, int total_miles, int miles_ytd, String phoneNumber, String phoneNumberType, String addressJson) {
        return;
    }

    public abstract String createAddress(String streetAddress1, String streetAddress2, String city, String stateProvince, String country, String postalCode) {
        return (String) null;
    }

    public abstract void updateCustomer(String username, CustomerInfo customerJson) {
        return;
    }

    protected abstract String getCustomer(String username) {
        return (String) null;
    }

    public abstract String getCustomerByUsername(String username) {
        return (String) null;
    }

    public boolean validateCustomer(String username, String password) {
        return (Boolean) null;
    }

    public String getCustomerByUsernameAndPassword(String username, String password) {
        return (String) null;
    }

    public abstract Long count() {
        return (Long) null;
    }

    public abstract void dropCustomers() {
        return;
    }

    public static int getDAYS_TO_ALLOW_SESSION() {
        return (Integer) null;
    }

    public void setKeyGenerator(KeyGenerator keyGenerator) {
        return;
    }

    public KeyGenerator getKeyGenerator() {
        return (KeyGenerator) null;
    }

    public int id = 0;

    public static CustomerService getObject(int id) {
        CustomerService obj = (CustomerService) new Object();
        obj.id = id;
        return obj;
    }
}

