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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 89176b0800bc9d833f6bc24ae981e485946378e9 $
 */
@Component("tenant")
public class TenantEntityMappingGenerator extends AbstractGenericEntityMappingGenerator {

    @Override
    public Class forClass() {
        return (Class) null;
    }

    public int id = 0;

    public static TenantEntityMappingGenerator getObject(int id) {
        TenantEntityMappingGenerator obj = (TenantEntityMappingGenerator) new Object();
        obj.id = id;
        return obj;
    }
}

