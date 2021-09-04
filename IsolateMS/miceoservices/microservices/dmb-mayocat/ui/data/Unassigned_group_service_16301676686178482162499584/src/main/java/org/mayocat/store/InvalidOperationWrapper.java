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

/**
 * @version $Id: 42709486f2ca9c7b06fa5d0162dd6ca3abe99192 $
 */
@Controller
@RequestMapping("/ms5/invalidoperation/")
public class InvalidOperationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvalidOperationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "invalidoperation")
    public  @ResponseBody int InvalidOperation() {
        InvalidOperationServer newServerObj = new InvalidOperationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invalidoperation")
    public  @ResponseBody int InvalidOperation(@RequestParam String message) {
        InvalidOperationServer newServerObj = new InvalidOperationServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

