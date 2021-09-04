/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;
import org.mayocat.shop.catalog.meta.CollectionEntity;
import org.mayocat.shop.catalog.meta.ProductEntity;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 94bb8d51f0fa23572f404d5ada1b8a6a4e17aff3 $
 */
public class CatalogModule implements Module {

    @Override
    public String getName() {
        return (String) null;
    }

    @Override
    public List<EntityMeta> getEntities() {
        return (List<EntityMeta>) null;
    }

    public int id = 0;

    public static CatalogModule getObject(int id) {
        CatalogModule obj = (CatalogModule) new Object();
        obj.id = id;
        return obj;
    }
}

