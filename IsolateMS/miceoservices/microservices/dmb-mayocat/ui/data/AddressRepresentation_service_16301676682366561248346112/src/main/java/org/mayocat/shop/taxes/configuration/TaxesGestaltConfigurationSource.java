/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes.configuration;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: cfa4cea04b47d980f0e4b689e6c957148b43dfca $
 */
@Component("taxes")
public class TaxesGestaltConfigurationSource implements GestaltConfigurationSource {

    public Object get() {
        return (Object) null;
    }

    public void setTaxesSettings(TaxesSettings taxesSettings) {
        return;
    }

    public TaxesSettings getTaxesSettings() {
        return (TaxesSettings) null;
    }

    public int id = 0;

    public static TaxesGestaltConfigurationSource getObject(int id) {
        TaxesGestaltConfigurationSource obj = (TaxesGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

