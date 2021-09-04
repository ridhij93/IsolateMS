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

/**
 * @version $Id: 5da1a269d67102542c503ca560ef904fd8adfd70 $
 */
@Component
public class TenantURLFactoryServer implements EntityURLFactory<Tenant> {

    @Inject
    private URLHelper urlHelper;

    @Inject
    private WebContext context;

    public URL create(Tenant entity, Tenant tenant) {
        return this.create(entity, tenant, URLType.getPUBLIC());
    }

    @Override
    public URL create(Tenant entity) {
        return this.create(entity, this.context.getTenant(), URLType.getPUBLIC());
    }

    @Override
    public URL create(Tenant entity, Tenant tenant, URLType type) {
        switch(type) {
            case API:
                return urlHelper.getTenantPlatformURL(tenant, "/api/tenant/");
            case PUBLIC:
            default:
                return urlHelper.getTenantPlatformURL(tenant, "");
        }
    }

    public void setUrlHelper(URLHelper urlHelper) {
        this.urlHelper = urlHelper;
    }

    public URLHelper getUrlHelper() {
        return urlHelper;
    }

    public void setContext(WebContext context) {
        this.context = context;
    }

    public WebContext getContext() {
        return context;
    }
}

