/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.marketplace.search;

import java.io.PrintWriter;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.search.SearchEngine;
import org.mayocat.shop.catalog.model.Collection;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.CollectionStore;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import com.google.common.collect.ImmutableMultimap;
import io.dropwizard.servlets.tasks.Task;
import mayoapp.dao.CollectionDAO;
import mayoapp.dao.EntityDAO;
import mayoapp.dao.ProductDAO;
import mayoapp.dao.TenantDAO;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component("buildMarketplaceIndex")
public class BuildIndexTask extends Task implements org.mayocat.task.Task {

    public BuildIndexTask() {
        String uri = MicroserviceApplication.projectUri + "/ms1/buildindextask/buildindextaskcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    protected BuildIndexTask(String name) {
        String uri = MicroserviceApplication.projectUri + "/ms1/buildindextask/buildindextask?callerId=" + this.id + "&name=name";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void execute(ImmutableMultimap<String, String> parameters, PrintWriter output) throws Exception {
        return;
    }

    public void setCollectionStore(CollectionStore collectionStore) {
        return;
    }

    public CollectionStore getCollectionStore() {
        return (CollectionStore) null;
    }

    public void setProductStore(ProductStore productStore) {
        return;
    }

    public ProductStore getProductStore() {
        return (ProductStore) null;
    }

    public void setTenantStore(TenantStore tenantStore) {
        return;
    }

    public TenantStore getTenantStore() {
        return (TenantStore) null;
    }

    public void setSearchEngine(Provider<SearchEngine> searchEngine) {
        return;
    }

    public Provider<SearchEngine> getSearchEngine() {
        return (Provider<SearchEngine>) null;
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public DBIProvider getDbi() {
        return (DBIProvider) null;
    }

    public void setCollectionDAO(EntityDAO<Collection> collectionDAO) {
        return;
    }

    public EntityDAO<Collection> getCollectionDAO() {
        return (EntityDAO<Collection>) null;
    }

    public void setProductDAO(EntityDAO<Product> productDAO) {
        return;
    }

    public EntityDAO<Product> getProductDAO() {
        return (EntityDAO<Product>) null;
    }

    public void setTenantDAO(TenantDAO tenantDAO) {
        return;
    }

    public TenantDAO getTenantDAO() {
        return (TenantDAO) null;
    }

    public int id = 0;

    public static BuildIndexTask getObject(int id) {
        BuildIndexTask obj = (BuildIndexTask) new Object();
        obj.id = id;
        return obj;
    }
}

