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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link org.mayocat.shop.catalog.store.CollectionStore}
 *
 * @version $Id: 0025a15726276c253b53e84ef6c1acac9cf99788 $
 */
@Component("memory")
public class MemoryCollectionStore extends AbstractPositionedEntityMemoryStore<Collection, CollectionPositionedEntity> implements CollectionStore {

    private static Predicate<CollectionPositionedEntity> hasProduct(final Product product) {
        return (Predicate<CollectionPositionedEntity>) null;
    }

    private static Predicate<CollectionPositionedEntity> idIsPresent(final List<UUID> ids) {
        return (Predicate<CollectionPositionedEntity>) null;
    }

    protected CollectionPositionedEntity createForEntity(Collection entity, Integer position) {
        return (CollectionPositionedEntity) null;
    }

    public void addProduct(Collection collection, Product product) {
        return;
    }

    public void removeProduct(Collection collection, Product product) {
        return;
    }

    public void moveCollection(String collectionToMove, String collectionToMoveRelativeTo, RelativePosition relativePosition) throws InvalidMoveOperation {
        return;
    }

    public void moveProductInCollection(Collection collection, String productToMove, String productToMoveRelativeTo, RelativePosition relativePosition) throws InvalidMoveOperation {
        return;
    }

    public List<EntityAndCount<Collection>> findAllWithProductCount() {
        return (List<EntityAndCount<Collection>>) null;
    }

    public List<Collection> findAll() {
        return (List<Collection>) null;
    }

    public List<Collection> findAllForProduct(final Product product) {
        return (List<Collection>) null;
    }

    public List<Collection> findAllForProductIds(List<UUID> ids) {
        return (List<Collection>) null;
    }

    public List<ProductCollection> findAllProductsCollectionsForIds(List<UUID> ids) {
        return (List<ProductCollection>) null;
    }

    @Override
    public Collection findBySlug(final String slug, final UUID parentId) {
        return (Collection) null;
    }

    @Override
    public List<Collection> findAllOrderedByParentAndPosition() {
        return (List<Collection>) null;
    }

    @Override
    public void updateCollectionTree(List<PositionedEntity<Collection>> collections) {
        return;
    }

    @Override
    public void addEntityToCollection(Collection collection, Entity entity) {
        return;
    }

    @Override
    public List<EntityAndParent<Collection>> findAllForEntity(Entity entity) {
        return (List<EntityAndParent<Collection>>) null;
    }

    @Override
    public void removeEntityFromCollection(Collection collection, Entity entity) {
        return;
    }

    @Override
    public List<EntityAndParent<Collection>> findAllChildrenOfCollection(Collection entity) {
        return (List<EntityAndParent<Collection>>) null;
    }

    @Override
    public EntityAndParent<Collection> findBySlugs(String... slugs) {
        return (EntityAndParent<Collection>) null;
    }

    public static void setEntityAndCount(Function<CollectionPositionedEntity, EntityAndCount<Collection>> entityAndCount) {
        return;
    }

    public static Function<CollectionPositionedEntity, EntityAndCount<Collection>> getEntityAndCount() {
        return (Function<CollectionPositionedEntity, EntityAndCount<Collection>>) null;
    }

    public int id = 0;

    public static MemoryCollectionStore getObject(int id) {
        MemoryCollectionStore obj = (MemoryCollectionStore) new Object();
        obj.id = id;
        return obj;
    }
}

