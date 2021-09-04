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
 * @version $Id: 0e5ddfba913350c86d44ac9ad450ed6078431eec $
 */
public class PositionedEntity<E extends Entity> {

    public PositionedEntity(E entity, Integer position) {
        String uri = MicroserviceApplication.projectUri + "/ms0/positionedentity/positionedentity?callerId=" + this.id + "&entityId=entity.id&position=position";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public E getEntity() {
        return (E) null;
    }

    public Integer getPosition() {
        return (Integer) null;
    }

    public void setEntity(E entity) {
        return;
    }

    public void setPosition(Integer position) {
        return;
    }

    public int id = 0;

    public static PositionedEntity getObject(int id) {
        PositionedEntity obj = (PositionedEntity) new Object();
        obj.id = id;
        return obj;
    }
}

