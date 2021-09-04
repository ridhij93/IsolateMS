/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.billing.model.Order;
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
 * @version $Id: eddef23e4986738c31f927a845ba31aa96627580 $
 */
@Controller
@RequestMapping("/ms2/orderentity/")
public class OrderEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, OrderEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "orderentity")
    public  @ResponseBody int OrderEntity() {
        OrderEntityServer newServerObj = new OrderEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

