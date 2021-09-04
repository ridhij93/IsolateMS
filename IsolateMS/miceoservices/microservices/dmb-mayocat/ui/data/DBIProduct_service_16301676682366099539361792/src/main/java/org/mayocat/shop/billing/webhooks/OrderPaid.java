/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.webhooks;

import org.mayocat.webhooks.Hook;
import org.mayocat.webhooks.Webhook;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c07b5e39c76be6c523f0b70378ce939418f9e705 $
 */
@Component(OrderPaid.getID())
public class OrderPaid implements Webhook {

    @Override
    public String getName() {
        return (String) null;
    }

    public static String getID() {
        String uri = MicroserviceApplication.projectUri + "/ms2/orderpaid/getid";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public int id = 0;

    public static OrderPaid getObject(int id) {
        OrderPaid obj = (OrderPaid) new Object();
        obj.id = id;
        return obj;
    }
}

