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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 16071e763404f84c078ca610a989a9dc16c64782 $
 */
@Component(CheckoutResource.getPATH())
@Path(CheckoutResource.getPATH())
@Produces({ MediaType.TEXT_HTML, MediaType.APPLICATION_JSON })
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@ExistingTenant
public class CheckoutResource implements Resource {

    @POST
    public Object checkout(final MultivaluedMap data) {
        return (Object) null;
    }

    private Object generateCheckoutResponse(CheckoutResponse response) throws URISyntaxException {
        return (Object) null;
    }

    @GET
    public Object checkout() {
        return (Object) null;
    }

    @POST
    @Path("{orderId}/payment")
    public Object internalPayment(@PathParam("orderId") UUID orderId, MultivaluedMap<String, String> data) {
        return (Object) null;
    }

    // Return from payment gateway -----------------------------------------------------------------
    @GET
    @Path(PAYMENT_RETURN_PATH + "/{order}")
    public WebView returnFromPaymentService(@Context UriInfo uriInfo, @PathParam("order") String orderId) {
        return (WebView) null;
    }

    @POST
    @Path(PAYMENT_RETURN_PATH + "/{order}")
    public WebView postReturnFromPaymentService(@Context UriInfo uriInfo, @PathParam("order") String orderId) {
        return (WebView) null;
    }

    @GET
    @Path(PAYMENT_CANCEL_PATH + "/{orderId}")
    public WebView cancelFromPaymentService(@PathParam("orderId") UUID orderId) {
        return (WebView) null;
    }

    @POST
    @Path(PAYMENT_CANCEL_PATH + "/{orderId}")
    public WebView postCancelFromPaymentService(@PathParam("orderId") UUID orderId) {
        return (WebView) null;
    }

    // Private helpers -----------------------------------------------------------------------------
    /**
     * Render a user facing error page
     *
     * @param message the message associated with the error
     * @return the error page
     */
    private Object renderError(final String message) {
        return (Object) null;
    }

    /**
     * Prepare checkout response context
     *
     * @param order the order concerned by the notification
     * @param customer the customer
     * @param ba an optional billing address
     * @param da an optional shipping address
     * @param tenant the tenant the order was checked out from
     * @param locale the main locale of the tenant
     * @return a JSON context as map
     */
    private Map<String, Object> prepareContext(Order order, Customer customer, Optional<Address> ba, Optional<Address> da, Tenant tenant, Locale locale) {
        return (Map<String, Object>) null;
    }

    /**
     * Prepares the context for an address
     *
     * @param address the address to get the context of
     * @return the prepared context
     */
    private Map<String, Object> prepareAddressContext(Address address) {
        return (Map<String, Object>) null;
    }

    public static String getPATH() {
        String uri = MicroserviceApplication.projectUri + "/ms0/checkoutresource/getpath";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String getPAYMENT_RETURN_PATH() {
        return (String) null;
    }

    public static String getPAYMENT_CANCEL_PATH() {
        return (String) null;
    }

    public void setCustomerStore(Provider<CustomerStore> customerStore) {
        return;
    }

    public Provider<CustomerStore> getCustomerStore() {
        return (Provider<CustomerStore>) null;
    }

    public void setAddressStore(Provider<AddressStore> addressStore) {
        return;
    }

    public Provider<AddressStore> getAddressStore() {
        return (Provider<AddressStore>) null;
    }

    public void setProductStore(Provider<ProductStore> productStore) {
        return;
    }

    public Provider<ProductStore> getProductStore() {
        return (Provider<ProductStore>) null;
    }

    public void setCheckoutRegister(CheckoutRegister checkoutRegister) {
        return;
    }

    public CheckoutRegister getCheckoutRegister() {
        return (CheckoutRegister) null;
    }

    public void setSiteSettings(SiteSettings siteSettings) {
        return;
    }

    public SiteSettings getSiteSettings() {
        return (SiteSettings) null;
    }

    public void setUrlHelper(URLHelper urlHelper) {
        return;
    }

    public URLHelper getUrlHelper() {
        return (URLHelper) null;
    }

    public void setMultitenancySettings(MultitenancySettings multitenancySettings) {
        return;
    }

    public MultitenancySettings getMultitenancySettings() {
        return (MultitenancySettings) null;
    }

    public void setOrderStore(Provider<OrderStore> orderStore) {
        return;
    }

    public Provider<OrderStore> getOrderStore() {
        return (Provider<OrderStore>) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
    }

    public void setConfigurationService(ConfigurationService configurationService) {
        return;
    }

    public ConfigurationService getConfigurationService() {
        return (ConfigurationService) null;
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        return;
    }

    public PaymentProcessor getPaymentProcessor() {
        return (PaymentProcessor) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static CheckoutResource getObject(int id) {
        CheckoutResource obj = (CheckoutResource) new Object();
        obj.id = id;
        return obj;
    }
}

