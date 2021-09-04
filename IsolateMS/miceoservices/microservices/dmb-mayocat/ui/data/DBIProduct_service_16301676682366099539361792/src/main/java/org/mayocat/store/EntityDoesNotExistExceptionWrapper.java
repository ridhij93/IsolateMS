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
@RequestMapping("/ms1/entitydoesnotexistexception/")
public class EntityDoesNotExistExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, EntityDoesNotExistExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entitydoesnotexistexception")
    public  @ResponseBody int EntityDoesNotExistException() {
        EntityDoesNotExistExceptionServer newServerObj = new EntityDoesNotExistExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "entitydoesnotexistexception")
    public  @ResponseBody int EntityDoesNotExistException(@RequestParam String message) {
        EntityDoesNotExistExceptionServer newServerObj = new EntityDoesNotExistExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

