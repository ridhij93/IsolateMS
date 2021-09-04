/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 70b1c6ee2c1e912a51ba3302721cfbb70d618dad $
 */
public class PaymentOperationEvent extends AbstractFilterableEvent implements Event {

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static PaymentOperationEvent getObject(int id) {
        PaymentOperationEvent obj = (PaymentOperationEvent) new Object();
        obj.id = id;
        return obj;
    }
}

