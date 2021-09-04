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

/**
 * @version $Id: bfbc00c7c24c811269ffadf8bb71d29c2dfd3cb8 $
 */
@Component("invoicing")
public class InvoicingGestaltConfigurationSourceServer implements GestaltConfigurationSource {

    @Inject
    private InvoicingSettings invoicingSettings;

    @Override
    public Object get() {
        return invoicingSettings;
    }

    public void setInvoicingSettings(InvoicingSettings invoicingSettings) {
        this.invoicingSettings = invoicingSettings;
    }

    public InvoicingSettings getInvoicingSettings() {
        return invoicingSettings;
    }
}

