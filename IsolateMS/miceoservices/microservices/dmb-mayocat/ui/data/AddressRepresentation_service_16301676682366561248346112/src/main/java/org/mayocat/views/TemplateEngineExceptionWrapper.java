/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views;

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
 * @version $Id: 34f8192ededaacf421d8d2a3e84e7378c6089c2c $
 */
@Controller
@RequestMapping("/ms2/templateengineexception/")
public class TemplateEngineExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TemplateEngineExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "templateengineexception")
    public  @ResponseBody int TemplateEngineException() {
        TemplateEngineExceptionServer newServerObj = new TemplateEngineExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templateengineexception")
    public  @ResponseBody int TemplateEngineException(@RequestParam int tId) {
        TemplateEngineExceptionServer newServerObj = new TemplateEngineExceptionServer(Throwable.getObject(tId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templateengineexception")
    public  @ResponseBody int TemplateEngineException(@RequestParam String message, @RequestParam int tId) {
        TemplateEngineExceptionServer newServerObj = new TemplateEngineExceptionServer(message, Throwable.getObject(tId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

