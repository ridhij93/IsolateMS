/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.store.jdbi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.validation.Valid;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Entity;
import org.mayocat.model.EntityAndCount;
import org.mayocat.model.EntityAndParent;
import org.mayocat.model.PositionedEntity;
import org.mayocat.model.event.EntityCreatedEvent;
import org.mayocat.model.event.EntityCreatingEvent;
import org.mayocat.model.event.EntityUpdatedEvent;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.model.ProductCollection;
import org.mayocat.shop.catalog.store.CollectionStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.InvalidMoveOperation;
import org.mayocat.store.StoreException;
import org.mayocat.store.rdbms.dbi.DBIEntityStore;
import org.mayocat.store.rdbms.dbi.MoveEntityInListOperation;
import mayoapp.dao.CollectionDAO;
import mayoapp.dao.ProductDAO;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import static org.mayocat.addons.util.AddonUtils.asMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component(hints = { "jdbi", "default" })
public class DBICollectionStoreWrapper {

    // Helpers
    // -----------------------------------------------------------------------------------------------------------------
    private static int maxId = 0;

    public static HashMap<Integer, DBICollectionStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbicollectionstore")
    public  @ResponseBody int DBICollectionStore() {
        DBICollectionStoreServer newServerObj = new DBICollectionStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // Helpers
    // -----------------------------------------------------------------------------------------------------------------
}

