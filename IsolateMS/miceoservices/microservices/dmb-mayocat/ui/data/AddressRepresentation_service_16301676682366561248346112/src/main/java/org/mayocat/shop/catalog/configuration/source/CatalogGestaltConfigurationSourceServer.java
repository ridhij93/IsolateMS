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

/**
 * @version $Id: c85380b1482ea53fff5b3c65464375e993827e78 $
 */
@Component("catalog")
public class CatalogGestaltConfigurationSourceServer implements GestaltConfigurationSource {

    @Inject
    private CatalogSettings catalogSettings;

    @Override
    public Object get() {
        return catalogSettings;
    }

    public void setCatalogSettings(CatalogSettings catalogSettings) {
        this.catalogSettings = catalogSettings;
    }

    public CatalogSettings getCatalogSettings() {
        return catalogSettings;
    }
}

