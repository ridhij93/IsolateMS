/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.memory;

import java.util.UUID;
import org.mayocat.model.Identifiable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Default positioned entity for memory stores.
 *
 * @version $Id: e7e3d025e48f056d0149d921c86a934a82afbadf $
 */
public class DefaultPositionedEntity<T extends Identifiable> implements PositionedEntity<T> {

    public DefaultPositionedEntity(T entity, Integer position) {
        String uri = MicroserviceApplication.projectUri + "/ms2/defaultpositionedentity/defaultpositionedentity?callerId=" + this.id + "&entityId=entity.id&position=position";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getId() {
        return (UUID) null;
    }

    public void setId(UUID id) {
        return;
    }

    public void setEntity(T entity) {
        return;
    }

    public Integer getPosition() {
        return (Integer) null;
    }

    public T getEntity() {
        return (T) null;
    }

    public void setPosition(Integer position) {
        return;
    }

    public int id = 0;

    public static DefaultPositionedEntity getObject(int id) {
        DefaultPositionedEntity obj = (DefaultPositionedEntity) new Object();
        obj.id = id;
        return obj;
    }
}

