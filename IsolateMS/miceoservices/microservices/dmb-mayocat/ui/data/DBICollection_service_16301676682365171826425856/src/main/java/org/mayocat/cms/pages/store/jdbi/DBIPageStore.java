/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages.store.jdbi;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.validation.Valid;
import org.mayocat.cms.pages.model.Page;
import org.mayocat.cms.pages.store.PageStore;
import org.mayocat.model.AddonGroup;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.StoreException;
import org.mayocat.store.rdbms.dbi.DBIEntityStore;
import mayoapp.dao.PageDAO;
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
 * @version $Id: 145f4063785a0b2d46d313990dece30f5a68572d $
 */
@Component(hints = { "jdbi", "default" })
public class DBIPageStore extends DBIEntityStore implements PageStore, Initializable {

    @Override
    public Page create(@Valid Page page) {
        String uri = MicroserviceApplication.projectUri + "/ms0/dbipagestore/create?callerId=" + this.id + "&pageId=page.id";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        Page result = Page.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (Page) null;
    }

    @Override
    public void update(@Valid Page page) throws EntityDoesNotExistException, InvalidEntityException {
        return;
    }

    @Override
    public void delete(@Valid Page entity) throws EntityDoesNotExistException {
        return;
    }

    @Override
    public List<Page> findAll(Integer number, Integer offset) {
        return (List<Page>) null;
    }

    @Override
    public List<Page> findAllRootPages() {
        return (List<Page>) null;
    }

    @Override
    public List<Page> findByIds(List<UUID> ids) {
        return (List<Page>) null;
    }

    @Override
    public Integer countAll() {
        return (Integer) null;
    }

    @Override
    public Page findBySlug(String slug) {
        return (Page) null;
    }

    @Override
    public Page findById(UUID id) {
        return (Page) null;
    }

    @Override
    public void initialize() {
        String uri = MicroserviceApplication.projectUri + "/ms0/dbipagestore/initializecallerId=" + this.id + "";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    public static String getPAGE_POSITION() {
        return (String) null;
    }

    public static String getPAGE_TABLE_NAME() {
        return (String) null;
    }

    public void setDao(PageDAO dao) {
        return;
    }

    public PageDAO getDao() {
        return (PageDAO) null;
    }

    public int id = 0;

    public static DBIPageStore getObject(int id) {
        DBIPageStore obj = (DBIPageStore) new Object();
        obj.id = id;
        return obj;
    }
}

