/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context.scope.cookie;

import org.mayocat.context.scope.Flash;
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
 * Cookie based implementation of the {@link org.mayocat.context.scope.Flash} session.
 *
 * @version $Id: d224696e3e426e71a24aa1d4d1cfc27af57437c1 $
 */
@Controller
@RequestMapping("/ms2/cookieflash/")
public class CookieFlashWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CookieFlashServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cookieflash")
    public  @ResponseBody int CookieFlash() {
        CookieFlashServer newServerObj = new CookieFlashServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

