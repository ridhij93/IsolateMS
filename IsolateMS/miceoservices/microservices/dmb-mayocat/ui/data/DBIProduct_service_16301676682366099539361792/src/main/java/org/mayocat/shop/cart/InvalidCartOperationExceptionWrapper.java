/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

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
 * @version $Id: 9d575b44835789438126d1bf4f836633c3f4c1ab $
 */
@Controller
@RequestMapping("/ms1/invalidcartoperationexception/")
public class InvalidCartOperationExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvalidCartOperationExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "invalidcartoperationexception")
    public  @ResponseBody int InvalidCartOperationException() {
        InvalidCartOperationExceptionServer newServerObj = new InvalidCartOperationExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invalidcartoperationexception")
    public  @ResponseBody int InvalidCartOperationException(@RequestParam String message) {
        InvalidCartOperationExceptionServer newServerObj = new InvalidCartOperationExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invalidcartoperationexception")
    public  @ResponseBody int InvalidCartOperationException(@RequestParam String message, @RequestParam int causeId) {
        InvalidCartOperationExceptionServer newServerObj = new InvalidCartOperationExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invalidcartoperationexception")
    public  @ResponseBody int InvalidCartOperationException(@RequestParam int causeId) {
        InvalidCartOperationExceptionServer newServerObj = new InvalidCartOperationExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invalidcartoperationexception")
    public  @ResponseBody int InvalidCartOperationException(@RequestParam String message, @RequestParam int causeId, @RequestParam boolean enableSuppression, @RequestParam boolean writableStackTrace) {
        InvalidCartOperationExceptionServer newServerObj = new InvalidCartOperationExceptionServer(message, Throwable.getObject(causeId), enableSuppression, writableStackTrace);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

