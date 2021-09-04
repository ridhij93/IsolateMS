/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.webhooks;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: d9c437db98145cc30ab8027acdd52866f84cd9c3 $
 */
@Component("webhooks")
public class WebhooksGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    public int id = 0;

    public static WebhooksGestaltConfigurationSource getObject(int id) {
        WebhooksGestaltConfigurationSource obj = (WebhooksGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

