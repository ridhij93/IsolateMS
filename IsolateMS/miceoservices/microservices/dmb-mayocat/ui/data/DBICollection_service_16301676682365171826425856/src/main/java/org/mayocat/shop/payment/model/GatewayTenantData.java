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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Tenant data managed by a payment gateway.
 *
 * @version $Id: e8052d09b0a47ad0beaf6888dcd3fde643f59b5f $
 */
public class GatewayTenantData extends GatewayData {

    public GatewayTenantData(UUID tenantId, String gateway, Map<String, Object> data) {
        String uri = MicroserviceApplication.projectUri + "/ms1/gatewaytenantdata/gatewaytenantdata?callerId=" + this.id + "&tenantIdId=tenantId.id&gateway=gateway&dataId=data.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getTenantId() {
        return (UUID) null;
    }

    public void setTenantId(UUID tenantId) {
        return;
    }

    public int id = 0;

    public static GatewayTenantData getObject(int id) {
        GatewayTenantData obj = (GatewayTenantData) new Object();
        obj.id = id;
        return obj;
    }
}

