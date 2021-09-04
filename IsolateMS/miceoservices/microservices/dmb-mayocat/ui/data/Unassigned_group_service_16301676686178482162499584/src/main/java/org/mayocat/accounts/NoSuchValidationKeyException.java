/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: fc9bc9353b5ab23f83a45f1b35d5f7e98a02668e $
 */
public class NoSuchValidationKeyException extends Exception {

    public NoSuchValidationKeyException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/nosuchvalidationkeyexception/nosuchvalidationkeyexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public NoSuchValidationKeyException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/nosuchvalidationkeyexception/nosuchvalidationkeyexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static NoSuchValidationKeyException getObject(int id) {
        NoSuchValidationKeyException obj = (NoSuchValidationKeyException) new Object();
        obj.id = id;
        return obj;
    }
}

