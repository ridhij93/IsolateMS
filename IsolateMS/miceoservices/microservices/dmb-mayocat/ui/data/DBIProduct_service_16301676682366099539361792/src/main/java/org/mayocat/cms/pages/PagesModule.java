/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;
import org.mayocat.cms.pages.meta.PageEntity;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a33bdedb85a459bc6f073a5e6a3065726440ccf3 $
 */
public class PagesModule implements Module {

    @Override
    public String getName() {
        return (String) null;
    }

    @Override
    public List<EntityMeta> getEntities() {
        return (List<EntityMeta>) null;
    }

    public int id = 0;

    public static PagesModule getObject(int id) {
        PagesModule obj = (PagesModule) new Object();
        obj.id = id;
        return obj;
    }
}

