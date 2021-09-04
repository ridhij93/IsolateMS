/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.List;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.jdbi.mapper.ProductMapper;
import org.mayocat.shop.marketplace.store.jdbi.ProductAndTenantMapper;
import org.mayocat.store.rdbms.dbi.argument.MapAsJsonArgumentFactory;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Define;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterArgumentFactory;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e60a5ad584e7ac00cf2326934a0f046dc9445ac4 $
 */
@RegisterMapper(ProductMapper.class)
@RegisterArgumentFactory({ MapAsJsonArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class MarketplaceProductDAO implements AddonsDAO<Product> {

    @SqlQuery
    public abstract Product findBySlugAndTenant(@Bind("slug") String slug, @Bind("tenantSlug") String tenantSlug) {
        return (Product) null;
    }

    @SqlQuery
    public abstract List<Product> findAllNotVariants(@Bind("number") Integer number, @Bind("offset") Integer offset, @Define("orderby") String orderBy) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract Integer countAllNotVariants() {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Product> findAllWithTitleLike(@Bind("title") String title, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract List<Product> findAllOnShelfWithTitleLike(@Bind("title") String title, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract Integer countAllWithTitleLike(@Bind("title") String title) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract Integer countAllOnShelfWithTitleLike(@Bind("title") String title) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Product> findAllForTenant(@BindBean("tenant") Tenant tenant, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    @SqlQuery
    public abstract List<Product> findAllForTenantOnShelf(@BindBean("tenant") Tenant tenant, @Bind("number") Integer number, @Bind("offset") Integer offset) {
        return (List<Product>) null;
    }

    public int id = 0;

    public static MarketplaceProductDAO getObject(int id) {
        MarketplaceProductDAO obj = (MarketplaceProductDAO) new Object();
        obj.id = id;
        return obj;
    }
}

