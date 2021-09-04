/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.List;
import java.util.UUID;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.model.Entity;
import org.mayocat.model.EntityAndCount;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.model.ProductCollection;
import org.mayocat.shop.catalog.store.jdbi.mapper.CollectionMapper;
import org.mayocat.shop.catalog.store.jdbi.mapper.ProductCollectionMapper;
import org.mayocat.store.rdbms.dbi.extraction.EntityExtractor;
import org.mayocat.store.rdbms.dbi.jointype.EntityAndCountsJoinRow;
import org.mayocat.store.rdbms.dbi.mapper.EntityAndCountsJoinRowMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlBatch;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import org.skife.jdbi.v2.unstable.BindIn;
import com.google.common.collect.ImmutableList;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@UseStringTemplate3StatementLocator
@RegisterMapper({ CollectionMapper.class, ProductCollectionMapper.class })
public abstract class CollectionDAOWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CollectionDAOServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "collectiondao")
    public  @ResponseBody int CollectionDAO() {
        CollectionDAOServer newServerObj = new CollectionDAOServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

