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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component
public class DefaultCatalogService implements CatalogService {

    public Product createProduct(Product entity) throws InvalidEntityException, EntityAlreadyExistsException {
        return (Product) null;
    }

    public void updateProduct(Product entity) throws EntityDoesNotExistException, InvalidEntityException {
        return;
    }

    public Product findProductBySlug(String slug) {
        return (Product) null;
    }

    public List<Product> findAllProducts(int number, int offset) {
        return (List<Product>) null;
    }

    public List<Product> findOrphanProducts() {
        return (List<Product>) null;
    }

    @Override
    public Collection createCollection(Collection entity) throws InvalidEntityException, EntityAlreadyExistsException {
        return (Collection) null;
    }

    @Override
    public void updateCollection(Collection entity) throws EntityDoesNotExistException, InvalidEntityException {
        return;
    }

    @Override
    public List<Collection> findCollectionsForProduct(Product product) {
        return (List<Collection>) null;
    }

    @Override
    public List<Product> findProductsForCollection(Collection collection) {
        return (List<Product>) null;
    }

    @Override
    public void addProductToCollection(String collection, String product) throws InvalidOperation {
        return;
    }

    @Override
    public void removeProductFromCollection(String collection, String product) throws InvalidOperation {
        return;
    }

    @Override
    public void moveProduct(String slugOfProductToMove, String slugOfProductToMoveBeforeOf) throws InvalidMoveOperation {
        return;
    }

    @Override
    public void moveProduct(String slugOfProductToMove, String slugOfProductToRelativeTo, InsertPosition position) throws InvalidMoveOperation {
        return;
    }

    @Override
    public void moveCollection(String slugOfCollectionToMove, String slugOfCollectionToMoveBeforeOf) throws InvalidMoveOperation {
        return;
    }

    @Override
    public void moveCollection(String slugOfCollectionToMove, String slugOfCollectionToMoveRelativeTo, InsertPosition position) throws InvalidMoveOperation {
        return;
    }

    @Override
    public Collection findCollectionBySlug(String slug) {
        return (Collection) null;
    }

    @Override
    public List<Collection> findAllCollections(int number, int offset) {
        return (List<Collection>) null;
    }

    @Override
    public List<EntityAndCount<Collection>> findAllCollectionsWithProductCount() {
        return (List<EntityAndCount<Collection>>) null;
    }

    @Override
    public void deleteProduct(String productSlug) throws EntityDoesNotExistException {
        return;
    }

    @Override
    public void deleteCollection(String collectionSlug) throws EntityDoesNotExistException {
        return;
    }

    @Override
    public void moveProductInCollection(Collection collection, String slugOfProductToMove, String relativeSlug) throws InvalidMoveOperation {
        return;
    }

    @Override
    public void moveProductInCollection(Collection collection, String slugOfProductToMove, String relativeSlug, InsertPosition insertPosition) throws InvalidMoveOperation {
        return;
    }

    public void setProductStore(Provider<ProductStore> productStore) {
        return;
    }

    public Provider<ProductStore> getProductStore() {
        return (Provider<ProductStore>) null;
    }

    public void setCollectionStore(Provider<CollectionStore> collectionStore) {
        return;
    }

    public Provider<CollectionStore> getCollectionStore() {
        return (Provider<CollectionStore>) null;
    }

    public void setSlugifier(Slugifier slugifier) {
        return;
    }

    public Slugifier getSlugifier() {
        return (Slugifier) null;
    }

    public int id = 0;

    public static DefaultCatalogService getObject(int id) {
        DefaultCatalogService obj = (DefaultCatalogService) new Object();
        obj.id = id;
        return obj;
    }
}

