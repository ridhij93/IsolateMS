/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.internal.meta;

import java.util.List;
import org.mayocat.meta.EntityMeta;
import org.mayocat.meta.EntityMetaRegistry;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 960bffb11e6deefc62615ea8b53b4ea521df30c0 $
 */
public class DefaultEntityMetaRegistry implements EntityMetaRegistry {

    public DefaultEntityMetaRegistry(List<EntityMeta> entities) {
        String uri = MicroserviceApplication.projectUri + "/ms5/defaultentitymetaregistry/defaultentitymetaregistry?callerId=" + this.id + "&entitiesId=entities.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public List<EntityMeta> getEntities() {
        return (List<EntityMeta>) null;
    }

    public void setEntities(List<EntityMeta> entities) {
        return;
    }

    public int id = 0;

    public static DefaultEntityMetaRegistry getObject(int id) {
        DefaultEntityMetaRegistry obj = (DefaultEntityMetaRegistry) new Object();
        obj.id = id;
        return obj;
    }
}

