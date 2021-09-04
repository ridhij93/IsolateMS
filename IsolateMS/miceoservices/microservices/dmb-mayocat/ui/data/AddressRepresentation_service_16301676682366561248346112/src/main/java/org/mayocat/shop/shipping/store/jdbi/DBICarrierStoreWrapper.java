/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.store.jdbi;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.context.WebContext;
import org.mayocat.shop.shipping.Strategy;
import org.mayocat.shop.shipping.model.Carrier;
import org.mayocat.shop.shipping.model.CarrierRule;
import org.mayocat.shop.shipping.store.CarrierStore;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import mayoapp.dao.CarrierDAO;
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
 * @version $Id: 1ef819cf53f5655c82a707aa606919550ab01ff5 $
 */
@Component
public class DBICarrierStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DBICarrierStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbicarrierstore")
    public  @ResponseBody int DBICarrierStore() {
        DBICarrierStoreServer newServerObj = new DBICarrierStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

