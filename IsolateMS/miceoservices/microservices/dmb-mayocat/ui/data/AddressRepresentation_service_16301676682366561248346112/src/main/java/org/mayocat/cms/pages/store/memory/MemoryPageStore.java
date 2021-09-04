/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages.store.memory;

import java.util.List;
import org.mayocat.cms.pages.model.Page;
import org.mayocat.cms.pages.store.PageStore;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import com.google.common.collect.FluentIterable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link PageStore}.
 *
 * @version $Id: 11314d66d3c5383c51b8e16d06f6f81b9b09a308 $
 */
public class MemoryPageStore extends BaseEntityMemoryStore<Page> implements PageStore {

    @Override
    public Page findBySlug(String slug) {
        return (Page) null;
    }

    @Override
    public List<Page> findAllRootPages() {
        return (List<Page>) null;
    }

    public int id = 0;

    public static MemoryPageStore getObject(int id) {
        MemoryPageStore obj = (MemoryPageStore) new Object();
        obj.id = id;
        return obj;
    }
}

