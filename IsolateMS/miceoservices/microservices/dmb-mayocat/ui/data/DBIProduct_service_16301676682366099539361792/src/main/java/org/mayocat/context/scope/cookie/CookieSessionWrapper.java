/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context.scope.cookie;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.mayocat.context.scope.Session;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
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
 * @version $Id: 35c7e0412d34b4ac3ceab1e0861023465d535f7f $
 */
@Controller
@RequestMapping("/ms1/cookiesession/")
public class CookieSessionWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getattributes")
    public @ResponseBody Integer getAttributes(@RequestParam int callerId) {
        CookieSessionServer callerObj = idObjMap.get(callerId);
        Map<String, Serializable> result = callerObj.getAttributes();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, CookieSessionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cookiesession")
    public  @ResponseBody int CookieSession() {
        CookieSessionServer newServerObj = new CookieSessionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

