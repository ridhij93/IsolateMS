/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.store.jdbi;

import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.validation.Valid;
import org.mayocat.shop.payment.model.PaymentOperation;
import org.mayocat.shop.payment.store.PaymentOperationStore;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.rdbms.dbi.DBIProvider;
import mayoapp.dao.PaymentOperationDAO;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;
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
 * @version $Id: 25329062ff959ccd5e33fd5a9dca24b880e3d714 $
 */
@Component
public class DBIPaymentOperationStoreWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "create")
    public @ResponseBody ResponseEntity<Integer> create(@RequestParam int callerId, @Valid @RequestParam int operationId) {
        try {
            DBIPaymentOperationStoreServer callerObj = idObjMap.get(callerId);
            PaymentOperation result = callerObj.create(PaymentOperation.getObject(operationId));
            return new ResponseEntity<>(result.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "update")
    public @ResponseBody ResponseEntity<Void> update(@RequestParam int callerId, @Valid @RequestParam int entityId) {
        try {
            DBIPaymentOperationStoreServer callerObj = idObjMap.get(callerId);
            callerObj.update(PaymentOperation.getObject(entityId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "delete")
    public @ResponseBody ResponseEntity<Void> delete(@RequestParam int callerId, @Valid @RequestParam int entityId) {
        try {
            DBIPaymentOperationStoreServer callerObj = idObjMap.get(callerId);
            callerObj.delete(PaymentOperation.getObject(entityId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "countall")
    public @ResponseBody Integer countAll(@RequestParam int callerId) {
        DBIPaymentOperationStoreServer callerObj = idObjMap.get(callerId);
        Integer result = callerObj.countAll();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, DBIPaymentOperationStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "dbipaymentoperationstore")
    public  @ResponseBody int DBIPaymentOperationStore() {
        DBIPaymentOperationStoreServer newServerObj = new DBIPaymentOperationStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

