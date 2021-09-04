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
 * @version $Id: 116b94a26dfacb27c26f654f0b3e45439d2c2274 $
 */
public class UserAlreadyValidatedException extends Exception {

    public UserAlreadyValidatedException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/useralreadyvalidatedexception/useralreadyvalidatedexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UserAlreadyValidatedException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/useralreadyvalidatedexception/useralreadyvalidatedexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static UserAlreadyValidatedException getObject(int id) {
        UserAlreadyValidatedException obj = (UserAlreadyValidatedException) new Object();
        obj.id = id;
        return obj;
    }
}

