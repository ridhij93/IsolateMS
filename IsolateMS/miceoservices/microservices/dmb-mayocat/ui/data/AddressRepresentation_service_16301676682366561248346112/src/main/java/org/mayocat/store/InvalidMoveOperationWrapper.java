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
 * @version $Id: 15e0e4ae75c4066ed9d91d8feec90d42c3f97659 $
 */
@Controller
@RequestMapping("/ms2/invalidmoveoperation/")
public class InvalidMoveOperationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, InvalidMoveOperationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "invalidmoveoperation")
    public  @ResponseBody int InvalidMoveOperation() {
        InvalidMoveOperationServer newServerObj = new InvalidMoveOperationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "invalidmoveoperation")
    public  @ResponseBody int InvalidMoveOperation(@RequestParam String message) {
        InvalidMoveOperationServer newServerObj = new InvalidMoveOperationServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

