/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b774a826cbf64ca907bb2d511cdddc1357549d32 $
 */
public class TemplateNotFoundException extends Exception {

    public TemplateNotFoundException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/templatenotfoundexception/templatenotfoundexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateNotFoundException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/templatenotfoundexception/templatenotfoundexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateNotFoundException(Throwable t) {
        String uri = MicroserviceApplication.projectUri + "/ms1/templatenotfoundexception/templatenotfoundexception?callerId=" + this.id + "&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static TemplateNotFoundException getObject(int id) {
        TemplateNotFoundException obj = (TemplateNotFoundException) new Object();
        obj.id = id;
        return obj;
    }
}

