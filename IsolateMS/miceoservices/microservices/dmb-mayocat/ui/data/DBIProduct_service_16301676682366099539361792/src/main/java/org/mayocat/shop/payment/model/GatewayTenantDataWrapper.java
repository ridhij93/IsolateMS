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
 * Tenant data managed by a payment gateway.
 *
 * @version $Id: e8052d09b0a47ad0beaf6888dcd3fde643f59b5f $
 */
@Controller
@RequestMapping("/ms1/gatewaytenantdata/")
public class GatewayTenantDataWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, GatewayTenantDataServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "gatewaytenantdata")
    public  @ResponseBody int GatewayTenantData(@RequestParam int tenantIdId, @RequestParam String gateway, @RequestParam int dataId) {
    }
}

