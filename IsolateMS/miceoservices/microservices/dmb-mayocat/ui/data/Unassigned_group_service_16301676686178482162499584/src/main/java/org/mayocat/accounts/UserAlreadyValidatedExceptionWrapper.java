/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

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
 * @version $Id: 116b94a26dfacb27c26f654f0b3e45439d2c2274 $
 */
@Controller
@RequestMapping("/ms5/useralreadyvalidatedexception/")
public class UserAlreadyValidatedExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, UserAlreadyValidatedExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "useralreadyvalidatedexception")
    public  @ResponseBody int UserAlreadyValidatedException() {
        UserAlreadyValidatedExceptionServer newServerObj = new UserAlreadyValidatedExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "useralreadyvalidatedexception")
    public  @ResponseBody int UserAlreadyValidatedException(@RequestParam String message) {
        UserAlreadyValidatedExceptionServer newServerObj = new UserAlreadyValidatedExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

