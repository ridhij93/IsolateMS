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
 * @version $Id: 92554bef3ca3542794295ecf289ab47acf896c5a $
 */
@Component("productTypes")
public class ProductTypesEntityConfigurationContributorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ProductTypesEntityConfigurationContributorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "producttypesentityconfigurationcontributor")
    public  @ResponseBody int ProductTypesEntityConfigurationContributor() {
        ProductTypesEntityConfigurationContributorServer newServerObj = new ProductTypesEntityConfigurationContributorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

