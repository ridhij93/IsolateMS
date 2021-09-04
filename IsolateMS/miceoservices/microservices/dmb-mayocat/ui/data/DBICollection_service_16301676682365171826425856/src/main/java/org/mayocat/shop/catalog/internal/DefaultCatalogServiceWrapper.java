/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.internal;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.Slugifier;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.store.CollectionStore;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.model.EntityAndCount;
import org.mayocat.shop.catalog.CatalogService;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.HasOrderedCollections;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.InvalidMoveOperation;
import org.mayocat.store.InvalidOperation;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Strings;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class DefaultCatalogServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultCatalogServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultcatalogservice")
    public  @ResponseBody int DefaultCatalogService() {
        DefaultCatalogServiceServer newServerObj = new DefaultCatalogServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

