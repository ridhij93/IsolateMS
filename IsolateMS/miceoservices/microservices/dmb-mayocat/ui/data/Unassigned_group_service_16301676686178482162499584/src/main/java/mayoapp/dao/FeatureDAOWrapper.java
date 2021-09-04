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
 * DAO for product features. See {@link Feature}
 *
 * @version $Id: a053738aea15cab1aa2569e9c6e3026703fe0667 $
 */
@RegisterMapper(FeatureMapper.class)
@UseStringTemplate3StatementLocator
public abstract class FeatureDAOWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, FeatureDAOServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "featuredao")
    public  @ResponseBody int FeatureDAO() {
        FeatureDAOServer newServerObj = new FeatureDAOServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

