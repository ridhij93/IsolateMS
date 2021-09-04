/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.cms.news.model.Article;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7f09c36e9fc9a334918d5745768a5d50c0439127 $
 */
public class ArticleEntity implements EntityMeta {

    @Override
    public String getEntityName() {
        return (String) null;
    }

    @Override
    public Class getEntityClass() {
        return (Class) null;
    }

    public static String getID() {
        return (String) null;
    }

    public static String getPATH() {
        return (String) null;
    }

    public int id = 0;

    public static ArticleEntity getObject(int id) {
        ArticleEntity obj = (ArticleEntity) new Object();
        obj.id = id;
        return obj;
    }
}

