/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.store.memory;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.mayocat.model.EntityAndParent;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Feature;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.InvalidMoveOperation;
import org.mayocat.store.memory.AbstractPositionedEntityMemoryStore;
import org.mayocat.store.memory.DefaultPositionedEntity;
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
 * In-memory implementation of {@link ProductStore}
 *
 * @version $Id: 8358eb27669bcf3e84096d8814aff9fff04d3ebc $
 */
@Component("memory")
public class MemoryProductStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryProductStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memoryproductstore")
    public  @ResponseBody int MemoryProductStore() {
        MemoryProductStoreServer newServerObj = new MemoryProductStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

