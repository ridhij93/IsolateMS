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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * In-memory implementation of {@link ArticleStore}
 *
 * @version $Id: 195308081656d459f3e5cd44ff548116492d0a45 $
 */
@Controller
@RequestMapping("/ms1/memoryarticlestore/")
public class MemoryArticleStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryArticleStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memoryarticlestore")
    public  @ResponseBody int MemoryArticleStore() {
        MemoryArticleStoreServer newServerObj = new MemoryArticleStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

