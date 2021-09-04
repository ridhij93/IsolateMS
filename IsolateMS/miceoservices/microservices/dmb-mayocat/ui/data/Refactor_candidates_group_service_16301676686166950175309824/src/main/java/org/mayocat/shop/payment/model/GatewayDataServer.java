/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.model;

import java.util.Map;

/**
 * Gateway data common to {@link GatewayCustomerData} and {@link GatewayTenantData}.
 *
 * @version $Id: 63af18c78390703ae6b72f6d64a92be50b1c41df $
 */
public class GatewayDataServer {

    protected String gateway;

    protected Map<String, Object> data;

    public GatewayDataServer(Map<String, Object> data, String gateway) {
        this.data = data;
        this.gateway = gateway;
    }

    public String getGateway() {
        return gateway;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}

