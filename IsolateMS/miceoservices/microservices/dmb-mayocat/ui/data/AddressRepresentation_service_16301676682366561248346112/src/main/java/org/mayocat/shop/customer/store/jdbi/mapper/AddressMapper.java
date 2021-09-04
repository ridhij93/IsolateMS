/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.store.jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.mayocat.shop.customer.model.Address;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a0c521541b12cd00006609d0e10380739db4bb49 $
 */
public class AddressMapper implements ResultSetMapper<Address> {

    @Override
    public Address map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (Address) null;
    }

    public int id = 0;

    public static AddressMapper getObject(int id) {
        AddressMapper obj = (AddressMapper) new Object();
        obj.id = id;
        return obj;
    }
}

