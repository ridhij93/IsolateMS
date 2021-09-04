/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.entity;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mayocat.model.Entity;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: bc3fb292fbd15a55c9aa1fb304b53ea711c4bdda $
 */
public class EntityData<T extends Entity> {

    public EntityData(T entity) {
        String uri = MicroserviceApplication.projectUri + "/ms2/entitydata/entitydata?callerId=" + this.id + "&entityId=entity.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public T getEntity() {
        return (T) null;
    }

    public Optional<Entity> getParent() {
        return (Optional<Entity>) null;
    }

    public <E extends Entity> List<E> getChildren(Class<E> clazz) {
        return (List<E>) null;
    }

    public Set<Class<? extends Entity>> getChildrenTypes() {
        return (Set<Class<? extends Entity>>) null;
    }

    public <O> List<O> getDataList(Class<O> clazz) {
        return (List<O>) null;
    }

    public <O> Optional<O> getData(Class<O> clazz) {
        return (Optional<O>) null;
    }

    public Set<Class<?>> getDataTypes() {
        return (Set<Class<?>>) null;
    }

    public void setParent(Entity e) {
        return;
    }

    public <E extends Entity> void setChildren(Class<E> clazz, List<E> list) {
        return;
    }

    public <O> void setData(Class<O> clazz, O object) {
        return;
    }

    public <O> void setDataList(Class<O> clazz, List<O> object) {
        return;
    }

    public void setEntity(T entity) {
        return;
    }

    public int id = 0;

    public static EntityData getObject(int id) {
        EntityData obj = (EntityData) new Object();
        obj.id = id;
        return obj;
    }
}

