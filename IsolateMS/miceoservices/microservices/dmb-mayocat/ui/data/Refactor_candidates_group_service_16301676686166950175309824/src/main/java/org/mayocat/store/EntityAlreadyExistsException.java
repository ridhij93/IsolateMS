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

public class EntityAlreadyExistsException extends Exception {

    public EntityAlreadyExistsException() {
        String uri = MicroserviceApplication.projectUri + "/ms0/entityalreadyexistsexception/entityalreadyexistsexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public EntityAlreadyExistsException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms0/entityalreadyexistsexception/entityalreadyexistsexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static EntityAlreadyExistsException getObject(int id) {
        EntityAlreadyExistsException obj = (EntityAlreadyExistsException) new Object();
        obj.id = id;
        return obj;
    }
}

