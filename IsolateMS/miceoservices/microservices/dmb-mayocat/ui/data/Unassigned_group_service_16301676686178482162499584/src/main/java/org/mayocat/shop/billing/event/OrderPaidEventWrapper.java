/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;
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
 * @version $Id: 1abf3613f508824e80d95230ab7df385bf3dbda7 $
 */
@Controller
@RequestMapping("/ms5/orderpaidevent/")
public class OrderPaidEventWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, OrderPaidEventServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "orderpaidevent")
    public  @ResponseBody int OrderPaidEvent() {
        OrderPaidEventServer newServerObj = new OrderPaidEventServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

