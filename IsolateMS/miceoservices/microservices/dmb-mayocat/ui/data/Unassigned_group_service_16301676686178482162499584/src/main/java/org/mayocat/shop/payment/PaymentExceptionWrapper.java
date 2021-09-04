/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

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
 * @version $Id: 23938538a372c2cd9eafbdc7855ff39243e1cc30 $
 */
@Controller
@RequestMapping("/ms5/paymentexception/")
public class PaymentExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaymentExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentexception")
    public  @ResponseBody int PaymentException() {
        PaymentExceptionServer newServerObj = new PaymentExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "paymentexception")
    public  @ResponseBody int PaymentException(@RequestParam String message) {
        PaymentExceptionServer newServerObj = new PaymentExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "paymentexception")
    public  @ResponseBody int PaymentException(@RequestParam String message, @RequestParam int causeId) {
        PaymentExceptionServer newServerObj = new PaymentExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "paymentexception")
    public  @ResponseBody int PaymentException(@RequestParam int causeId) {
        PaymentExceptionServer newServerObj = new PaymentExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

