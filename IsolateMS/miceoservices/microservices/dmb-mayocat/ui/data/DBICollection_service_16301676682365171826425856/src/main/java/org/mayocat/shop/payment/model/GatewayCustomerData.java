/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.model;

import java.util.Map;
import java.util.UUID;
import org.mayocat.model.annotation.DoNotIndex;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Customer data managed by a payment gateway.
 *
 * @version $Id: eb48db4244232b2cf3b6eb32492f55c0ff4cd399 $
 */
public class GatewayCustomerData extends GatewayData {

    public GatewayCustomerData(UUID customerId, String gateway, Map<String, Object> data) {
        String uri = MicroserviceApplication.projectUri + "/ms5/gatewaycustomerdata/gatewaycustomerdata?callerId=" + this.id + "&customerIdId=customerId.id&gateway=gateway&dataId=data.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getCustomerId() {
        return (UUID) null;
    }

    public void setCustomerId(UUID customerId) {
        return;
    }

    public int id = 0;

    public static GatewayCustomerData getObject(int id) {
        GatewayCustomerData obj = (GatewayCustomerData) new Object();
        obj.id = id;
        return obj;
    }
}

