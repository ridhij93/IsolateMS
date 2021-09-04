/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing.internal;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Maps;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import mayoapp.dao.InvoiceNumberDao;
import org.joda.time.DateTime;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.store.TenantStore;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.files.FileManager;
import org.mayocat.pdf.PdfRenderingException;
import org.mayocat.pdf.PdfTemplateRenderer;
import org.mayocat.rest.api.object.DateWebObject;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import org.mayocat.shop.customer.web.object.CustomerWebObject;
import org.mayocat.shop.customer.web.object.OrderItemWebObject;
import org.mayocat.shop.customer.web.object.OrderWebObject;
import org.mayocat.shop.invoicing.InvoicingException;
import org.mayocat.shop.invoicing.InvoicingService;
import org.mayocat.shop.invoicing.InvoicingSettings;
import org.mayocat.shop.invoicing.model.InvoiceNumber;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 6933db75624ee27c97b65a5b7c34ae6ef36009f2 $
 */
@Component
public class DefaultInvoicingServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultInvoicingServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultinvoicingservice")
    public  @ResponseBody int DefaultInvoicingService() {
        DefaultInvoicingServiceServer newServerObj = new DefaultInvoicingServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

