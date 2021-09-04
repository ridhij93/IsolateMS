/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.news.store.jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.mayocat.cms.news.model.Article;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3385a891a7647b3cee151cd010d95c9832d468d1 $
 */
public class ArticleMapper implements ResultSetMapper<Article> {

    @Override
    public Article map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (Article) null;
    }

    public int id = 0;

    public static ArticleMapper getObject(int id) {
        ArticleMapper obj = (ArticleMapper) new Object();
        obj.id = id;
        return obj;
    }
}

