/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.model;

import java.util.List;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.shop.customer.model.Customer;
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
 * @version $Id: f4991dc7855f72430664ffd2bb1d7f72e8cf6c60 $
 */
@Controller
@RequestMapping("/ms0/order/")
public class OrderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, OrderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "order")
    public  @ResponseBody int Order() {
        OrderServer newServerObj = new OrderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

