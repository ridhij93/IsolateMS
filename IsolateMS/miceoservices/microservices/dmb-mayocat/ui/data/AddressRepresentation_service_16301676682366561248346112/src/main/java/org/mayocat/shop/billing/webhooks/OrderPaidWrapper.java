/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.webhooks;

import org.mayocat.webhooks.Hook;
import org.mayocat.webhooks.Webhook;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: c07b5e39c76be6c523f0b70378ce939418f9e705 $
 */
@Component(OrderPaid.getID())
public class OrderPaidWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public static @ResponseBody String getID() {
        String result = OrderPaidServer.getID();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, OrderPaidServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "orderpaid")
    public  @ResponseBody int OrderPaid() {
        OrderPaidServer newServerObj = new OrderPaidServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

