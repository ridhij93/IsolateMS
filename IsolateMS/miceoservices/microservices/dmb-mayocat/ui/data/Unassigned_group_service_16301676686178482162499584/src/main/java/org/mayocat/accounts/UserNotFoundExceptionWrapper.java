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
 * @version $Id: b1ae7a2624b25c6f15be9eed17e06a9862e2af1a $
 */
@Controller
@RequestMapping("/ms5/usernotfoundexception/")
public class UserNotFoundExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, UserNotFoundExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "usernotfoundexception")
    public  @ResponseBody int UserNotFoundException() {
        UserNotFoundExceptionServer newServerObj = new UserNotFoundExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "usernotfoundexception")
    public  @ResponseBody int UserNotFoundException(@RequestParam String message) {
        UserNotFoundExceptionServer newServerObj = new UserNotFoundExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

