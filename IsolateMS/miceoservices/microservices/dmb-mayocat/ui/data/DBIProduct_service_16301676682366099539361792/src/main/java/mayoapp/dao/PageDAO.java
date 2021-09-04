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
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.cms.pages.model.Page;
import org.mayocat.cms.pages.store.jdbi.mapper.PageMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a3466501322ba4abf6bb6510b74e479f2d11e2e4 $
 */
@RegisterMapper(PageMapper.class)
@UseStringTemplate3StatementLocator
public abstract class PageDAO implements EntityDAO<Page>, Transactional<PageDAO>, PositionedDAO<Page>, AddonsDAO<Page>, LocalizationDAO<Page> {

    public PageDAO() {
        String uri = MicroserviceApplication.projectUri + "/ms1/pagedao/pagedaocallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @SqlQuery
    public abstract Integer lastPosition(@Bind("tenantId") UUID tenant) {
        return (Integer) null;
    }

    @SqlQuery
    public abstract List<Page> findAllRootPages(@Bind("tenantId") UUID tenant) {
        return (List<Page>) null;
    }

    @SqlUpdate
    public abstract void createPage(@Bind("position") Integer position, @BindBean("page") Page page) {
        return;
    }

    @SqlUpdate
    public abstract Integer updatePage(@BindBean("page") Page page) {
        return (Integer) null;
    }

    public void createOrUpdateAddons(Page entity) {
        return;
    }

    public int id = 0;

    public static PageDAO getObject(int id) {
        PageDAO obj = (PageDAO) new Object();
        obj.id = id;
        return obj;
    }
}

