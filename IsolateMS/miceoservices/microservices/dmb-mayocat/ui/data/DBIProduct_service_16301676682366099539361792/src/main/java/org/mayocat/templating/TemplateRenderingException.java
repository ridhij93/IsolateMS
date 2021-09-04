/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.templating;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 62e6aff96cf22b95e02320414094492825914c5f $
 */
public class TemplateRenderingException extends Exception {

    public TemplateRenderingException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/templaterenderingexception/templaterenderingexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateRenderingException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/templaterenderingexception/templaterenderingexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateRenderingException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/templaterenderingexception/templaterenderingexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateRenderingException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/templaterenderingexception/templaterenderingexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public TemplateRenderingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        String uri = MicroserviceApplication.projectUri + "/ms1/templaterenderingexception/templaterenderingexception?callerId=" + this.id + "&message=message&causeId=cause.id&enableSuppression=enableSuppression&writableStackTrace=writableStackTrace";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static TemplateRenderingException getObject(int id) {
        TemplateRenderingException obj = (TemplateRenderingException) new Object();
        obj.id = id;
        return obj;
    }
}

