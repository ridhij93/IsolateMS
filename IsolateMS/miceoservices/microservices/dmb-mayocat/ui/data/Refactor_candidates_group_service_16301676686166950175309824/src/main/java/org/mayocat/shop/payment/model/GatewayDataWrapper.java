/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.model;

import java.util.Map;
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
 * Gateway data common to {@link GatewayCustomerData} and {@link GatewayTenantData}.
 *
 * @version $Id: 63af18c78390703ae6b72f6d64a92be50b1c41df $
 */
@Controller
@RequestMapping("/ms3/gatewaydata/")
public class GatewayDataWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, GatewayDataServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "gatewaydata")
    public  @ResponseBody int GatewayData(@RequestParam int dataId, @RequestParam String gateway) {
    }
}

