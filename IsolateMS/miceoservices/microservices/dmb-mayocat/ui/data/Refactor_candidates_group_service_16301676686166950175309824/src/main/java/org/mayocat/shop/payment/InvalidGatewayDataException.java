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
 * Exception thrown when trying to store invalid gateway customer data
 *
 * @version $Id: d01ef579761d25af4537dab00e66a0937ebd9d54 $
 */
public class InvalidGatewayDataException extends Exception {

    public InvalidGatewayDataException() {
        String uri = MicroserviceApplication.projectUri + "/ms0/invalidgatewaydataexception/invalidgatewaydataexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidGatewayDataException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms0/invalidgatewaydataexception/invalidgatewaydataexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static InvalidGatewayDataException getObject(int id) {
        InvalidGatewayDataException obj = (InvalidGatewayDataException) new Object();
        obj.id = id;
        return obj;
    }
}

