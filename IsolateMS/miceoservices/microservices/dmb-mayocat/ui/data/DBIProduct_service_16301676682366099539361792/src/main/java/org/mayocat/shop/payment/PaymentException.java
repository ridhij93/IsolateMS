/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 23938538a372c2cd9eafbdc7855ff39243e1cc30 $
 */
public class PaymentException extends Exception {

    public PaymentException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/paymentexception/paymentexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PaymentException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/paymentexception/paymentexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PaymentException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms5/paymentexception/paymentexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PaymentException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms5/paymentexception/paymentexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static PaymentException getObject(int id) {
        PaymentException obj = (PaymentException) new Object();
        obj.id = id;
        return obj;
    }
}

