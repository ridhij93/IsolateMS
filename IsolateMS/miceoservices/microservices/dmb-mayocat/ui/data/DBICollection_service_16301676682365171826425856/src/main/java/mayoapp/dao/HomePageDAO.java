/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.UUID;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.cms.home.model.HomePage;
import org.mayocat.cms.home.store.jdbi.mapper.HomePageMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Define;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3d0a485696f8b86a3b377acd3dfcc9bb34745ce4 $
 */
@RegisterMapper(HomePageMapper.class)
public abstract class HomePageDAO implements EntityDAO<HomePage>, Transactional<HomePageDAO>, AddonsDAO<HomePage>, LocalizationDAO<HomePage> {

    @SqlQuery("SELECT entity.*, localization_data(entity.id) FROM entity " + "WHERE entity.slug = 'home' AND entity.type = 'home' AND tenant_id IS NULL")
    public abstract HomePage find() {
        return (HomePage) null;
    }

    @SqlQuery("SELECT entity.*, localization_data(entity.id) FROM entity " + "WHERE entity.slug = 'home' AND entity.type = 'home' AND tenant_id IS NOT DISTINCT FROM :tenantId")
    public abstract HomePage find(@Bind("tenantId") UUID tenantId) {
        return (HomePage) null;
    }

    public void createOrUpdateAddons(HomePage entity) {
        return;
    }

    public int id = 0;

    public static HomePageDAO getObject(int id) {
        HomePageDAO obj = (HomePageDAO) new Object();
        obj.id = id;
        return obj;
    }
}

