/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: d0248d25b5fd631f96a9f8947c511adb562e12dc $
 */
public class EntityReferenceRepresentation extends LinkRepresentation {

    public EntityReferenceRepresentation() {
        String uri = MicroserviceApplication.projectUri + "/ms0/entityreferencerepresentation/entityreferencerepresentationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public EntityReferenceRepresentation(String href, String slug, String title) {
        String uri = MicroserviceApplication.projectUri + "/ms0/entityreferencerepresentation/entityreferencerepresentation?callerId=" + this.id + "&href=href&slug=slug&title=title";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getTitle() {
        return (String) null;
    }

    public String getSlug() {
        return (String) null;
    }

    public void setTitle(String title) {
        return;
    }

    public void setSlug(String slug) {
        return;
    }

    public int id = 0;

    public static EntityReferenceRepresentation getObject(int id) {
        EntityReferenceRepresentation obj = (EntityReferenceRepresentation) new Object();
        obj.id = id;
        return obj;
    }
}

