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
 * @version $Id: 5031916edb52731d88f088ec72a30dcdf37324c2 $
 */
public class EntityAndParent<E extends Entity> {

    public EntityAndParent(EntityAndParent<E> parent, E entity) {
        String uri = MicroserviceApplication.projectUri + "/ms5/entityandparent/entityandparent?callerId=" + this.id + "&parentId=parent.id&entityId=entity.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public EntityAndParent<E> getParent() {
        return (EntityAndParent<E>) null;
    }

    public E getEntity() {
        return (E) null;
    }

    public int id = 0;

    public static EntityAndParent getObject(int id) {
        EntityAndParent obj = (EntityAndParent) new Object();
        obj.id = id;
        return obj;
    }
}

