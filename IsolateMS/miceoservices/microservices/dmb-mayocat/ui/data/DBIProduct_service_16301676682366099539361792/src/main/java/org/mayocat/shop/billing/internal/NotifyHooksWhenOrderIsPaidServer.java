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

/**
 * @version $Id: 4b1da85b839af11f21c6c0d2eeb706b5db9ad76c $
 */
@Component(NotifyHooksWhenOrderIsPaid.getID())
public class NotifyHooksWhenOrderIsPaidServer implements EventListener {

    static final String ID = "notifyHooksWhenOrderIsPaid";

    @Inject
    private Webhooks webhooks;

    @Override
    public String getName() {
        return ID;
    }

    @Override
    public List<Event> getEvents() {
        return Arrays.<Event>asList(new OrderPaidEvent());
    }

    @Override
    public void onEvent(Event event, Object source, Object data) {
        final Order order = (Order) source;
        Map<String, Object> payload = Maps.newHashMap();
        payload.put("customer", order.getCustomer().getEmail());
        payload.put("order", order.getSlug());
        webhooks.notifyHook(new OrderPaid(), payload);
    }

    public static String getID() {
        return ID;
    }

    public void setWebhooks(Webhooks webhooks) {
        this.webhooks = webhooks;
    }

    public Webhooks getWebhooks() {
        return webhooks;
    }
}

