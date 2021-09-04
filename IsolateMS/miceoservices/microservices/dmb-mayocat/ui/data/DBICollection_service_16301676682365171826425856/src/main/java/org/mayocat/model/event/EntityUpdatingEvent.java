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

/**
 * @version $Id: da4569a77dd7ec6b275b6a0db1d2b0cb729ff461 $
 */
public class EntityUpdatingEvent extends AbstractFilterableEvent implements Event {

    public int id = 0;

    public static EntityUpdatingEvent getObject(int id) {
        EntityUpdatingEvent obj = (EntityUpdatingEvent) new Object();
        obj.id = id;
        return obj;
    }
}

