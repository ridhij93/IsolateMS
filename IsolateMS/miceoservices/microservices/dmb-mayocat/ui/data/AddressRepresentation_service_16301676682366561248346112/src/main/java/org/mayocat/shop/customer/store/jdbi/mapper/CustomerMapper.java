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
import org.mayocat.shop.customer.model.Customer;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 515231bc7b6c61e844a5edd9422c63dabe1365f3 $
 */
public class CustomerMapper implements ResultSetMapper<Customer> {

    @Override
    public Customer map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (Customer) null;
    }

    public int id = 0;

    public static CustomerMapper getObject(int id) {
        CustomerMapper obj = (CustomerMapper) new Object();
        obj.id = id;
        return obj;
    }
}

