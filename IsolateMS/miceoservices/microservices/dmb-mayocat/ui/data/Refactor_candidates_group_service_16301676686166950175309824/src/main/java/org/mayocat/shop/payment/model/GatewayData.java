/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.model;

import java.util.Map;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Gateway data common to {@link GatewayCustomerData} and {@link GatewayTenantData}.
 *
 * @version $Id: 63af18c78390703ae6b72f6d64a92be50b1c41df $
 */
public class GatewayData {

    public GatewayData(Map<String, Object> data, String gateway) {
        String uri = MicroserviceApplication.projectUri + "/ms3/gatewaydata/gatewaydata?callerId=" + this.id + "&dataId=data.id&gateway=gateway";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getGateway() {
        return (String) null;
    }

    public Map<String, Object> getData() {
        return (Map<String, Object>) null;
    }

    public void setGateway(String gateway) {
        return;
    }

    public void setData(Map<String, Object> data) {
        return;
    }

    public int id = 0;

    public static GatewayData getObject(int id) {
        GatewayData obj = (GatewayData) new Object();
        obj.id = id;
        return obj;
    }
}

