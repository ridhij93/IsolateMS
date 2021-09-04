/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.store.jdbi;

import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.shop.payment.InvalidGatewayDataException;
import org.mayocat.shop.payment.model.GatewayCustomerData;
import org.mayocat.shop.payment.model.GatewayTenantData;
import org.mayocat.shop.payment.store.GatewayDataStore;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
import com.google.common.base.Optional;
import mayoapp.dao.GatewayDataDAO;
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
 * DBI implementation of {@link org.mayocat.shop.payment.store.GatewayDataStore}
 *
 * @version $Id: e0bea89d9d2989d90c1600ecee3cafb1d446fe54 $
 */
@Component
public class DBIGatewayDataStoreWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "storetenantdata")
    public @ResponseBody ResponseEntity<Void> storeTenantData(@RequestParam int callerId, @RequestParam int tenantDataId) {
        try {
            DBIGatewayDataStoreServer callerObj = idObjMap.get(callerId);
            callerObj.storeTenantData(GatewayTenantData.getObject(tenantDataId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "initialize")
    public @ResponseBody ResponseEntity<Void> initialize(@RequestParam int callerId) {
        try {
            DBIGatewayDataStoreServer callerObj = idObjMap.get(callerId);
            callerObj.initialize();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, DBIGatewayDataStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbigatewaydatastore")
    public  @ResponseBody int DBIGatewayDataStore() {
        DBIGatewayDataStoreServer newServerObj = new DBIGatewayDataStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

