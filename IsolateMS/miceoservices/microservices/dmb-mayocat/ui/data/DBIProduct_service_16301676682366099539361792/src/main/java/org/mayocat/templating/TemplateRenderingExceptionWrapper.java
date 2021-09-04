/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.templating;

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
 * @version $Id: 62e6aff96cf22b95e02320414094492825914c5f $
 */
@Controller
@RequestMapping("/ms1/templaterenderingexception/")
public class TemplateRenderingExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TemplateRenderingExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "templaterenderingexception")
    public  @ResponseBody int TemplateRenderingException() {
        TemplateRenderingExceptionServer newServerObj = new TemplateRenderingExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templaterenderingexception")
    public  @ResponseBody int TemplateRenderingException(@RequestParam String message) {
        TemplateRenderingExceptionServer newServerObj = new TemplateRenderingExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templaterenderingexception")
    public  @ResponseBody int TemplateRenderingException(@RequestParam String message, @RequestParam int causeId) {
        TemplateRenderingExceptionServer newServerObj = new TemplateRenderingExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templaterenderingexception")
    public  @ResponseBody int TemplateRenderingException(@RequestParam int causeId) {
        TemplateRenderingExceptionServer newServerObj = new TemplateRenderingExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templaterenderingexception")
    public  @ResponseBody int TemplateRenderingException(@RequestParam String message, @RequestParam int causeId, @RequestParam boolean enableSuppression, @RequestParam boolean writableStackTrace) {
        TemplateRenderingExceptionServer newServerObj = new TemplateRenderingExceptionServer(message, Throwable.getObject(causeId), enableSuppression, writableStackTrace);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

