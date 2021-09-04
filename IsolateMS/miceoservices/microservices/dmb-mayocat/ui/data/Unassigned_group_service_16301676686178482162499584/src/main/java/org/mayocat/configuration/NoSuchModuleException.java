/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: ce68102279969b1e00cb6e8bacf39d270b766361 $
 */
public class NoSuchModuleException extends Exception {

    public NoSuchModuleException() {
        String uri = MicroserviceApplication.projectUri + "/ms5/nosuchmoduleexception/nosuchmoduleexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static NoSuchModuleException getObject(int id) {
        NoSuchModuleException obj = (NoSuchModuleException) new Object();
        obj.id = id;
        return obj;
    }
}

