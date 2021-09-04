/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.configuration;

import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.shop.shipping.Strategy;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 539f66a1e4628f333560ee4360a3f10ae55f4cbc $
 */
public class ShippingSettings implements ExposedSettings {

    public String getKey() {
        return (String) null;
    }

    public Configurable<Strategy> getStrategy() {
        return (Configurable<Strategy>) null;
    }

    public void setStrategy(Configurable<Strategy> strategy) {
        return;
    }

    public int id = 0;

    public static ShippingSettings getObject(int id) {
        ShippingSettings obj = (ShippingSettings) new Object();
        obj.id = id;
        return obj;
    }
}

