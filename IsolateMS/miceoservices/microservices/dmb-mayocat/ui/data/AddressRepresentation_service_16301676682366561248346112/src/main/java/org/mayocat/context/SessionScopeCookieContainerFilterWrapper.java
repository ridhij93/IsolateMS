/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context;

import org.mayocat.context.scope.Session;
import org.mayocat.context.scope.cookie.CookieSession;
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
 * @version $Id: fd96572808c3d881632ea53a76357f94a4e9c9b8 $
 */
@Controller
@RequestMapping("/ms2/sessionscopecookiecontainerfilter/")
public class SessionScopeCookieContainerFilterWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SessionScopeCookieContainerFilterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "sessionscopecookiecontainerfilter")
    public  @ResponseBody int SessionScopeCookieContainerFilter() {
        SessionScopeCookieContainerFilterServer newServerObj = new SessionScopeCookieContainerFilterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

