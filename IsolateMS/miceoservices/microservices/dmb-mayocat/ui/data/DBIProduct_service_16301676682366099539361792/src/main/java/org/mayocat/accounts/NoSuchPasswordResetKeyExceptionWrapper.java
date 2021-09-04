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
 * @version $Id: d9df1d77df0f2f655be3bdd3381efdb40a9330bf $
 */
@Controller
@RequestMapping("/ms1/nosuchpasswordresetkeyexception/")
public class NoSuchPasswordResetKeyExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, NoSuchPasswordResetKeyExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "nosuchpasswordresetkeyexception")
    public  @ResponseBody int NoSuchPasswordResetKeyException() {
        NoSuchPasswordResetKeyExceptionServer newServerObj = new NoSuchPasswordResetKeyExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "nosuchpasswordresetkeyexception")
    public  @ResponseBody int NoSuchPasswordResetKeyException(@RequestParam String message) {
        NoSuchPasswordResetKeyExceptionServer newServerObj = new NoSuchPasswordResetKeyExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

