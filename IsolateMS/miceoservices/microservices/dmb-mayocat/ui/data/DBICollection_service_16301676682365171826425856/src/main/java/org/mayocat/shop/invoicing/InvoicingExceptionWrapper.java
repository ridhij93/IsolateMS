/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing;

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
 * @version $Id: c706977d9442484d5e2d63e870eb3353f29306b6 $
 */
@Controller
@RequestMapping("/ms0/invoicingexception/")
public class InvoicingExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvoicingExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "invoicingexception")
    public  @ResponseBody int InvoicingException() {
        InvoicingExceptionServer newServerObj = new InvoicingExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invoicingexception")
    public  @ResponseBody int InvoicingException(@RequestParam String message) {
        InvoicingExceptionServer newServerObj = new InvoicingExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invoicingexception")
    public  @ResponseBody int InvoicingException(@RequestParam String message, @RequestParam int causeId) {
        InvoicingExceptionServer newServerObj = new InvoicingExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invoicingexception")
    public  @ResponseBody int InvoicingException(@RequestParam int causeId) {
        InvoicingExceptionServer newServerObj = new InvoicingExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invoicingexception")
    public  @ResponseBody int InvoicingException(@RequestParam String message, @RequestParam int causeId, @RequestParam boolean enableSuppression, @RequestParam boolean writableStackTrace) {
        InvoicingExceptionServer newServerObj = new InvoicingExceptionServer(message, Throwable.getObject(causeId), enableSuppression, writableStackTrace);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

