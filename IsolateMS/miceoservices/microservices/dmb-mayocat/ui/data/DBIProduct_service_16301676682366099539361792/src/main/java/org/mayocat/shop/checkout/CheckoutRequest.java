/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.Maps;
import java.util.Map;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.shop.customer.model.Customer;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 284c7b639acb7e87b62fb5f2303297d22b735a3b $
 */
public class CheckoutRequest {

    public enum ErrorType {

        REQUIRED, BAD_VALUE;

        @JsonValue
        public String toJson() {
            return (String) null;
        }
    }

    public static class Error {

        private String userMessage;

        private ErrorType errorType;

        public Error(ErrorType type, String userMessage) {
            String uri = MicroserviceApplication.projectUri + "/msnull/error/error?callerId=" + this.id + "&typeId=type.id&userMessage=userMessage";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        public String getUserMessage() {
            return (String) null;
        }

        public ErrorType getErrorType() {
            return (ErrorType) null;
        }
    }

    public Address getBillingAddress() {
        return (Address) null;
    }

    public void setBillingAddress(Address billingAddress) {
        return;
    }

    public Customer getCustomer() {
        return (Customer) null;
    }

    public void setCustomer(Customer customer) {
        return;
    }

    public Address getDeliveryAddress() {
        return (Address) null;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        return;
    }

    public void putError(String key, Error error) {
        return;
    }

    public Map<String, Error> getErrors() {
        return (Map<String, Error>) null;
    }

    public void putOtherOrderData(String key, Object data) {
        return;
    }

    public Map<String, Object> getOtherOrderData() {
        return (Map<String, Object>) null;
    }

    public void setErrors(Map<String, Error> errors) {
        return;
    }

    public void setOtherOrderData(Map<String, Object> otherOrderData) {
        return;
    }

    public int id = 0;

    public static CheckoutRequest getObject(int id) {
        CheckoutRequest obj = (CheckoutRequest) new Object();
        obj.id = id;
        return obj;
    }
}

