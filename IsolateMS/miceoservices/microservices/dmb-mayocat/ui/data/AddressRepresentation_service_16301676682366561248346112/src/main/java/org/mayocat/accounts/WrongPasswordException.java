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
 * @version $Id: e0c3e222b59c34fd229d4f3f25a813507721d6d7 $
 */
public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/wrongpasswordexception/wrongpasswordexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public WrongPasswordException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/wrongpasswordexception/wrongpasswordexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static WrongPasswordException getObject(int id) {
        WrongPasswordException obj = (WrongPasswordException) new Object();
        obj.id = id;
        return obj;
    }
}

