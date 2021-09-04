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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@UseStringTemplate3StatementLocator
@RegisterMapper({ CollectionMapper.class, ProductCollectionMapper.class })
public abstract class CollectionDAO implements EntityDAO<Collection>, Transactional<CollectionDAO>, PositionedDAO<Collection>, LocalizationDAO<Collection>, AddonsDAO<Collection> {

    @SqlUpdate
    public abstract void create(@Bind("position") Integer position, @BindBean("collection") Collection collection) {
        return;
    }

    @SqlUpdate
    public abstract Integer update(@BindBean("collection") Collection collection) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract Integer lastPosition(@Bind("tenantId") UUID tenant) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Collection> findAllForProduct(@BindBean("product") Product product) {
        return (List<Collection>) null;
    }

    @SqlQuery
    public abstract List<Collection> findAllChildrenOfCollection(@BindBean("collection") Collection entity) {
        return (List<Collection>) null;
    }

    @SqlQuery
    public abstract List<Collection> findAllForProductIds(@BindIn("ids") List<UUID> ids) {
        return (List<Collection>) null;
    }

    @SqlQuery
    public abstract List<ProductCollection> findAllProductsCollectionsForIds(@BindIn("ids") List<UUID> ids) {
        return (List<ProductCollection>) null;
    }

    @SqlQuery
    public abstract Integer lastProductPosition(@BindBean("collection") Collection collection) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Collection> findAllOrderedByParentAndPosition(@Bind("tenantId") UUID tenantId) {
        return (List<Collection>) null;
    }

    @SqlUpdate
    public abstract void addProduct(@BindBean("collection") Collection collection, @BindBean("product") Product product, @Bind("position") Integer position) {
        return;
    }

    @SqlQuery
    public abstract Integer lastEntityPosition(@BindBean("collection") Collection collection) {
        return (Integer) null;
    }

    @SqlUpdate
    public abstract void addEntityToCollection(@BindBean("collection") Collection collection, @Bind("collectionPath") String path, @BindBean("entity") Entity entity, @Bind("position") Integer position) {
        return;
    }

    @SqlUpdate
    public abstract void removeEntityFromCollection(@BindBean("collection") Collection collection, @BindBean("entity") Entity entity) {
        return;
    }

    @SqlQuery
    public abstract List<Collection> findCollectionsForEntity(@BindBean("entity") Entity entity) {
        return (List<Collection>) null;
    }

    @Deprecated
    @SqlUpdate
    public abstract void removeProduct(@BindBean("collection") Collection collection, @BindBean("product") Product product) {
        return;
    }

    @SqlBatch
    public abstract void updateCollectionPosition(@BindBean("collection") List<org.mayocat.shop.catalog.model.Collection> collection, @Bind("position") List<Integer> position) {
        return;
    }

    @SqlBatch
    public abstract void updateCollectionParent(@BindBean("collection") List<org.mayocat.shop.catalog.model.Collection> collection) {
        return;
    }

    @SqlBatch
    public abstract void updateProductPosition(@BindBean("product") List<Product> entity, @Bind("position") List<Integer> position) {
        return;
    }

    @RegisterMapper(EntityAndCountsJoinRowMapper.class)
    @SqlQuery
    abstract List<EntityAndCountsJoinRow> findWithProductCountRows(@Bind("tenantId") UUID tenantId) {
        return (List<EntityAndCountsJoinRow>) null;
    }

    public Collection findBySlug(String slug, UUID tenant) {
        return (Collection) null;
    }

    public Collection findBySlug(String slug, UUID tenantId, UUID parent) {
        return (Collection) null;
    }

    public List<EntityAndCount<Collection>> findAllWithProductCount(UUID tenantId) {
        return (List<EntityAndCount<Collection>>) null;
    }

    public void createOrUpdateAddons(Collection entity) {
        return;
    }

    public int id = 0;

    public static CollectionDAO getObject(int id) {
        CollectionDAO obj = (CollectionDAO) new Object();
        obj.id = id;
        return obj;
    }
}

