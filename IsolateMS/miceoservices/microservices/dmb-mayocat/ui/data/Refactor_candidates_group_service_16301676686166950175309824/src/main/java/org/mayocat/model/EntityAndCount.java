/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3dffc577775855bb13b07818c8ad091bbd73d3f9 $
 *
 * Represents a pair of an entity and a count associated with it.
 */
public class EntityAndCount<E> {

    public EntityAndCount(E e, Long c) {
        String uri = MicroserviceApplication.projectUri + "/msnull/entityandcount/entityandcount?callerId=" + this.id + "&eId=e.id&c=c";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public E getEntity() {
        return (E) null;
    }

    public Long getCount() {
        return (Long) null;
    }

    public void setEntity(E entity) {
        return;
    }

    public void setCount(Long count) {
        return;
    }

    public int id = 0;

    public static EntityAndCount getObject(int id) {
        EntityAndCount obj = (EntityAndCount) new Object();
        obj.id = id;
        return obj;
    }
}

