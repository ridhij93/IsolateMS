/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class EntityCreatedEvent extends AbstractFilterableEvent implements Event {

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static EntityCreatedEvent getObject(int id) {
        EntityCreatedEvent obj = (EntityCreatedEvent) new Object();
        obj.id = id;
        return obj;
    }
}

