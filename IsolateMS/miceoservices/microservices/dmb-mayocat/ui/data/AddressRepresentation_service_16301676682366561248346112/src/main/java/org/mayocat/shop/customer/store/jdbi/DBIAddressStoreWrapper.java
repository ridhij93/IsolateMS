/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.store.jdbi;

import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.validation.Valid;
import org.mayocat.shop.customer.store.AddressStore;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import mayoapp.dao.AddressDAO;
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
 * @version $Id: db61c52dead7b0f41106ba8ce909af65590b7d09 $
 */
@Component(hints = { "jdbi", "default" })
public class DBIAddressStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBIAddressStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbiaddressstore")
    public  @ResponseBody int DBIAddressStore() {
        DBIAddressStoreServer newServerObj = new DBIAddressStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

