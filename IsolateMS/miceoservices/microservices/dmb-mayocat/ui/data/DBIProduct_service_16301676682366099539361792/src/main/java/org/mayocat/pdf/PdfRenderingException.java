/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.pdf;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7bb191b962bb8e61fe8258b9363ca5533983eadb $
 */
public class PdfRenderingException extends Exception {

    public PdfRenderingException() {
        String uri = MicroserviceApplication.projectUri + "/ms1/pdfrenderingexception/pdfrenderingexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PdfRenderingException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms1/pdfrenderingexception/pdfrenderingexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PdfRenderingException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/pdfrenderingexception/pdfrenderingexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PdfRenderingException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms1/pdfrenderingexception/pdfrenderingexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PdfRenderingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        String uri = MicroserviceApplication.projectUri + "/ms1/pdfrenderingexception/pdfrenderingexception?callerId=" + this.id + "&message=message&causeId=cause.id&enableSuppression=enableSuppression&writableStackTrace=writableStackTrace";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static PdfRenderingException getObject(int id) {
        PdfRenderingException obj = (PdfRenderingException) new Object();
        obj.id = id;
        return obj;
    }
}

