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
 * In-memory implementation of {@link TenantStore}.
 *
 * @version $Id: e25a7ddc511ab2623677fd7fed4c6670530d7563 $
 */
@Component("memory")
public class MemoryTenantStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryTenantStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memorytenantstore")
    public  @ResponseBody int MemoryTenantStore() {
        MemoryTenantStoreServer newServerObj = new MemoryTenantStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

