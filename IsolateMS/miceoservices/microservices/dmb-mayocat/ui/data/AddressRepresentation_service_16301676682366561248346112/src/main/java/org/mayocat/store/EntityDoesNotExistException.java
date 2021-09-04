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

public class EntityDoesNotExistException extends Exception {

    public EntityDoesNotExistException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/entitydoesnotexistexception/entitydoesnotexistexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public EntityDoesNotExistException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/entitydoesnotexistexception/entitydoesnotexistexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static EntityDoesNotExistException getObject(int id) {
        EntityDoesNotExistException obj = (EntityDoesNotExistException) new Object();
        obj.id = id;
        return obj;
    }
}

