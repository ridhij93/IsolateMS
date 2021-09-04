/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import java.util.Currency;
import javax.inject.Inject;
import org.mayocat.localization.EntityLocalizationService;
import org.mayocat.shop.cart.CartInSessionConverter;
import org.mayocat.shop.cart.CartContents;
import org.mayocat.shop.cart.CartInSession;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.shop.taxes.Taxable;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e4ad1fb5bb36e67f43988b44239531e2da46148a $
 */
@Component
public class DefaultCartInSessionConverter implements CartInSessionConverter {

    @Override
    public CartInSession convertToCartInSession(CartContents cartContents) {
        return (CartInSession) null;
    }

    @Override
    public CartContents loadFromCartInSession(CartInSession cartInSession) {
        return (CartContents) null;
    }

    public void setProductStore(ProductStore productStore) {
        return;
    }

    public ProductStore getProductStore() {
        return (ProductStore) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setEntityLocalizationService(EntityLocalizationService entityLocalizationService) {
        return;
    }

    public EntityLocalizationService getEntityLocalizationService() {
        return (EntityLocalizationService) null;
    }

    public int id = 0;

    public static DefaultCartInSessionConverter getObject(int id) {
        DefaultCartInSessionConverter obj = (DefaultCartInSessionConverter) new Object();
        obj.id = id;
        return obj;
    }
}

