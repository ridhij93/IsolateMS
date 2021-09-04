/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Exception related to the sending of emails
 *
 * @version $Id: f953c90fbede6f1e2a116e00dc613db18c6ef229 $
 */
@Controller
@RequestMapping("/ms2/mailexception/")
public class MailExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MailExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mailexception")
    public  @ResponseBody int MailException() {
        MailExceptionServer newServerObj = new MailExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "mailexception")
    public  @ResponseBody int MailException(@RequestParam String message) {
        MailExceptionServer newServerObj = new MailExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "mailexception")
    public  @ResponseBody int MailException(@RequestParam String message, @RequestParam int causeId) {
        MailExceptionServer newServerObj = new MailExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "mailexception")
    public  @ResponseBody int MailException(@RequestParam int causeId) {
        MailExceptionServer newServerObj = new MailExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

