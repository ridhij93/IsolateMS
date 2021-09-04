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
 * @version $Id: fc9bc9353b5ab23f83a45f1b35d5f7e98a02668e $
 */
@Controller
@RequestMapping("/ms5/nosuchvalidationkeyexception/")
public class NoSuchValidationKeyExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, NoSuchValidationKeyExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "nosuchvalidationkeyexception")
    public  @ResponseBody int NoSuchValidationKeyException() {
        NoSuchValidationKeyExceptionServer newServerObj = new NoSuchValidationKeyExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "nosuchvalidationkeyexception")
    public  @ResponseBody int NoSuchValidationKeyException(@RequestParam String message) {
        NoSuchValidationKeyExceptionServer newServerObj = new NoSuchValidationKeyExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

