/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@RequestMapping("/ms2/regularcheckoutexception/")
public class RegularCheckoutExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, RegularCheckoutExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "regularcheckoutexception")
    public  @ResponseBody int RegularCheckoutException() {
        RegularCheckoutExceptionServer newServerObj = new RegularCheckoutExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "regularcheckoutexception")
    public  @ResponseBody int RegularCheckoutException(@RequestParam String message) {
        RegularCheckoutExceptionServer newServerObj = new RegularCheckoutExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "regularcheckoutexception")
    public  @ResponseBody int RegularCheckoutException(@RequestParam String message, @RequestParam int causeId) {
        RegularCheckoutExceptionServer newServerObj = new RegularCheckoutExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "regularcheckoutexception")
    public  @ResponseBody int RegularCheckoutException(@RequestParam int causeId) {
        RegularCheckoutExceptionServer newServerObj = new RegularCheckoutExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

