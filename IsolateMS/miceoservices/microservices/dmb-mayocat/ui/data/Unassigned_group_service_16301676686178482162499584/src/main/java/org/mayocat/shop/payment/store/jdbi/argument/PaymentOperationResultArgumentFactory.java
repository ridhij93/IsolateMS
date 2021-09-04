/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.store.jdbi.argument;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.mayocat.shop.payment.model.PaymentOperation;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9dd3820a537d629f5ba1183929c6511b63c3a13c $
 */
public class PaymentOperationResultArgumentFactory implements ArgumentFactory<PaymentOperation.Result> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, final PaymentOperation.Result value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static PaymentOperationResultArgumentFactory getObject(int id) {
        PaymentOperationResultArgumentFactory obj = (PaymentOperationResultArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

