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

/**
 * @version $Id: 684ea8d3fa5fb89b0a8d125a4b4dba1c218a31c0 $
 */
public class CartItemToOrderItemTransformerServer implements Function<CartItem, OrderItem> {

    private EntityDataLoader dataLoader;

    private PlatformSettings platformSettings;

    private ProductStore productStore;

    private TaxesSettings taxesSettings;

    private WebContext webContext;

    public CartItemToOrderItemTransformerServer(EntityDataLoader dataLoader, PlatformSettings platformSettings, ProductStore productStore, TaxesSettings taxesSettings, WebContext webContext) {
        this.dataLoader = dataLoader;
        this.platformSettings = platformSettings;
        this.productStore = productStore;
        this.taxesSettings = taxesSettings;
        this.webContext = webContext;
    }

    public OrderItem apply(final CartItem cartItem) {
        Purchasable purchasable = cartItem.item();
        Purchasable rootPurchasable;
        String title;
        if (purchasable.getParent().isPresent() && purchasable.getParent().get().isLoaded()) {
            rootPurchasable = purchasable.getParent().get().get();
            title = rootPurchasable.getTitle() + " - " + purchasable.getTitle();
        } else {
            rootPurchasable = purchasable;
            title = purchasable.getTitle();
        }
        final Product product = productStore.findById(rootPurchasable.getId());
        final Product purchasedProduct = productStore.findById(purchasable.getId());
        EntityData<Product> productData = dataLoader.load(product);
        Optional<Tenant> tenant = productData.getData(Tenant.class);
        final BigDecimal vatRate;
        if (product.getVatRateId().isPresent() && getRateDefinition(product.getVatRateId().get()).isPresent()) {
            vatRate = getRateDefinition(product.getVatRateId().get()).get().getValue();
        } else {
            vatRate = taxesSettings.getVat().getValue().getDefaultRate();
        }
        OrderItem orderItem = new OrderItem();
        orderItem.setPurchasableId(product.getId());
        orderItem.setType("product");
        orderItem.setTitle(title);
        orderItem.setQuantity(cartItem.quantity());
        orderItem.setUnitPrice(cartItem.unitPrice().incl());
        orderItem.setItemTotal(cartItem.total().incl());
        orderItem.setVatRate(vatRate);
        orderItem.setMerchant(tenant.isPresent() ? tenant.get().getName() : null);
        Map<String, Object> data = Maps.newHashMap();
        addOrderAddons(rootPurchasable, data);
        if (product.isVirtual()) {
            data.put("variant", new HashMap<String, Object>() {

                {
                    put("id", purchasedProduct.getId());
                    put("slug", purchasedProduct.getSlug());
                    put("title", purchasedProduct.getTitle());
                }
            });
        }
        orderItem.addData(data);
        return orderItem;
    }

    private Optional<Rate> getRateDefinition(final String rate) {
        return FluentIterable.from(taxesSettings.getVat().getValue().getOtherRates()).filter(new Predicate<Rate>() {

            public boolean apply(Rate input) {
                return input.getId().equals(rate);
            }
        }).first();
    }

    private void addOrderAddons(Purchasable p, Map<String, Object> itemData) {
        if (Product.class.isAssignableFrom(p.getClass())) {
            Product product = (Product) p;
            if (product.getAddons().isLoaded()) {
                Map<String, Object> itemAddons = Maps.newHashMap();
                Map<String, AddonGroup> addons = product.getAddons().get();
                for (String groupName : addons.keySet()) {
                    AddonGroup addonGroup = addons.get(groupName);
                    Map<String, AddonGroupDefinition>[] sources = new Map[2];
                    sources[0] = platformSettings.getAddons();
                    if (webContext.getTheme() != null) {
                        sources[1] = webContext.getTheme().getDefinition().getAddons();
                    }
                    Optional<AddonGroupDefinition> definition = AddonUtils.findAddonGroupDefinition(addonGroup.getGroup(), (Map<String, AddonGroupDefinition>[]) sources);
                    if (definition.isPresent() && definition.get().getProperties().containsKey("checkout.includeInOrder")) {
                        itemAddons.put(groupName, addonGroup.getValue());
                    }
                }
                if (!itemAddons.isEmpty()) {
                    itemData.put("addons", itemAddons);
                }
            }
        }
    }

    public void setDataLoader(EntityDataLoader dataLoader) {
        this.dataLoader = dataLoader;
    }

    public EntityDataLoader getDataLoader() {
        return dataLoader;
    }

    public void setPlatformSettings(PlatformSettings platformSettings) {
        this.platformSettings = platformSettings;
    }

    public PlatformSettings getPlatformSettings() {
        return platformSettings;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setTaxesSettings(TaxesSettings taxesSettings) {
        this.taxesSettings = taxesSettings;
    }

    public TaxesSettings getTaxesSettings() {
        return taxesSettings;
    }

    public void setWebContext(WebContext webContext) {
        this.webContext = webContext;
    }

    public WebContext getWebContext() {
        return webContext;
    }
}

