/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import groovy.lang.GString;
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
 * Jackson module for the groovy language.
 *
 * @version $Id: 24dec349b2441b5ed1904794a52eee128fd07556 $
 */
@Controller
@RequestMapping("/ms0/mayocatgroovymodule/")
public class MayocatGroovyModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MayocatGroovyModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mayocatgroovymodule")
    public  @ResponseBody int MayocatGroovyModule() {
        MayocatGroovyModuleServer newServerObj = new MayocatGroovyModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

