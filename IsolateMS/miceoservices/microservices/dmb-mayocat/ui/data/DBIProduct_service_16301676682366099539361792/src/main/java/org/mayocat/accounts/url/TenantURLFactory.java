/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.url;

import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.url.EntityURLFactory;
import org.mayocat.url.URLHelper;
import org.mayocat.url.URLType;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 5da1a269d67102542c503ca560ef904fd8adfd70 $
 */
@Component
public class TenantURLFactory implements EntityURLFactory<Tenant> {

    public URL create(Tenant entity, Tenant tenant) {
        return (URL) null;
    }

    @Override
    public URL create(Tenant entity) {
        return (URL) null;
    }

    @Override
    public URL create(Tenant entity, Tenant tenant, URLType type) {
        return (URL) null;
    }

    public void setUrlHelper(URLHelper urlHelper) {
        return;
    }

    public URLHelper getUrlHelper() {
        return (URLHelper) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static TenantURLFactory getObject(int id) {
        TenantURLFactory obj = (TenantURLFactory) new Object();
        obj.id = id;
        return obj;
    }
}

