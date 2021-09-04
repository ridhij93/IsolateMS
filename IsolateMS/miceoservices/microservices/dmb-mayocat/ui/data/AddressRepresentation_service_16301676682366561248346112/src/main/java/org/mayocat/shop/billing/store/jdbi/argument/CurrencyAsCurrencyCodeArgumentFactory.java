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
import java.util.Currency;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 35c26b8cb41fa8134f7bd0548f3d9c879e7b01fe $
 */
public class CurrencyAsCurrencyCodeArgumentFactory implements ArgumentFactory<Currency> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, final Currency value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static CurrencyAsCurrencyCodeArgumentFactory getObject(int id) {
        CurrencyAsCurrencyCodeArgumentFactory obj = (CurrencyAsCurrencyCodeArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

