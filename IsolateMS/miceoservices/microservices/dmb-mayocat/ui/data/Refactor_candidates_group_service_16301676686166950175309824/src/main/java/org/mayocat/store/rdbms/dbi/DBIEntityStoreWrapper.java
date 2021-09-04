/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi;

import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.context.WebContext;
import org.mayocat.store.EntityStore;
import org.skife.jdbi.v2.DBI;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import org.xwiki.observation.ObservationManager;
import mayoapp.dao.EntityDAO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Component(hints = { "jdbi", "default" })
public class DBIEntityStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBIEntityStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbientitystore")
    public  @ResponseBody int DBIEntityStore() {
        DBIEntityStoreServer newServerObj = new DBIEntityStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

