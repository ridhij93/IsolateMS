/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout.internal;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Maps;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.PlatformSettings;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.context.WebContext;
import org.mayocat.entity.EntityDataLoader;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.billing.store.OrderStore;
import org.mayocat.shop.cart.Cart;
import org.mayocat.shop.cart.CartBuilder;
import org.mayocat.shop.cart.CartItemBuilder;
import org.mayocat.shop.cart.CartManager;
import org.mayocat.shop.catalog.configuration.shop.CatalogSettings;
import org.mayocat.shop.catalog.model.Purchasable;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.shop.checkout.CheckoutException;
import org.mayocat.shop.checkout.CheckoutRegister;
import org.mayocat.shop.checkout.CheckoutRequest;
import org.mayocat.shop.checkout.CheckoutResponse;
import org.mayocat.shop.checkout.RegularCheckoutException;
import org.mayocat.shop.checkout.front.CheckoutResource;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.customer.store.AddressStore;
import org.mayocat.shop.customer.store.CustomerStore;
import org.mayocat.shop.payment.BasePaymentData;
import org.mayocat.shop.payment.PaymentData;
import org.mayocat.shop.payment.PaymentException;
import org.mayocat.shop.payment.PaymentProcessor;
import org.mayocat.shop.payment.PaymentRequest;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.shipping.ShippingService;
import org.mayocat.shop.shipping.model.Carrier;
import org.mayocat.shop.taxes.PriceWithTaxes;
import org.mayocat.shop.taxes.Taxable;
import org.mayocat.shop.taxes.TaxesService;
import org.mayocat.shop.taxes.configuration.TaxesSettings;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.url.URLHelper;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 75e7d99bf1706ba2ac9ac03b6a4810c214ecc964 $
 */
@Component
public class DefaultCheckoutRegisterWrapper {

    // ---------------------------------------------------------------------------------------------
    private static int maxId = 0;

    public static HashMap<Integer, DefaultCheckoutRegisterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultcheckoutregister")
    public  @ResponseBody int DefaultCheckoutRegister() {
        DefaultCheckoutRegisterServer newServerObj = new DefaultCheckoutRegisterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // ---------------------------------------------------------------------------------------------
}

