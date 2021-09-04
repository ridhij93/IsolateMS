/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.annotation.DoNotIndex;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Model for a list of {@link Entity}, which are entities themselves.
 *
 * @version $Id: 84a026521134347d16529e318808e978eeb18a02 $
 */
public class EntityList implements Entity, Child {

    // FUTURE:
    // if we want to implement a "mixed" type (where entities in the list are of heterogeneous types), this list would
    // hold the individual types at the #entities list matching index.
    // private List<String> types;
    public UUID getId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/entitylist/getidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setId(UUID id) {
        return;
    }

    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms1/entitylist/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSlug(String slug) {
        return;
    }

    public List<UUID> getEntities() {
        String uri = MicroserviceApplication.projectUri + "/ms1/entitylist/getentitiescallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        List<UUID> result = (List<UUID>) new Object();
        return result;
    }

    public String getType() {
        return (String) null;
    }

    public void setType(String type) {
        return;
    }

    public void setEntities(List<UUID> entities) {
        return;
    }

    public String getHint() {
        String uri = MicroserviceApplication.projectUri + "/ms1/entitylist/gethintcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setHint(String hint) {
        return;
    }

    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    public int hashCode() {
        return (Integer) null;
    }

    public String toString() {
        return (String) null;
    }

    public UUID getParentId() {
        return (UUID) null;
    }

    public void setParentId(UUID id) {
        return;
    }

    public int id = 0;

    public static EntityList getObject(int id) {
        EntityList obj = (EntityList) new Object();
        obj.id = id;
        return obj;
    }
}

