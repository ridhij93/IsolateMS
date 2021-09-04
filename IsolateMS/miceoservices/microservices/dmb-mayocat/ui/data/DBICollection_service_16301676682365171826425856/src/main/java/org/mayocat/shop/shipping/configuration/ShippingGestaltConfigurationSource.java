/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.configuration;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 29d6c0c16b2327ab6090970e0934dbe6c0d9ccf6 $
 */
@Component("shipping")
public class ShippingGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    public void setShippingSettings(ShippingSettings shippingSettings) {
        return;
    }

    public ShippingSettings getShippingSettings() {
        return (ShippingSettings) null;
    }

    public int id = 0;

    public static ShippingGestaltConfigurationSource getObject(int id) {
        ShippingGestaltConfigurationSource obj = (ShippingGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

