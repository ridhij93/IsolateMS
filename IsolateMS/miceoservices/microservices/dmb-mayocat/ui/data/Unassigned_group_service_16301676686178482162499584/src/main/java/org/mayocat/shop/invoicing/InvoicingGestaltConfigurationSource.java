/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: bfbc00c7c24c811269ffadf8bb71d29c2dfd3cb8 $
 */
@Component("invoicing")
public class InvoicingGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    public void setInvoicingSettings(InvoicingSettings invoicingSettings) {
        return;
    }

    public InvoicingSettings getInvoicingSettings() {
        return (InvoicingSettings) null;
    }

    public int id = 0;

    public static InvoicingGestaltConfigurationSource getObject(int id) {
        InvoicingGestaltConfigurationSource obj = (InvoicingGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

