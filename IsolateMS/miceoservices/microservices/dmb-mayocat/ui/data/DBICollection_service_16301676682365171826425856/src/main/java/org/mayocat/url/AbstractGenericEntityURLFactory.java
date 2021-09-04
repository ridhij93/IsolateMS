/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.url;

import java.net.URL;
import javax.inject.Inject;
import org.jvnet.inflector.Noun;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.model.Entity;
import org.mayocat.model.annotation.PluralForm;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 4ebde75bb06f608d70b85a6146aa1cf77d0df928 $
 */
public abstract class AbstractGenericEntityURLFactory<E extends Entity> implements EntityURLFactory<E> {

    @Override
    public URL create(E entity, Tenant tenant) {
        return (URL) null;
    }

    @Override
    public URL create(E entity) {
        return (URL) null;
    }

    @Override
    public URL create(E entity, Tenant tenant, URLType type) {
        return (URL) null;
    }

    protected String getPluralForm(E entity) {
        return (String) null;
    }

    protected abstract String getEntityName(E entity) {
        return (String) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public void setUrlHelper(URLHelper urlHelper) {
        return;
    }

    public URLHelper getUrlHelper() {
        return (URLHelper) null;
    }

    public int id = 0;

    public static AbstractGenericEntityURLFactory getObject(int id) {
        AbstractGenericEntityURLFactory obj = (AbstractGenericEntityURLFactory) new Object();
        obj.id = id;
        return obj;
    }
}

