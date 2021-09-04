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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 684ea8d3fa5fb89b0a8d125a4b4dba1c218a31c0 $
 */
@Controller
@RequestMapping("/ms1/cartitemtoorderitemtransformer/")
public class CartItemToOrderItemTransformerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, CartItemToOrderItemTransformerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "cartitemtoorderitemtransformer")
    public  @ResponseBody int CartItemToOrderItemTransformer(@RequestParam int dataLoaderId, @RequestParam int platformSettingsId, @RequestParam int productStoreId, @RequestParam int taxesSettingsId, @RequestParam int webContextId) {
        CartItemToOrderItemTransformerServer newServerObj = new CartItemToOrderItemTransformerServer(EntityDataLoader.getObject(dataLoaderId), PlatformSettings.getObject(platformSettingsId), ProductStore.getObject(productStoreId), TaxesSettings.getObject(taxesSettingsId), WebContext.getObject(webContextId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

