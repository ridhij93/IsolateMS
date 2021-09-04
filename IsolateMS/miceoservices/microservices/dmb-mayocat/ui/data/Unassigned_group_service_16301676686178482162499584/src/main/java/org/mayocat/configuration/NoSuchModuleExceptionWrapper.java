/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

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
 * @version $Id: ce68102279969b1e00cb6e8bacf39d270b766361 $
 */
@Controller
@RequestMapping("/ms5/nosuchmoduleexception/")
public class NoSuchModuleExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, NoSuchModuleExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "nosuchmoduleexception")
    public  @ResponseBody int NoSuchModuleException() {
        NoSuchModuleExceptionServer newServerObj = new NoSuchModuleExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

