/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.List;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.shop.catalog.model.Feature;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.catalog.store.jdbi.mapper.FeatureMapper;
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
 * DAO for product features. See {@link Feature}
 *
 * @version $Id: a053738aea15cab1aa2569e9c6e3026703fe0667 $
 */
@RegisterMapper(FeatureMapper.class)
@UseStringTemplate3StatementLocator
public abstract class FeatureDAO implements EntityDAO<Feature>, Transactional<FeatureDAO>, AddonsDAO<Feature>, LocalizationDAO<Feature> {

    public void createOrUpdateAddons(Feature entity) {
        return;
    }

    @SqlUpdate
    public abstract void createFeature(@BindBean("feature") Feature feature) {
        return;
    }

    @SqlQuery
    public abstract List<Feature> findAllForProduct(@BindBean("product") Product product) {
        return (List<Feature>) null;
    }

    public int id = 0;

    public static FeatureDAO getObject(int id) {
        FeatureDAO obj = (FeatureDAO) new Object();
        obj.id = id;
        return obj;
    }
}

