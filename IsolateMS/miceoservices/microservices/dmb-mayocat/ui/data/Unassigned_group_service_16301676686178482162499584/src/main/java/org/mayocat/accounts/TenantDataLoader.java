/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.context.WebContext;
import org.mayocat.entity.DataLoaderAssistant;
import org.mayocat.entity.EntityData;
import org.mayocat.entity.LoadingOption;
import org.mayocat.model.Entity;
import org.mayocat.model.Owned;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7f0b406dd9bf02f29bfa09d76b092bb931449f5a $
 */
@Component("tenant")
public class TenantDataLoader implements DataLoaderAssistant {

    public <E extends Entity> void load(EntityData<E> entity, LoadingOption... options) {
        return;
    }

    public <E extends Entity> void loadList(List<EntityData<E>> entities, LoadingOption... options) {
        return;
    }

    public Integer priority() {
        return (Integer) null;
    }

    public void setTenantStore(Provider<TenantStore> tenantStore) {
        return;
    }

    public Provider<TenantStore> getTenantStore() {
        return (Provider<TenantStore>) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static TenantDataLoader getObject(int id) {
        TenantDataLoader obj = (TenantDataLoader) new Object();
        obj.id = id;
        return obj;
    }
}

