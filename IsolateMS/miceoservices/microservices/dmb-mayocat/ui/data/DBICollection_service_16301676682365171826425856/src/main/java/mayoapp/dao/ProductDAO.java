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
import org.mayocat.accounts.model.Tenant;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.jdbi.mapper.ProductMapper;
import org.mayocat.store.rdbms.dbi.argument.MapAsJsonArgumentFactory;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterArgumentFactory;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RegisterMapper(ProductMapper.class)
@RegisterArgumentFactory({ MapAsJsonArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class ProductDAO implements EntityDAO<Product>, Transactional<ProductDAO>, PositionedDAO<Product>, AddonsDAO<Product>, LocalizationDAO<Product> {

    @SqlUpdate
    public abstract void createProduct(@Bind("position") Integer position, @BindBean("product") Product product) {
        return;
    }

    @SqlUpdate
    public abstract Integer updateProduct(@BindBean("product") Product product) {
        return (Integer) null;
    }

    @SqlUpdate
    public abstract Integer updatePosition(@Bind("position") Integer position, @BindBean("product") Product product) {
        return (Integer) null;
    }

    @SqlUpdate
    public abstract Integer deleteProductFromCollections(@Bind("id") UUID id) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract Integer lastPosition(@Bind("tenantId") UUID tenant) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract Integer lastPositionForVariant(@BindBean("product") Product parent) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Product> findOrphanProducts(@Bind("tenantId") UUID tenant) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract List<Product> findForCollection(@BindBean("collection") Collection collection, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract List<Product> findOnShelfForCollection(@BindBean("collection") Collection collection, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract List<Product> findAllForCollection(@BindBean("collection") Collection collection) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract List<Product> findAllForCollectionPath(@Bind("path") String path) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract Integer countAllForCollection(@BindBean("collection") Collection collection) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Product> findAllOnShelf(@Bind("tenantId") UUID tenant, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract Integer countAllOnShelf(@Bind("tenantId") UUID tenant) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Product> findAllNotVariants(@Bind("tenantId") UUID tenant, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract Integer countAllNotVariants(@Bind("tenantId") UUID tenant) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Product> findAllWithTitleLike(@Bind("tenantId") UUID tenant, @Bind("title") String title, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract Integer countAllWithTitleLike(@Bind("tenantId") UUID tenant, @Bind("title") String title) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Product> findAllVariants(@BindBean("product") Product product) {
        return (List<Product>) null;
    }

    public Product findBySlug(String slug, UUID tenantId) {
        return (Product) null;
    }

    public Product findBySlug(String slug, UUID tenantId, UUID parent) {
        return (Product) null;
    }

    public void createOrUpdateAddons(Product entity) {
        return;
    }

    public int id = 0;

    public static ProductDAO getObject(int id) {
        ProductDAO obj = (ProductDAO) new Object();
        obj.id = id;
        return obj;
    }
}

