/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 39c35937ae87d4483dc728fcafb84ddc7de5afef $
 */
public class CheckoutException extends Exception {

    public CheckoutException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/checkoutexception/checkoutexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public CheckoutException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/checkoutexception/checkoutexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public CheckoutException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/checkoutexception/checkoutexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public CheckoutException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/checkoutexception/checkoutexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static CheckoutException getObject(int id) {
        CheckoutException obj = (CheckoutException) new Object();
        obj.id = id;
        return obj;
    }
}

