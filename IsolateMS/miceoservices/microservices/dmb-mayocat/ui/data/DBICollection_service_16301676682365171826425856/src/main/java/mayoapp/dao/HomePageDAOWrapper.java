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
 * @version $Id: 3d0a485696f8b86a3b377acd3dfcc9bb34745ce4 $
 */
@RegisterMapper(HomePageMapper.class)
public abstract class HomePageDAOWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, HomePageDAOServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "homepagedao")
    public  @ResponseBody int HomePageDAO() {
        HomePageDAOServer newServerObj = new HomePageDAOServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

