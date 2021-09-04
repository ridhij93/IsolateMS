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
 * @version $Id: e0c3e222b59c34fd229d4f3f25a813507721d6d7 $
 */
@Controller
@RequestMapping("/ms5/wrongpasswordexception/")
public class WrongPasswordExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, WrongPasswordExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "wrongpasswordexception")
    public  @ResponseBody int WrongPasswordException() {
        WrongPasswordExceptionServer newServerObj = new WrongPasswordExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "wrongpasswordexception")
    public  @ResponseBody int WrongPasswordException(@RequestParam String message) {
        WrongPasswordExceptionServer newServerObj = new WrongPasswordExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

