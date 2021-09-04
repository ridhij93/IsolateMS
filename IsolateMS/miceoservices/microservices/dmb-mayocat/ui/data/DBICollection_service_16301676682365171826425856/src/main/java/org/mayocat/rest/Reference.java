/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.apache.commons.lang3.StringUtils;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A qualified reference to an entity, providing both the entity slug and its tenant owner slug.
 *
 * @version $Id: c9dec24b7f1e872a4d8e5294a39ae163b86f093f $
 */
public class Reference {

    public Reference(String slug, String tenantSlug) {
        String uri = MicroserviceApplication.projectUri + "/ms0/reference/reference?callerId=" + this.id + "&slug=slug&tenantSlug=tenantSlug";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getEntitySlug() {
        return (String) null;
    }

    public String getTenantSlug() {
        return (String) null;
    }

    public static Reference valueOf(String serialized) {
        return (Reference) null;
    }

    public int id = 0;

    public static Reference getObject(int id) {
        Reference obj = (Reference) new Object();
        obj.id = id;
        return obj;
    }
}

