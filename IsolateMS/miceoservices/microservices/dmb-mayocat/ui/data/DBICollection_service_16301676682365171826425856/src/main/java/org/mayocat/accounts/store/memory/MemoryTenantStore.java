/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.store.memory;

import javax.annotation.Nullable;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.model.TenantConfiguration;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.context.WebContext;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link TenantStore}.
 *
 * @version $Id: e25a7ddc511ab2623677fd7fed4c6670530d7563 $
 */
@Component("memory")
public class MemoryTenantStore extends BaseEntityMemoryStore<Tenant> implements TenantStore {

    private Predicate<? super Tenant> withDefaultHost(final String host) {
        return (Predicate<? super Tenant>) null;
    }

    public Tenant findBySlug(String slug) {
        return (Tenant) null;
    }

    public Tenant findByDefaultHost(String host) {
        return (Tenant) null;
    }

    public void updateConfiguration(TenantConfiguration configuration) {
        return;
    }

    public int id = 0;

    public static MemoryTenantStore getObject(int id) {
        MemoryTenantStore obj = (MemoryTenantStore) new Object();
        obj.id = id;
        return obj;
    }
}

