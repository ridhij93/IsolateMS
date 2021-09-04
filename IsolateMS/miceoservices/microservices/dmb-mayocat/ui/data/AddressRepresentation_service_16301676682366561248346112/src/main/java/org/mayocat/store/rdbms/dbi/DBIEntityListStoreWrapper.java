/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.validation.Valid;
import org.mayocat.model.EntityList;
import org.mayocat.model.event.EntityCreatedEvent;
import org.mayocat.model.event.EntityCreatingEvent;
import org.mayocat.model.event.EntityUpdatedEvent;
import org.mayocat.model.event.EntityUpdatingEvent;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.EntityListStore;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.StoreException;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import mayoapp.dao.EntityListDAO;
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
 * DBI implementation of {@link EntityListStore}
 *
 * @version $Id: 6b12d1e476626f0e60f09e1e4a7eeb8608762996 $
 */
@Component(hints = { "jdbi", "default" })
public class DBIEntityListStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBIEntityListStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbientityliststore")
    public  @ResponseBody int DBIEntityListStore() {
        DBIEntityListStoreServer newServerObj = new DBIEntityListStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

