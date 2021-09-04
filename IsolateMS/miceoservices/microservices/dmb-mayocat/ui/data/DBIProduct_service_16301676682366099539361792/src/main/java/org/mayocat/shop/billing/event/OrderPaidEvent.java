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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1abf3613f508824e80d95230ab7df385bf3dbda7 $
 */
public class OrderPaidEvent extends AbstractFilterableEvent implements Event {

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static OrderPaidEvent getObject(int id) {
        OrderPaidEvent obj = (OrderPaidEvent) new Object();
        obj.id = id;
        return obj;
    }
}

