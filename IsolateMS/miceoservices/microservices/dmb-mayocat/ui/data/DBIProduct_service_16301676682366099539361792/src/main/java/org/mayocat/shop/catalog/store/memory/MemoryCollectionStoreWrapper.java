/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.store.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.mayocat.model.Entity;
import org.mayocat.model.EntityAndCount;
import org.mayocat.model.EntityAndParent;
import org.mayocat.model.PositionedEntity;
import org.mayocat.model.Slug;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.model.ProductCollection;
import org.mayocat.shop.catalog.store.CollectionStore;
import org.mayocat.store.InvalidMoveOperation;
import org.mayocat.store.memory.AbstractPositionedEntityMemoryStore;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Function;
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
 * In-memory implementation of {@link org.mayocat.shop.catalog.store.CollectionStore}
 *
 * @version $Id: 0025a15726276c253b53e84ef6c1acac9cf99788 $
 */
@Component("memory")
public class MemoryCollectionStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryCollectionStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memorycollectionstore")
    public  @ResponseBody int MemoryCollectionStore() {
        MemoryCollectionStoreServer newServerObj = new MemoryCollectionStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

