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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: b012ac8db1d1381f944d96e98c0171a4ca64ee19 $
 */
@Component(hints = { "jdbi", "default" })
public class DBIArticleStore extends DBIEntityStore implements ArticleStore, Initializable {

    @Override
    public Article create(@Valid Article article) throws EntityAlreadyExistsException, InvalidEntityException {
        return (Article) null;
    }

    @Override
    public void update(@Valid Article article) throws EntityDoesNotExistException, InvalidEntityException {
        return;
    }

    @Override
    public void delete(@Valid Article entity) throws EntityDoesNotExistException {
        return;
    }

    @Override
    public Integer countAll() {
        return (Integer) null;
    }

    @Override
    public List<Article> findAll(Integer number, Integer offset) {
        return (List<Article>) null;
    }

    @Override
    public List<Article> findByIds(List<UUID> ids) {
        return (List<Article>) null;
    }

    @Override
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

    @Override
    public Article findById(UUID id) {
        return (Article) null;
    }

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    public void setDao(ArticleDAO dao) {
        return;
    }

    public ArticleDAO getDao() {
        return (ArticleDAO) null;
    }

    public static String getARTICLE_TABLE_NAME() {
        return (String) null;
    }

    public int id = 0;

    public static DBIArticleStore getObject(int id) {
        DBIArticleStore obj = (DBIArticleStore) new Object();
        obj.id = id;
        return obj;
    }
}

