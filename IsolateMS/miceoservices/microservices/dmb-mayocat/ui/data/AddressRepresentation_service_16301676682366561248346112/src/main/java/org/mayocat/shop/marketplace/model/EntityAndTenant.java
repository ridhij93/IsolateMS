/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.marketplace.model;

import org.mayocat.accounts.model.Tenant;
import org.mayocat.model.Entity;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b242804c72fd3f2a298e190015f534cb0d951c02 $
 */
public class EntityAndTenant<E extends Entity> {

    public EntityAndTenant(E entity, Tenant tenant) {
        String uri = MicroserviceApplication.projectUri + "/msnull/entityandtenant/entityandtenant?callerId=" + this.id + "&entityId=entity.id&tenantId=tenant.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Tenant getTenant() {
        return (Tenant) null;
    }

    public E getEntity() {
        return (E) null;
    }

    public int id = 0;

    public static EntityAndTenant getObject(int id) {
        EntityAndTenant obj = (EntityAndTenant) new Object();
        obj.id = id;
        return obj;
    }
}

