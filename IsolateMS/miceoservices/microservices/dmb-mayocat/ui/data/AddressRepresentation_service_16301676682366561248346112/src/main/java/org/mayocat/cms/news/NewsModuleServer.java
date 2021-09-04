/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.cms.news.meta.ArticleEntity;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;

/**
 * @version $Id: 43a26f1328b23dd9787a22b5e90295f5e4ea7353 $
 */
public class NewsModuleServer implements Module {

    private static final List<EntityMeta> entities = new ArrayList<EntityMeta>();

    static {
        entities.add(new ArticleEntity());
    }

    @Override
    public String getName() {
        return "news";
    }

    @Override
    public List<EntityMeta> getEntities() {
        return entities;
    }
}

