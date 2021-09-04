/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.internal;

import com.google.common.base.Strings;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import javax.activation.DataSource;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.mail.util.ByteArrayDataSource;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
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
import org.mayocat.mail.MailAttachment;
import org.mayocat.mail.MailException;
import org.mayocat.mail.MailTemplate;
import org.mayocat.mail.MailTemplateService;
import org.mayocat.rest.api.object.DateWebObject;
import org.mayocat.shop.billing.event.OrderPaidEvent;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.customer.store.AddressStore;
import org.mayocat.shop.customer.store.CustomerStore;
import org.mayocat.shop.invoicing.InvoicingException;
import org.mayocat.shop.invoicing.InvoicingService;
import org.mayocat.shop.invoicing.model.InvoiceNumber;
import org.mayocat.url.URLHelper;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.event.Event;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Event listener that sends email to tenant and customer when an order is paid.
 *
 * The mails are sent asynchronously from a thread spawned just for that purpose, so the event returns immediately.
 *
 * @version $Id: 36b89874d290c26bdb99e4ba484bb0854453ce71 $
 */
@Component("paidItemsEmailSendingEventListener")
public class SendEmailsWhenOrderIsPaid implements EventListener {

    /**
     * @see {@link org.xwiki.observation.EventListener#getName()}
     */
    public String getName() {
        return (String) null;
    }

    /**
     * @see {@link org.xwiki.observation.EventListener#getEvents()}
     */
    public List<Event> getEvents() {
        return (List<Event>) null;
    }

    /**
     * @see {@link org.xwiki.observation.EventListener#onEvent(org.xwiki.observation.event.Event, Object, Object)}
     */
    public void onEvent(Event event, Object source, Object data) {
        return;
    }

    /**
     * Sends the actual notification mails.
     *
     * Warning: Since this is done in a spawned thread, so we can't use the web context thread local data from there
     *
     * @param order the order concerned by the notifications mails
     * @param tenant the tenant concerned by the notifications mails
     * @param customerLocale the locale the customer browsed the site in when checking out
     * @param tenantLocale the main locale of the tenant
     * @param withInvoice whether to generate and include a PDF invoice with the notification mail
     */
    private void sendNotificationMails(Order order, Tenant tenant, Locale customerLocale, Locale tenantLocale, boolean withInvoice) {
        return;
    }

    /**
     * @param tenant the tenant of the shop the customer checked out from
     * @param customerEmail the email of the customer
     * @param locale the locale of the customer
     * @return an optional notification email object, present if all information is there and valid and the template
     * exists, absent otherwise
     */
    private MailTemplate getCustomerNotificationEmail(Tenant tenant, String customerEmail, Locale locale) {
        return (MailTemplate) null;
    }

    /**
     * @param tenant the tenant of the shop the customer checked out from
     * @param locale the main locale of the tenant
     * @return an optional notification email object, present if all information is there and valid and the template
     * exists, absent otherwise
     */
    private MailTemplate getTenantNotificationEmail(Tenant tenant, Locale locale) {
        return (MailTemplate) null;
    }

    /**
     * Retrieves the contact email for a tenant. If the tenant is null ("global tenant"), then use the global site
     * settings
     *
     * @param tenant the tenant for which to get the contact email, or null for a global tenant
     * @return the found contact email or null if no contact email has been found
     */
    private String getTenantContactEmail(Tenant tenant) {
        return (String) null;
    }

    /**
     * Actually sends a notification email
     *
     * @param template the mail template
     * @param context the mail JSON context
     */
    private void sendNotificationMail(MailTemplate template, Map<String, Object> context, Tenant tenant) {
        return;
    }

    /**
     * Prepares the JSON context for an order mail notification
     *
     * @param order the order concerned by the notification
     * @param customer the customer
     * @param ba an optional billing address
     * @param da an optional shipping address
     * @param tenant the tenant the order was checked out from
     * @param locale the main locale of the tenant
     * @return a JSON context as map
     */
    private Map<String, Object> prepareMailContext(Order order, Customer customer, Optional<Address> ba, Optional<Address> da, Tenant tenant, Locale locale) {
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

    public void setMailTemplateService(MailTemplateService mailTemplateService) {
        return;
    }

    public MailTemplateService getMailTemplateService() {
        return (MailTemplateService) null;
    }

    public void setInvoicingService(InvoicingService invoicingService) {
        return;
    }

    public InvoicingService getInvoicingService() {
        return (InvoicingService) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setWebContext(WebContext webContext) {
        return;
    }

    public WebContext getWebContext() {
        return (WebContext) null;
    }

    public void setGeneralSettings(GeneralSettings generalSettings) {
        return;
    }

    public GeneralSettings getGeneralSettings() {
        return (GeneralSettings) null;
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

    public void setConfigurationService(ConfigurationService configurationService) {
        return;
    }

    public ConfigurationService getConfigurationService() {
        return (ConfigurationService) null;
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

    public int id = 0;

    public static SendEmailsWhenOrderIsPaid getObject(int id) {
        SendEmailsWhenOrderIsPaid obj = (SendEmailsWhenOrderIsPaid) new Object();
        obj.id = id;
        return obj;
    }
}

