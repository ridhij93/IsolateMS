/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.google.common.collect.Lists;
import java.util.List;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 778640435ec9979a8a73e39b9c08eb7f07e4bad8 $
 */
public class PaymentsSettings implements ExposedSettings {

    @Override
    public String getKey() {
        return (String) null;
    }

    public Configurable<List<String>> getGateways() {
        return (Configurable<List<String>>) null;
    }

    public void setGateways(Configurable<List<String>> gateways) {
        return;
    }

    public int id = 0;

    public static PaymentsSettings getObject(int id) {
        PaymentsSettings obj = (PaymentsSettings) new Object();
        obj.id = id;
        return obj;
    }
}

