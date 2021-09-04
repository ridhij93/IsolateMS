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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 4b1da85b839af11f21c6c0d2eeb706b5db9ad76c $
 */
@Component(NotifyHooksWhenOrderIsPaid.getID())
public class NotifyHooksWhenOrderIsPaid implements EventListener {

    @Override
    public String getName() {
        return (String) null;
    }

    @Override
    public List<Event> getEvents() {
        return (List<Event>) null;
    }

    @Override
    public void onEvent(Event event, Object source, Object data) {
        return;
    }

    public static String getID() {
        String uri = MicroserviceApplication.projectUri + "/ms1/notifyhookswhenorderispaid/getid";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setWebhooks(Webhooks webhooks) {
        return;
    }

    public Webhooks getWebhooks() {
        return (Webhooks) null;
    }

    public int id = 0;

    public static NotifyHooksWhenOrderIsPaid getObject(int id) {
        NotifyHooksWhenOrderIsPaid obj = (NotifyHooksWhenOrderIsPaid) new Object();
        obj.id = id;
        return obj;
    }
}

