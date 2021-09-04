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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: fd96572808c3d881632ea53a76357f94a4e9c9b8 $
 */
public class SessionScopeCookieContainerFilter extends AbstractScopeCookieContainerFilter<Session> {

    @Override
    protected int getCookieDuration() {
        return (Integer) null;
    }

    @Override
    protected String getScopeAndCookieName() {
        return (String) null;
    }

    @Override
    protected Session getScope(WebContext context) {
        return (Session) null;
    }

    @Override
    protected void setScope(WebContext context, Session session) {
        return;
    }

    @Override
    protected boolean encryptAndSign() {
        return (Boolean) null;
    }

    @Override
    protected Session cast(Object object) {
        return (Session) null;
    }

    @Override
    protected boolean scopeExistsAndNotEmpty(WebContext context) {
        return (Boolean) null;
    }

    public int id = 0;

    public static SessionScopeCookieContainerFilter getObject(int id) {
        SessionScopeCookieContainerFilter obj = (SessionScopeCookieContainerFilter) new Object();
        obj.id = id;
        return obj;
    }
}

