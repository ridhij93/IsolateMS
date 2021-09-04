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

/**
 * Tenant data managed by a payment gateway.
 *
 * @version $Id: e8052d09b0a47ad0beaf6888dcd3fde643f59b5f $
 */
public class GatewayTenantDataServer extends GatewayData {

    private UUID tenantId;

    public GatewayTenantDataServer(UUID tenantId, String gateway, Map<String, Object> data) {
        super(data, gateway);
        this.tenantId = tenantId;
    }

    public UUID getTenantId() {
        return tenantId;
    }

    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }
}

