/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Exception related to the sending of emails
 *
 * @version $Id: f953c90fbede6f1e2a116e00dc613db18c6ef229 $
 */
public class MailException extends Exception {

    public MailException() {
        String uri = MicroserviceApplication.projectUri + "/ms2/mailexception/mailexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public MailException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms2/mailexception/mailexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public MailException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms2/mailexception/mailexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public MailException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms2/mailexception/mailexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static MailException getObject(int id) {
        MailException obj = (MailException) new Object();
        obj.id = id;
        return obj;
    }
}

