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
 * Exception thrown when trying to store invalid gateway customer data
 *
 * @version $Id: d01ef579761d25af4537dab00e66a0937ebd9d54 $
 */
@Controller
@RequestMapping("/ms0/invalidgatewaydataexception/")
public class InvalidGatewayDataExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvalidGatewayDataExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "invalidgatewaydataexception")
    public  @ResponseBody int InvalidGatewayDataException() {
        InvalidGatewayDataExceptionServer newServerObj = new InvalidGatewayDataExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invalidgatewaydataexception")
    public  @ResponseBody int InvalidGatewayDataException(@RequestParam String message) {
        InvalidGatewayDataExceptionServer newServerObj = new InvalidGatewayDataExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

