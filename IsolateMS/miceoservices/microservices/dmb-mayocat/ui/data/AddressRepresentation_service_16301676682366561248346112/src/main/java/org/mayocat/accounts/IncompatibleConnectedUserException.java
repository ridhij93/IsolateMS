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
 * @version $Id: 238ceeb42db4bd7f3a7f2011d8cfb131ff0bca89 $
 */
public class IncompatibleConnectedUserException extends Exception {

    public IncompatibleConnectedUserException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/incompatibleconnecteduserexception/incompatibleconnecteduserexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public IncompatibleConnectedUserException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/incompatibleconnecteduserexception/incompatibleconnecteduserexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static IncompatibleConnectedUserException getObject(int id) {
        IncompatibleConnectedUserException obj = (IncompatibleConnectedUserException) new Object();
        obj.id = id;
        return obj;
    }
}

