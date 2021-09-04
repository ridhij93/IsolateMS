/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout.front;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.apache.commons.lang3.StringUtils;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.joda.money.format.MoneyAmountStyle;
import org.joda.money.format.MoneyFormatter;
import org.joda.money.format.MoneyFormatterBuilder;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.context.WebContext;
import org.mayocat.rest.Resource;
import org.mayocat.rest.annotation.ExistingTenant;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.billing.store.OrderStore;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.ProductStore;
import org.mayocat.shop.checkout.CheckoutException;
import org.mayocat.shop.checkout.CheckoutRegister;
import org.mayocat.shop.checkout.CheckoutRequest;
import org.mayocat.shop.checkout.CheckoutResponse;
import org.mayocat.shop.checkout.CheckoutSettings;
import org.mayocat.shop.checkout.RegularCheckoutException;
import org.mayocat.shop.checkout.internal.CheckoutRequestBuilder;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.customer.store.AddressStore;
import org.mayocat.shop.customer.store.CustomerStore;
import org.mayocat.shop.front.views.WebView;
import org.mayocat.shop.payment.BasePaymentData;
import org.mayocat.shop.payment.CreditCardPaymentData;
import org.mayocat.shop.payment.PaymentData;
import org.mayocat.shop.payment.PaymentProcessor;
import org.mayocat.shop.payment.PaymentRequest;
import org.mayocat.shop.payment.PaymentStatus;
import org.mayocat.shop.payment.RequiredAction;
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
 * @version $Id: 16071e763404f84c078ca610a989a9dc16c64782 $
 */
@Component(CheckoutResource.getPATH())
@Path(CheckoutResource.getPATH())
@Produces({ MediaType.TEXT_HTML, MediaType.APPLICATION_JSON })
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@ExistingTenant
public class CheckoutResourceWrapper {

    // Return from payment gateway -----------------------------------------------------------------
    // Private helpers -----------------------------------------------------------------------------
    @RequestMapping(method = RequestMethod.GET, value = "getpath")
    public static @ResponseBody String getPATH() {
        String result = CheckoutResourceServer.getPATH();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, CheckoutResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "checkoutresource")
    public  @ResponseBody int CheckoutResource() {
        CheckoutResourceServer newServerObj = new CheckoutResourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // Return from payment gateway -----------------------------------------------------------------
    // Private helpers -----------------------------------------------------------------------------
}

