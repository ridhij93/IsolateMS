/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.meta;

import org.mayocat.accounts.model.Tenant;
import org.mayocat.meta.EntityMeta;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7fc00443398e8fa56736817244aaa9cb7c8286e4 $
 */
public class TenantEntity implements EntityMeta {

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

    public static TenantEntity getObject(int id) {
        TenantEntity obj = (TenantEntity) new Object();
        obj.id = id;
        return obj;
    }
}

