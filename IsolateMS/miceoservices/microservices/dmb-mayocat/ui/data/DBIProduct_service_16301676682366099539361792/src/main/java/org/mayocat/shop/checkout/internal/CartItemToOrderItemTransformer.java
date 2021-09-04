/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout.internal;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.addons.util.AddonUtils;
import org.mayocat.configuration.PlatformSettings;
import org.mayocat.context.WebContext;
import org.mayocat.entity.EntityData;
import org.mayocat.entity.EntityDataLoader;
import org.mayocat.model.AddonGroup;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.cart.CartItem;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.model.Purchasable;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.shop.taxes.configuration.Rate;
import org.mayocat.shop.taxes.configuration.TaxesSettings;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 684ea8d3fa5fb89b0a8d125a4b4dba1c218a31c0 $
 */
public class CartItemToOrderItemTransformer implements Function<CartItem, OrderItem> {

    public CartItemToOrderItemTransformer(EntityDataLoader dataLoader, PlatformSettings platformSettings, ProductStore productStore, TaxesSettings taxesSettings, WebContext webContext) {
        String uri = MicroserviceApplication.projectUri + "/ms1/cartitemtoorderitemtransformer/cartitemtoorderitemtransformer?callerId=" + this.id + "&dataLoaderId=dataLoader.id&platformSettingsId=platformSettings.id&productStoreId=productStore.id&taxesSettingsId=taxesSettings.id&webContextId=webContext.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public OrderItem apply(final CartItem cartItem) {
        return (OrderItem) null;
    }

    private Optional<Rate> getRateDefinition(final String rate) {
        return (Optional<Rate>) null;
    }

    private void addOrderAddons(Purchasable p, Map<String, Object> itemData) {
        return;
    }

    public void setDataLoader(EntityDataLoader dataLoader) {
        return;
    }

    public EntityDataLoader getDataLoader() {
        return (EntityDataLoader) null;
    }

    public void setPlatformSettings(PlatformSettings platformSettings) {
        return;
    }

    public PlatformSettings getPlatformSettings() {
        return (PlatformSettings) null;
    }

    public void setProductStore(ProductStore productStore) {
        return;
    }

    public ProductStore getProductStore() {
        return (ProductStore) null;
    }

    public void setTaxesSettings(TaxesSettings taxesSettings) {
        return;
    }

    public TaxesSettings getTaxesSettings() {
        return (TaxesSettings) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static CartItemToOrderItemTransformer getObject(int id) {
        CartItemToOrderItemTransformer obj = (CartItemToOrderItemTransformer) new Object();
        obj.id = id;
        return obj;
    }
}

