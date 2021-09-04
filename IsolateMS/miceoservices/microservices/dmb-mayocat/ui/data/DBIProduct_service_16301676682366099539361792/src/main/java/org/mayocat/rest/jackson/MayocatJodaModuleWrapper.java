/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import java.io.IOException;
import org.joda.time.DateTime;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms1/mayocatjodamodule/")
public class MayocatJodaModuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MayocatJodaModuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mayocatjodamodule")
    public  @ResponseBody int MayocatJodaModule() {
        MayocatJodaModuleServer newServerObj = new MayocatJodaModuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

