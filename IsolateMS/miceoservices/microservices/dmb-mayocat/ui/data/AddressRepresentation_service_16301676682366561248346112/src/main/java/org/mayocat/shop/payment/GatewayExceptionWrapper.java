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
 * @version $Id: 1658b505b45498032173ca058b7d8a6d24dcf73c $
 */
@Controller
@RequestMapping("/ms2/gatewayexception/")
public class GatewayExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, GatewayExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "gatewayexception")
    public  @ResponseBody int GatewayException() {
        GatewayExceptionServer newServerObj = new GatewayExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gatewayexception")
    public  @ResponseBody int GatewayException(@RequestParam String message) {
        GatewayExceptionServer newServerObj = new GatewayExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gatewayexception")
    public  @ResponseBody int GatewayException(@RequestParam String message, @RequestParam int causeId) {
        GatewayExceptionServer newServerObj = new GatewayExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gatewayexception")
    public  @ResponseBody int GatewayException(@RequestParam int tId) {
        GatewayExceptionServer newServerObj = new GatewayExceptionServer(Throwable.getObject(tId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

