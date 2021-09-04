/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

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
@RequestMapping("/ms0/entityalreadyexistsexception/")
public class EntityAlreadyExistsExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityAlreadyExistsExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entityalreadyexistsexception")
    public  @ResponseBody int EntityAlreadyExistsException() {
        EntityAlreadyExistsExceptionServer newServerObj = new EntityAlreadyExistsExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "entityalreadyexistsexception")
    public  @ResponseBody int EntityAlreadyExistsException(@RequestParam String message) {
        EntityAlreadyExistsExceptionServer newServerObj = new EntityAlreadyExistsExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

