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
 * @version $Id: 7f09c36e9fc9a334918d5745768a5d50c0439127 $
 */
@Controller
@RequestMapping("/ms1/articleentity/")
public class ArticleEntityWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ArticleEntityServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "articleentity")
    public  @ResponseBody int ArticleEntity() {
        ArticleEntityServer newServerObj = new ArticleEntityServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

