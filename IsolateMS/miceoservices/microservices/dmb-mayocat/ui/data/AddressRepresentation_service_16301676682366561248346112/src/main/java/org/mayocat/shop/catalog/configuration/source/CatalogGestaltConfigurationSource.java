/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.configuration.source;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.shop.catalog.configuration.shop.CatalogSettings;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c85380b1482ea53fff5b3c65464375e993827e78 $
 */
@Component("catalog")
public class CatalogGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    public void setCatalogSettings(CatalogSettings catalogSettings) {
        return;
    }

    public CatalogSettings getCatalogSettings() {
        return (CatalogSettings) null;
    }

    public int id = 0;

    public static CatalogGestaltConfigurationSource getObject(int id) {
        CatalogGestaltConfigurationSource obj = (CatalogGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

