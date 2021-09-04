/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.home.meta;

import org.mayocat.cms.home.model.HomePage;
import org.mayocat.meta.EntityMeta;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7a53a5ae34e12fd4036efc99d64420b39f77b327 $
 */
public class HomePageEntity implements EntityMeta {

    public String getEntityName() {
        return (String) null;
    }

    public Class getEntityClass() {
        return (Class) null;
    }

    public static String getID() {
        return (String) null;
    }

    public int id = 0;

    public static HomePageEntity getObject(int id) {
        HomePageEntity obj = (HomePageEntity) new Object();
        obj.id = id;
        return obj;
    }
}

