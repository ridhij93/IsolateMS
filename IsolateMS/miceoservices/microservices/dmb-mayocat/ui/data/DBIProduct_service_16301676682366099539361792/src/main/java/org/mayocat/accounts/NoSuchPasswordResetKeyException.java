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
 * @version $Id: d9df1d77df0f2f655be3bdd3381efdb40a9330bf $
 */
public class NoSuchPasswordResetKeyException extends Exception {

    public NoSuchPasswordResetKeyException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/nosuchpasswordresetkeyexception/nosuchpasswordresetkeyexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public NoSuchPasswordResetKeyException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/nosuchpasswordresetkeyexception/nosuchpasswordresetkeyexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static NoSuchPasswordResetKeyException getObject(int id) {
        NoSuchPasswordResetKeyException obj = (NoSuchPasswordResetKeyException) new Object();
        obj.id = id;
        return obj;
    }
}

