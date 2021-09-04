/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 42709486f2ca9c7b06fa5d0162dd6ca3abe99192 $
 */
public class InvalidOperation extends Exception {

    public InvalidOperation() {
        String uri = MicroserviceApplication.projectUri + "/ms5/invalidoperation/invalidoperationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidOperation(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/invalidoperation/invalidoperation?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static InvalidOperation getObject(int id) {
        InvalidOperation obj = (InvalidOperation) new Object();
        obj.id = id;
        return obj;
    }
}

