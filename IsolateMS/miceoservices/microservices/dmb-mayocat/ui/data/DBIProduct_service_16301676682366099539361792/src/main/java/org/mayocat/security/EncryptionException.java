/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.security;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class EncryptionException extends Exception {

    public EncryptionException() {
        String uri = MicroserviceApplication.projectUri + "/ms0/encryptionexception/encryptionexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public EncryptionException(Throwable t) {
        String uri = MicroserviceApplication.projectUri + "/ms0/encryptionexception/encryptionexception?callerId=" + this.id + "&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public EncryptionException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms0/encryptionexception/encryptionexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public EncryptionException(String message, Throwable t) {
        String uri = MicroserviceApplication.projectUri + "/ms0/encryptionexception/encryptionexception?callerId=" + this.id + "&message=message&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static EncryptionException getObject(int id) {
        EncryptionException obj = (EncryptionException) new Object();
        obj.id = id;
        return obj;
    }
}

