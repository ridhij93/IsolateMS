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
 * @version $Id: b1ae7a2624b25c6f15be9eed17e06a9862e2af1a $
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/usernotfoundexception/usernotfoundexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UserNotFoundException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms5/usernotfoundexception/usernotfoundexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static UserNotFoundException getObject(int id) {
        UserNotFoundException obj = (UserNotFoundException) new Object();
        obj.id = id;
        return obj;
    }
}

