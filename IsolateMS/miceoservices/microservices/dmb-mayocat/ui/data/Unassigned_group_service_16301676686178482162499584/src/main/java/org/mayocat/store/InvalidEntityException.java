/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

import java.util.Collections;
import com.google.common.collect.ImmutableList;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class InvalidEntityException extends Exception {

    public InvalidEntityException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/invalidentityexception/invalidentityexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidEntityException(String message, Iterable<String> errors) {
        String uri = MicroserviceApplication.projectUri + "/ms1/invalidentityexception/invalidentityexception?callerId=" + this.id + "&message=message&errorsId=errors.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public ImmutableList<String> getErrors() {
        return (ImmutableList<String>) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static InvalidEntityException getObject(int id) {
        InvalidEntityException obj = (InvalidEntityException) new Object();
        obj.id = id;
        return obj;
    }
}

