/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.event;

import org.xwiki.observation.event.Event;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ApplicationStartedEvent implements Event {

    @Override
    public boolean matches(Object otherEvent) {
        String uri = MicroserviceApplication.projectUri + "/ms1/applicationstartedevent/matches?callerId=" + this.id + "&otherEventId=otherEvent.id";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    public int id = 0;

    public static ApplicationStartedEvent getObject(int id) {
        ApplicationStartedEvent obj = (ApplicationStartedEvent) new Object();
        obj.id = id;
        return obj;
    }
}

