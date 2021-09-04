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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link ProductStore}
 *
 * @version $Id: 8358eb27669bcf3e84096d8814aff9fff04d3ebc $
 */
@Component("memory")
public class MemoryProductStore extends AbstractPositionedEntityMemoryStore<Product, DefaultPositionedEntity<Product>> implements ProductStore {

    private static final Predicate<Product> withTitleLike(final String title) {
        return (Predicate<Product>) null;
    }

    public void moveProduct(String productToMove, String productToMoveRelativeTo, RelativePosition relativePosition) throws InvalidMoveOperation {
        return;
    }

    public void updatePosition(Integer position, Product product) {
        return;
    }

    public List<Product> findOrphanProducts() {
        return (List<Product>) null;
    }

    public Integer countAllForCollection(Collection collection) {
        return (Integer) null;
    }

    public List<Product> findForCollection(Collection collection, Integer number, Integer offset) {
        return (List<Product>) null;
    }

    @Override
    public List<Product> findOnShelfForCollection(final Collection collection, Integer number, Integer offset) {
        return (List<Product>) null;
    }

    public List<Product> findAllForCollection(final Collection collection) {
        return (List<Product>) null;
    }

    public List<Product> findAllOnShelf(Integer number, Integer offset) {
        return (List<Product>) null;
    }

    public Integer countAllOnShelf() {
        return (Integer) null;
    }

    public List<Product> findAllNotVariants(Integer number, Integer offset) {
        return (List<Product>) null;
    }

    public Integer countAllNotVariants() {
        return (Integer) null;
    }

    public List<Product> findAllWithTitleLike(String title, Integer number, Integer offset) {
        return (List<Product>) null;
    }

    public Integer countAllWithTitleLike(String title) {
        return (Integer) null;
    }

    public void updateStock(UUID productId, Integer stockOffset) throws EntityDoesNotExistException {
        return;
    }

    public List<Feature> findFeatures(Product product) {
        return (List<Feature>) null;
    }

    public List<Feature> findFeatures(Product product, String feature) {
        return (List<Feature>) null;
    }

    public Feature findFeature(Product product, String feature, String featureSlug) {
        return (Feature) null;
    }

    public List<Product> findVariants(Product product) {
        return (List<Product>) null;
    }

    public Product findVariant(Product product, String variantSlug) {
        return (Product) null;
    }

    public Feature createFeature(Feature feature) throws InvalidEntityException, EntityAlreadyExistsException {
        return (Feature) null;
    }

    public List<Product> findAllForCollection(EntityAndParent<Collection> collection) {
        return (List<Product>) null;
    }

    protected DefaultPositionedEntity<Product> createForEntity(Product entity, Integer position) {
        return (DefaultPositionedEntity<Product>) null;
    }

    public static Predicate<Product> getON_SHELF() {
        return (Predicate<Product>) null;
    }

    public static Predicate<Product> getNOT_A_VARIANT() {
        return (Predicate<Product>) null;
    }

    public int id = 0;

    public static MemoryProductStore getObject(int id) {
        MemoryProductStore obj = (MemoryProductStore) new Object();
        obj.id = id;
        return obj;
    }
}

