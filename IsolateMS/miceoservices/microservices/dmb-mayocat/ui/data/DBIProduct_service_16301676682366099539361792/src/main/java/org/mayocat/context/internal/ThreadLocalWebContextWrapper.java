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
import javax.inject.Singleton;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.User;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.context.WebContext;
import org.mayocat.context.request.WebRequest;
import org.mayocat.context.scope.Flash;
import org.mayocat.context.scope.Session;
import org.mayocat.theme.Theme;
import org.xwiki.component.annotation.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Singleton
public class ThreadLocalWebContextWrapper {

    // -----------------------------------------------------------------------------------------------------------------
    // Wrapped methods
    private static int maxId = 0;

    public static HashMap<Integer, ThreadLocalWebContextServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "threadlocalwebcontext")
    public  @ResponseBody int ThreadLocalWebContext() {
        ThreadLocalWebContextServer newServerObj = new ThreadLocalWebContextServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // -----------------------------------------------------------------------------------------------------------------
    // Wrapped methods
}

