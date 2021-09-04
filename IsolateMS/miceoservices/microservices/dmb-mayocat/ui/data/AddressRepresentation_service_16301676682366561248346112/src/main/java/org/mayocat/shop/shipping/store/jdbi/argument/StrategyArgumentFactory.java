/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.store.jdbi.argument;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.mayocat.shop.shipping.Strategy;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 73ff7538f7310273774bca3e0df5b88d1a5e43e1 $
 */
public class StrategyArgumentFactory implements ArgumentFactory<Strategy> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, final Strategy value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static StrategyArgumentFactory getObject(int id) {
        StrategyArgumentFactory obj = (StrategyArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

