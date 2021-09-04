/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.catalog.model.Collection;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: cb2870c26ba471ac2a36c10ee5df43eeb581f099 $
 */
public class CollectionEntity implements EntityMeta {

    @Override
    public String getEntityName() {
        return (String) null;
    }

    @Override
    public Class getEntityClass() {
        return (Class) null;
    }

    public static String getID() {
        return (String) null;
    }

    public static String getPATH() {
        return (String) null;
    }

    public int id = 0;

    public static CollectionEntity getObject(int id) {
        CollectionEntity obj = (CollectionEntity) new Object();
        obj.id = id;
        return obj;
    }
}

