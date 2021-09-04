/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.dao;

import java.util.List;
import java.util.UUID;
import org.mayocat.shop.payment.model.PaymentOperation;
import org.mayocat.shop.payment.store.jdbi.mapper.PaymentOperationMapper;
import org.mayocat.store.rdbms.dbi.argument.MapAsJsonStringArgumentFactory;
import org.mayocat.shop.payment.store.jdbi.argument.PaymentOperationResultArgumentFactory;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterArgumentFactory;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.mixins.Transactional;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 3c846f75122b26a9f1dd1e691fcc5911e1ee545d $
 */
@RegisterMapper(PaymentOperationMapper.class)
@RegisterArgumentFactory({ MapAsJsonStringArgumentFactory.class, PaymentOperationResultArgumentFactory.class })
@UseStringTemplate3StatementLocator
public abstract class PaymentOperationDAO implements Transactional<PaymentOperationDAO> {

    @SqlUpdate
    public abstract void createPaymentOperation(@BindBean("operation") PaymentOperation operation) {
        return;
    }

    @SqlQuery
    public abstract List<PaymentOperation> findAllForOrderId(@Bind("orderId") UUID order) {
        return (List<PaymentOperation>) null;
    }

    public int id = 0;

    public static PaymentOperationDAO getObject(int id) {
        PaymentOperationDAO obj = (PaymentOperationDAO) new Object();
        obj.id = id;
        return obj;
    }
}

