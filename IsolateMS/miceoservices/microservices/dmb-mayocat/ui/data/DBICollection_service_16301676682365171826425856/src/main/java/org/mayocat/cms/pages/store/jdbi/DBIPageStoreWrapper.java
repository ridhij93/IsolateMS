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
 * @version $Id: 145f4063785a0b2d46d313990dece30f5a68572d $
 */
@Component(hints = { "jdbi", "default" })
public class DBIPageStoreWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "create")
    public @ResponseBody ResponseEntity<Integer> create(@RequestParam int callerId, @Valid @RequestParam int pageId) {
        try {
            DBIPageStoreServer callerObj = idObjMap.get(callerId);
            Page result = callerObj.create(Page.getObject(pageId));
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "initialize")
    public @ResponseBody ResponseEntity<Void> initialize(@RequestParam int callerId) {
        try {
            DBIPageStoreServer callerObj = idObjMap.get(callerId);
            callerObj.initialize();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, DBIPageStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbipagestore")
    public  @ResponseBody int DBIPageStore() {
        DBIPageStoreServer newServerObj = new DBIPageStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

