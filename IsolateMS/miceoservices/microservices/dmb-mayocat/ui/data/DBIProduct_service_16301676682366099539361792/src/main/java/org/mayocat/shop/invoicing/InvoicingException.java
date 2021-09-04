/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c706977d9442484d5e2d63e870eb3353f29306b6 $
 */
public class InvoicingException extends Exception {

    public InvoicingException() {
        String uri = MicroserviceApplication.projectUri + "/ms0/invoicingexception/invoicingexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvoicingException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms0/invoicingexception/invoicingexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvoicingException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms0/invoicingexception/invoicingexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvoicingException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms0/invoicingexception/invoicingexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvoicingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        String uri = MicroserviceApplication.projectUri + "/ms0/invoicingexception/invoicingexception?callerId=" + this.id + "&message=message&causeId=cause.id&enableSuppression=enableSuppression&writableStackTrace=writableStackTrace";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static InvoicingException getObject(int id) {
        InvoicingException obj = (InvoicingException) new Object();
        obj.id = id;
        return obj;
    }
}

