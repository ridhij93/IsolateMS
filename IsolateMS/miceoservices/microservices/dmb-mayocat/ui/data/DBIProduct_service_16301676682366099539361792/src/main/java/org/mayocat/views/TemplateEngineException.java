/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 34f8192ededaacf421d8d2a3e84e7378c6089c2c $
 */
public class TemplateEngineException extends Exception {

    public TemplateEngineException() {
        String uri = MicroserviceApplication.projectUri + "/ms2/templateengineexception/templateengineexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateEngineException(Throwable t) {
        String uri = MicroserviceApplication.projectUri + "/ms2/templateengineexception/templateengineexception?callerId=" + this.id + "&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateEngineException(String message, Throwable t) {
        String uri = MicroserviceApplication.projectUri + "/ms2/templateengineexception/templateengineexception?callerId=" + this.id + "&message=message&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static TemplateEngineException getObject(int id) {
        TemplateEngineException obj = (TemplateEngineException) new Object();
        obj.id = id;
        return obj;
    }
}

