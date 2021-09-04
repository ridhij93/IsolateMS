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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 25329062ff959ccd5e33fd5a9dca24b880e3d714 $
 */
@Component
public class DBIPaymentOperationStore implements PaymentOperationStore, Initializable {

    @Override
    public PaymentOperation create(@Valid PaymentOperation operation) {
        String uri = MicroserviceApplication.projectUri + "/ms2/dbipaymentoperationstore/create?callerId=" + this.id + "&operationId=operation.id";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        PaymentOperation result = PaymentOperation.getObject(resultTemp.getBody());
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (PaymentOperation) null;
    }

    @Override
    public void update(@Valid PaymentOperation entity) {
        String uri = MicroserviceApplication.projectUri + "/ms2/dbipaymentoperationstore/update?callerId=" + this.id + "&entityId=entity.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    @Override
    public void delete(@Valid PaymentOperation entity) {
        String uri = MicroserviceApplication.projectUri + "/ms2/dbipaymentoperationstore/delete?callerId=" + this.id + "&entityId=entity.id";
        ResponseEntity<Void> resultTemp = new RestTemplate().getForEntity(uri, void.class);
    }

    @Override
    public Integer countAll() {
        String uri = MicroserviceApplication.projectUri + "/ms2/dbipaymentoperationstore/countallcallerId=" + this.id + "";
        Integer resultTemp = new RestTemplate().getForObject(uri, Integer.class);
        Integer result = resultTemp;
        return result;
    }

    @Override
    public List<PaymentOperation> findAllForOrderId(UUID order) {
        return (List<PaymentOperation>) null;
    }

    @Override
    public List<PaymentOperation> findAll(Integer number, Integer offset) {
        return (List<PaymentOperation>) null;
    }

    @Override
    public List<PaymentOperation> findByIds(List<UUID> ids) {
        return (List<PaymentOperation>) null;
    }

    @Override
    public PaymentOperation findById(UUID id) {
        return (PaymentOperation) null;
    }

    @Override
    public void initialize() throws InitializationException {
        return;
    }

    public void setDbi(DBIProvider dbi) {
        return;
    }

    public DBIProvider getDbi() {
        return (DBIProvider) null;
    }

    public void setDao(PaymentOperationDAO dao) {
        return;
    }

    public PaymentOperationDAO getDao() {
        return (PaymentOperationDAO) null;
    }

    public int id = 0;

    public static DBIPaymentOperationStore getObject(int id) {
        DBIPaymentOperationStore obj = (DBIPaymentOperationStore) new Object();
        obj.id = id;
        return obj;
    }
}

