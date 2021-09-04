/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.store.jdbi;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.mayocat.addons.store.dbi.AddonsHelper;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.event.EntityCreatedEvent;
import org.mayocat.model.event.EntityCreatingEvent;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.customer.store.CustomerStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.rdbms.dbi.DBIEntityStore;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import mayoapp.dao.CustomerDAO;
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
 * @version $Id: bdd4dcabeec03128354d5369c5528f6100df9b92 $
 */
@Component(hints = { "jdbi", "default" })
public class DBICustomerStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBICustomerStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbicustomerstore")
    public  @ResponseBody int DBICustomerStore() {
        DBICustomerStoreServer newServerObj = new DBICustomerStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

