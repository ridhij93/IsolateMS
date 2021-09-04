/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.invoicing.store.jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.mayocat.shop.invoicing.model.InvoiceNumber;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a910c38135d603b3385eb5590a2582103d7e92c8 $
 */
public class InvoiceNumberMapper implements ResultSetMapper<InvoiceNumber> {

    @Override
    public InvoiceNumber map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return (InvoiceNumber) null;
    }

    public int id = 0;

    public static InvoiceNumberMapper getObject(int id) {
        InvoiceNumberMapper obj = (InvoiceNumberMapper) new Object();
        obj.id = id;
        return obj;
    }
}

