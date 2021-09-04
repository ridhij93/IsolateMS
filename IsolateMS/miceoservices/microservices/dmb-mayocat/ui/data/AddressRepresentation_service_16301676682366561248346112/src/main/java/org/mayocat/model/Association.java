/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import java.io.Serializable;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Intended to wrap an entity field in an option style construct that let consumers test whether the field has been
 * loaded or not. Typically loaded will mean "loaded from database". When backed by a RDBMS, this is useful for fields
 * that require sub-querying, or joins, or any costy operation. Those fields would be typically loaded only when
 * needed.
 *
 * @version $Id: c62bf4e97d8915e3075ca784fa99f839c2f286e4 $
 */
public class Association<T> implements Serializable {

    public static Association notLoaded() {
        return (Association) null;
    }

    public Association(T t) {
        String uri = MicroserviceApplication.projectUri + "/ms0/association/association?callerId=" + this.id + "&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public boolean isLoaded() {
        return (Boolean) null;
    }

    public T or(T t) {
        return (T) null;
    }

    public T orNull() {
        return (T) null;
    }

    public T get() {
        return (T) null;
    }

    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public void setReference(T reference) {
        return;
    }

    public T getReference() {
        return (T) null;
    }

    public int id = 0;

    public static Association getObject(int id) {
        Association obj = (Association) new Object();
        obj.id = id;
        return obj;
    }
}

