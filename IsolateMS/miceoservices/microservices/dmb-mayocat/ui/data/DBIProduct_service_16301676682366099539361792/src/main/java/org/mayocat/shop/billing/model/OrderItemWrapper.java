/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import com.google.common.collect.Maps;
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
 * @version $Id: b1955132744d92de27df9dc8230d31b028efd1ca $
 */
@Controller
@RequestMapping("/ms1/orderitem/")
public class OrderItemWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, OrderItemServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "orderitem")
    public  @ResponseBody int OrderItem() {
        OrderItemServer newServerObj = new OrderItemServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

