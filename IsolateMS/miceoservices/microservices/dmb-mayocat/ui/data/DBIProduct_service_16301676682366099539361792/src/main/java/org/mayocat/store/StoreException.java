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

public class StoreException extends RuntimeException {

    public StoreException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/storeexception/storeexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public StoreException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/storeexception/storeexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public StoreException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/storeexception/storeexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public StoreException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/storeexception/storeexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static StoreException getObject(int id) {
        StoreException obj = (StoreException) new Object();
        obj.id = id;
        return obj;
    }
}

