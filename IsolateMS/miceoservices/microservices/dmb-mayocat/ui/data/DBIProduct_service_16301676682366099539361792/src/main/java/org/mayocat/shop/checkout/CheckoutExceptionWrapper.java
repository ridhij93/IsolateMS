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
 * @version $Id: 39c35937ae87d4483dc728fcafb84ddc7de5afef $
 */
@Controller
@RequestMapping("/ms1/checkoutexception/")
public class CheckoutExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CheckoutExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "checkoutexception")
    public  @ResponseBody int CheckoutException() {
        CheckoutExceptionServer newServerObj = new CheckoutExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "checkoutexception")
    public  @ResponseBody int CheckoutException(@RequestParam String message) {
        CheckoutExceptionServer newServerObj = new CheckoutExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "checkoutexception")
    public  @ResponseBody int CheckoutException(@RequestParam String message, @RequestParam int causeId) {
        CheckoutExceptionServer newServerObj = new CheckoutExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "checkoutexception")
    public  @ResponseBody int CheckoutException(@RequestParam int causeId) {
        CheckoutExceptionServer newServerObj = new CheckoutExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

