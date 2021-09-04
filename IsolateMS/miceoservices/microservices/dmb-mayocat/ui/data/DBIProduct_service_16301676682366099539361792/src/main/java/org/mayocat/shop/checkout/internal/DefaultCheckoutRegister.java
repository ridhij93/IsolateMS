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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 75e7d99bf1706ba2ac9ac03b6a4810c214ecc964 $
 */
@Component
public class DefaultCheckoutRegister implements CheckoutRegister {

    @Override
    public CheckoutResponse directCheckout(CheckoutRequest request, final Taxable taxable, final Long quantity) throws CheckoutException {
        return (CheckoutResponse) null;
    }

    @Override
    public CheckoutResponse checkoutCart(CheckoutRequest request) throws CheckoutException {
        return (CheckoutResponse) null;
    }

    @Override
    public void dropOrder(UUID orderId) throws CheckoutException {
        return;
    }

    // ---------------------------------------------------------------------------------------------
    private CheckoutResponse doCheckoutInternal(CheckoutRequest request, Cart cart) throws CheckoutException {
        return (CheckoutResponse) null;
    }

    private CheckoutResponse doGatewayCheckout(Order order, Map<PaymentData, Object> data) throws CheckoutException {
        return (CheckoutResponse) null;
    }

    private Map<PaymentData, Object> preparePaymentData(Address deliveryAddress, Address billingAddress, Order order, Customer actualCustomer, Currency currency, Optional<String> gatewayId) {
        return (Map<PaymentData, Object>) null;
    }

    private Customer createCustomer(Customer customer) throws EntityAlreadyExistsException, InvalidEntityException, EntityDoesNotExistException {
        return (Customer) null;
    }

    private Order createOrder(Map<String, Object> extraOrderData, Cart cart, UUID customerId, UUID deliveryAddressId, UUID billingAddressId, Map<String, Object> data) throws EntityAlreadyExistsException, InvalidEntityException {
        return (Order) null;
    }

    private boolean updateCustomerIfNecessary(Customer existingCustomer, Customer customer) {
        return (Boolean) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
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

    public void setTaxesSettings(TaxesSettings taxesSettings) {
        return;
    }

    public TaxesSettings getTaxesSettings() {
        return (TaxesSettings) null;
    }

    public void setOrderStore(Provider<OrderStore> orderStore) {
        return;
    }

    public Provider<OrderStore> getOrderStore() {
        return (Provider<OrderStore>) null;
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

    public void setTenantStore(Provider<TenantStore> tenantStore) {
        return;
    }

    public Provider<TenantStore> getTenantStore() {
        return (Provider<TenantStore>) null;
    }

    public void setShippingService(ShippingService shippingService) {
        return;
    }

    public ShippingService getShippingService() {
        return (ShippingService) null;
    }

    public void setCartManager(CartManager cartManager) {
        return;
    }

    public CartManager getCartManager() {
        return (CartManager) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
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

    public void setConfigurationService(ConfigurationService configurationService) {
        return;
    }

    public ConfigurationService getConfigurationService() {
        return (ConfigurationService) null;
    }

    public void setTaxesService(TaxesService taxesService) {
        return;
    }

    public TaxesService getTaxesService() {
        return (TaxesService) null;
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        return;
    }

    public PaymentProcessor getPaymentProcessor() {
        return (PaymentProcessor) null;
    }

    public int id = 0;

    public static DefaultCheckoutRegister getObject(int id) {
        DefaultCheckoutRegister obj = (DefaultCheckoutRegister) new Object();
        obj.id = id;
        return obj;
    }
}

