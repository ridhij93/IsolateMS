/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import java.math.BigDecimal;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.context.WebContext;
import org.mayocat.shop.cart.Cart;
import org.mayocat.shop.cart.CartBuilder;
import org.mayocat.shop.cart.CartContents;
import org.mayocat.shop.cart.CartItemBuilder;
import org.mayocat.shop.cart.CartLoader;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.PriceWithTaxes;
import org.mayocat.shop.taxes.Taxable;
import org.mayocat.shop.taxes.TaxesService;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: ed359db18b089803442ac3b046a3090a62296740 $
 */
@Component
public class DefaultCartLoader implements CartLoader {

    @Override
    public Cart load(CartContents contents) {
        return (Cart) null;
    }

    public void setTaxesService(TaxesService taxesService) {
        return;
    }

    public TaxesService getTaxesService() {
        return (TaxesService) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
    }

    public void setTenantStore(Provider<TenantStore> tenantStore) {
        return;
    }

    public Provider<TenantStore> getTenantStore() {
        return (Provider<TenantStore>) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static DefaultCartLoader getObject(int id) {
        DefaultCartLoader obj = (DefaultCartLoader) new Object();
        obj.id = id;
        return obj;
    }
}

