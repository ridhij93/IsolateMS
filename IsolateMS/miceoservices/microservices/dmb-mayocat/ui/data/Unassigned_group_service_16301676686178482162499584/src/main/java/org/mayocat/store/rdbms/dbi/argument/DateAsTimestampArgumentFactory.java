/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.argument;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Argument factory that binds java.util.Date as timestamp.
 *
 * See https://groups.google.com/d/msg/jdbi/ooFw_s183jM/WLwNBJuemYEJ
 *
 * @version $Id: 71ab08dc203bf726b6395a882252a31683920dad $
 */
public class DateAsTimestampArgumentFactory implements ArgumentFactory<Date> {

    @Override
    public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx) {
        return (Boolean) null;
    }

    @Override
    public Argument build(Class<?> expectedType, final Date value, StatementContext ctx) {
        return (Argument) null;
    }

    public int id = 0;

    public static DateAsTimestampArgumentFactory getObject(int id) {
        DateAsTimestampArgumentFactory obj = (DateAsTimestampArgumentFactory) new Object();
        obj.id = id;
        return obj;
    }
}

