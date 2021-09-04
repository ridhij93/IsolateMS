/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.configuration;

import java.util.Map;
import javax.inject.Inject;
import org.mayocat.configuration.gestalt.EntityConfigurationContributor;
import org.mayocat.shop.catalog.configuration.shop.CatalogSettings;
import org.mayocat.theme.TypeDefinition;
import org.xwiki.component.annotation.Component;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 92554bef3ca3542794295ecf289ab47acf896c5a $
 */
@Component("productTypes")
public class ProductTypesEntityConfigurationContributor implements EntityConfigurationContributor {

    @Override
    public String contributesTo() {
        return (String) null;
    }

    @Override
    public void contribute(Map<String, Object> configuration) {
        return;
    }

    public void setCatalogSettings(CatalogSettings catalogSettings) {
        return;
    }

    public CatalogSettings getCatalogSettings() {
        return (CatalogSettings) null;
    }

    public int id = 0;

    public static ProductTypesEntityConfigurationContributor getObject(int id) {
        ProductTypesEntityConfigurationContributor obj = (ProductTypesEntityConfigurationContributor) new Object();
        obj.id = id;
        return obj;
    }
}

