/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9d575b44835789438126d1bf4f836633c3f4c1ab $
 */
public class InvalidCartOperationException extends Exception {

    public InvalidCartOperationException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/invalidcartoperationexception/invalidcartoperationexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidCartOperationException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/invalidcartoperationexception/invalidcartoperationexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidCartOperationException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/invalidcartoperationexception/invalidcartoperationexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidCartOperationException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/invalidcartoperationexception/invalidcartoperationexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidCartOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        String uri = MicroserviceApplication.projectUri + "/ms1/invalidcartoperationexception/invalidcartoperationexception?callerId=" + this.id + "&message=message&causeId=cause.id&enableSuppression=enableSuppression&writableStackTrace=writableStackTrace";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static InvalidCartOperationException getObject(int id) {
        InvalidCartOperationException obj = (InvalidCartOperationException) new Object();
        obj.id = id;
        return obj;
    }
}

