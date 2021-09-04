/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.model;

import java.util.Map;
import java.util.UUID;
import org.mayocat.model.annotation.DoNotIndex;
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
 * Customer data managed by a payment gateway.
 *
 * @version $Id: eb48db4244232b2cf3b6eb32492f55c0ff4cd399 $
 */
@Controller
@RequestMapping("/ms5/gatewaycustomerdata/")
public class GatewayCustomerDataWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, GatewayCustomerDataServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "gatewaycustomerdata")
    public  @ResponseBody int GatewayCustomerData(@RequestParam int customerIdId, @RequestParam String gateway, @RequestParam int dataId) {
    }
}

