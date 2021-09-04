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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Event listener that sends email to tenant and customer when an order is paid.
 *
 * The mails are sent asynchronously from a thread spawned just for that purpose, so the event returns immediately.
 *
 * @version $Id: 36b89874d290c26bdb99e4ba484bb0854453ce71 $
 */
@Component("paidItemsEmailSendingEventListener")
public class SendEmailsWhenOrderIsPaidWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SendEmailsWhenOrderIsPaidServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "sendemailswhenorderispaid")
    public  @ResponseBody int SendEmailsWhenOrderIsPaid() {
        SendEmailsWhenOrderIsPaidServer newServerObj = new SendEmailsWhenOrderIsPaidServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

