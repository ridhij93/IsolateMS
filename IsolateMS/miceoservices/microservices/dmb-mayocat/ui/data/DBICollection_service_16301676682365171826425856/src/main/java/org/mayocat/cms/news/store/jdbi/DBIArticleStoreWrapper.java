/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news.store.jdbi;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.mayocat.cms.news.model.Article;
import org.mayocat.cms.news.store.ArticleStore;
import org.mayocat.model.AddonGroup;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.StoreException;
import org.mayocat.store.rdbms.dbi.DBIEntityStore;
import mayoapp.dao.ArticleDAO;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import static org.mayocat.addons.util.AddonUtils.asMap;
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
 * @version $Id: b012ac8db1d1381f944d96e98c0171a4ca64ee19 $
 */
@Component(hints = { "jdbi", "default" })
public class DBIArticleStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBIArticleStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbiarticlestore")
    public  @ResponseBody int DBIArticleStore() {
        DBIArticleStoreServer newServerObj = new DBIArticleStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

