/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news.store.memory;

import java.util.List;
import javax.annotation.Nullable;
import org.mayocat.cms.news.model.Article;
import org.mayocat.cms.news.store.ArticleStore;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * In-memory implementation of {@link ArticleStore}
 *
 * @version $Id: 195308081656d459f3e5cd44ff548116492d0a45 $
 */
public class MemoryArticleStore extends BaseEntityMemoryStore<Article> implements ArticleStore {

    public Article findBySlug(String slug) {
        return (Article) null;
    }

    @Override
    public List<Article> findAllPublished(Integer offset, Integer number) {
        return (List<Article>) null;
    }

    @Override
    public Integer countAllPublished() {
        return (Integer) null;
    }

    public int id = 0;

    public static MemoryArticleStore getObject(int id) {
        MemoryArticleStore obj = (MemoryArticleStore) new Object();
        obj.id = id;
        return obj;
    }
}

