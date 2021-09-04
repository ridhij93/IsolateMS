/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

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
 * @version $Id: b774a826cbf64ca907bb2d511cdddc1357549d32 $
 */
@Controller
@RequestMapping("/ms1/templatenotfoundexception/")
public class TemplateNotFoundExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TemplateNotFoundExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "templatenotfoundexception")
    public  @ResponseBody int TemplateNotFoundException() {
        TemplateNotFoundExceptionServer newServerObj = new TemplateNotFoundExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templatenotfoundexception")
    public  @ResponseBody int TemplateNotFoundException(@RequestParam String message) {
        TemplateNotFoundExceptionServer newServerObj = new TemplateNotFoundExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "templatenotfoundexception")
    public  @ResponseBody int TemplateNotFoundException(@RequestParam int tId) {
        TemplateNotFoundExceptionServer newServerObj = new TemplateNotFoundExceptionServer(Throwable.getObject(tId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

