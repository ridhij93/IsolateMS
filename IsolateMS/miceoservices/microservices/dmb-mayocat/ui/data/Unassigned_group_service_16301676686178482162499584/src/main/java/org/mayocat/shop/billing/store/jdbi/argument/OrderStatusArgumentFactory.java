/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.store.jdbi.argument;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.mayocat.shop.billing.model.Order;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 0e76039dc1e21bfd1e48b08bed1af3f1d199400a $
 */
public class OrderStatusArgumentFactory implements ArgumentFactory<Order.Status> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, final Order.Status value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static OrderStatusArgumentFactory getObject(int id) {
        OrderStatusArgumentFactory obj = (OrderStatusArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

