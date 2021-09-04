/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart.internal;

import javax.inject.Inject;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.context.WebContext;
import org.mayocat.context.scope.Session;
import org.mayocat.shop.cart.CartAccessor;
import org.mayocat.shop.cart.CartInSessionConverter;
import org.mayocat.shop.cart.CartContents;
import org.mayocat.shop.cart.CartInSession;
import org.mayocat.shop.catalog.configuration.shop.CatalogSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 90395def851155894113fe4943ddf785de58f94b $
 */
@Component
public class DefaultCartAccessor implements CartAccessor {

    @Override
    public CartContents getCart() {
        return (CartContents) null;
    }

    @Override
    public void setCart(CartContents cartContents) {
        return;
    }

    public static String getSESSION_CART_KEY() {
        return (String) null;
    }

    public static Logger getLOGGER() {
        return (Logger) null;
    }

    public void setConfigurationService(ConfigurationService configurationService) {
        return;
    }

    public ConfigurationService getConfigurationService() {
        return (ConfigurationService) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public void setCartInSessionConverter(CartInSessionConverter cartInSessionConverter) {
        return;
    }

    public CartInSessionConverter getCartInSessionConverter() {
        return (CartInSessionConverter) null;
    }

    public int id = 0;

    public static DefaultCartAccessor getObject(int id) {
        DefaultCartAccessor obj = (DefaultCartAccessor) new Object();
        obj.id = id;
        return obj;
    }
}

