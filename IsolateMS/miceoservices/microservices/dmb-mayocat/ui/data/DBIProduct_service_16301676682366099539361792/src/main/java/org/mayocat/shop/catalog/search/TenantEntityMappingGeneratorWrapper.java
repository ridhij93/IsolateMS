/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.search;

import org.mayocat.accounts.model.Tenant;
import org.mayocat.search.elasticsearch.AbstractGenericEntityMappingGenerator;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: 89176b0800bc9d833f6bc24ae981e485946378e9 $
 */
@Component("tenant")
public class TenantEntityMappingGeneratorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TenantEntityMappingGeneratorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tenantentitymappinggenerator")
    public  @ResponseBody int TenantEntityMappingGenerator() {
        TenantEntityMappingGeneratorServer newServerObj = new TenantEntityMappingGeneratorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

