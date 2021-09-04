/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1658b505b45498032173ca058b7d8a6d24dcf73c $
 */
public class GatewayException extends Exception {

    public GatewayException() {
        String uri = MicroserviceApplication.projectUri + "/ms2/gatewayexception/gatewayexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public GatewayException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms2/gatewayexception/gatewayexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public GatewayException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms2/gatewayexception/gatewayexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public GatewayException(Throwable t) {
        String uri = MicroserviceApplication.projectUri + "/ms2/gatewayexception/gatewayexception?callerId=" + this.id + "&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static GatewayException getObject(int id) {
        GatewayException obj = (GatewayException) new Object();
        obj.id = id;
        return obj;
    }
}

