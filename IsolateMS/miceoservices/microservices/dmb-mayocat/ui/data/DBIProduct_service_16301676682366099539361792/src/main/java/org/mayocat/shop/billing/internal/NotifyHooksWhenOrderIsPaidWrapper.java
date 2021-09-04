/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.internal;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.shop.billing.event.OrderPaidEvent;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.webhooks.OrderPaid;
import org.mayocat.webhooks.Webhooks;
import org.xwiki.component.annotation.Component;
import org.xwiki.observation.EventListener;
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
 * @version $Id: 4b1da85b839af11f21c6c0d2eeb706b5db9ad76c $
 */
@Component(NotifyHooksWhenOrderIsPaid.getID())
public class NotifyHooksWhenOrderIsPaidWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public static @ResponseBody String getID() {
        String result = NotifyHooksWhenOrderIsPaidServer.getID();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, NotifyHooksWhenOrderIsPaidServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "notifyhookswhenorderispaid")
    public  @ResponseBody int NotifyHooksWhenOrderIsPaid() {
        NotifyHooksWhenOrderIsPaidServer newServerObj = new NotifyHooksWhenOrderIsPaidServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

