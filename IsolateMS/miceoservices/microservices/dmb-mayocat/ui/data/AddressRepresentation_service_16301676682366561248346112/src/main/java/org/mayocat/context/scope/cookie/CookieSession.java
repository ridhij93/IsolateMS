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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 35c7e0412d34b4ac3ceab1e0861023465d535f7f $
 */
public class CookieSession implements Session {

    @Override
    public boolean isEmpty() {
        return (Boolean) null;
    }

    @Override
    public Set<String> getAttributeNames() {
        return (Set<String>) null;
    }

    @Override
    public Object getAttribute(String key) {
        return (Object) null;
    }

    @Override
    public void setAttribute(String key, Serializable value) {
        return;
    }

    @Override
    public void removeAttribute(String key) {
        return;
    }

    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setAttributes(Map<String, Serializable> attributes) {
        return;
    }

    public Map<String, Serializable> getAttributes() {
        String uri = MicroserviceApplication.projectUri + "/ms1/cookiesession/getattributescallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Map<String, Serializable> result = (Map<String, Serializable>) new Object();
        return result;
    }

    public int id = 0;

    public static CookieSession getObject(int id) {
        CookieSession obj = (CookieSession) new Object();
        obj.id = id;
        return obj;
    }
}

