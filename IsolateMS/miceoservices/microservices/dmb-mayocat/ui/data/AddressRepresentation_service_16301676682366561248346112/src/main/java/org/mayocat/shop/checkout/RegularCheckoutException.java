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
 * A type of {@link CheckoutException} that occurs in the "normal" flow of operations. Instances of this exception
 * can be treated as something that is meant to happen, without paying extra attention (as opposed to a
 * {@link CheckoutException} that is not an instance of this class).
 *
 * Examples: A user submits a second time the payment cancel form, effectively attempting to delete an order that is
 * already deleted. This is a regular checkout exception because we don't need to take additional measures besides
 * displaying an error message. This example can be opposed to the example of a payment gateway returning an error
 * linked to the global configuration of the gateway : in which case the error has to be logged and an administrator
 * informed.
 *
 * @version $Id: 55465456d40bb0250ecc55806e6e322040c210e9 $
 */
public class RegularCheckoutException extends CheckoutException {

    public RegularCheckoutException() {
        String uri = MicroserviceApplication.projectUri + "/ms2/regularcheckoutexception/regularcheckoutexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public RegularCheckoutException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms2/regularcheckoutexception/regularcheckoutexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public RegularCheckoutException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms2/regularcheckoutexception/regularcheckoutexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public RegularCheckoutException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms2/regularcheckoutexception/regularcheckoutexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static RegularCheckoutException getObject(int id) {
        RegularCheckoutException obj = (RegularCheckoutException) new Object();
        obj.id = id;
        return obj;
    }
}

