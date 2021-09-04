/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.List;
import java.util.UUID;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.cms.news.model.Article;
import org.mayocat.cms.news.store.jdbi.mapper.ArticleMapper;
import org.mayocat.store.rdbms.dbi.argument.DateAsTimestampArgumentFactory;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterArgumentFactory;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
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
 * @version $Id: 5d8b2dcb9fdd5e800eda8695ea1c8f64634946a7 $
 */
@RegisterMapper(ArticleMapper.class)
@RegisterArgumentFactory(DateAsTimestampArgumentFactory.class)
@UseStringTemplate3StatementLocator
public abstract class ArticleDAOWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ArticleDAOServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "articledao")
    public  @ResponseBody int ArticleDAO() {
        ArticleDAOServer newServerObj = new ArticleDAOServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

