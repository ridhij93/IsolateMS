/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context.internal;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.User;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.context.WebContext;
import org.mayocat.context.request.WebRequest;
import org.mayocat.context.scope.Flash;
import org.mayocat.context.scope.Session;
import org.mayocat.context.scope.cookie.CookieFlash;
import org.mayocat.context.scope.cookie.CookieSession;
import org.mayocat.theme.Breakpoint;
import org.mayocat.theme.Theme;
import com.google.common.base.Optional;
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
 * Default implementation of {@link WebContext}
 *
 * @version $Id: b13092035da000905c709872fcbd110d1037b0b8 $
 */
@Controller
@RequestMapping("/ms1/defaultwebcontext/")
public class DefaultWebContextWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultWebContextServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultwebcontext")
    public  @ResponseBody int DefaultWebContext(@RequestParam int tenantId, @RequestParam int userId) {
        DefaultWebContextServer newServerObj = new DefaultWebContextServer(Tenant.getObject(tenantId), User.getObject(userId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

