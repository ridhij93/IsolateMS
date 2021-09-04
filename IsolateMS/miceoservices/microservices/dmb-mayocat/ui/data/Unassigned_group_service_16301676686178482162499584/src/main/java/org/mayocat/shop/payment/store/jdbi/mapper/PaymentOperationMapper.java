/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.store.jdbi.mapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;
import org.mayocat.shop.payment.model.PaymentOperation;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f03dfe746d2e8fde998e6c1a7529056e23621519 $
 */
public class PaymentOperationMapper implements ResultSetMapper<PaymentOperation> {

    @Override
    public PaymentOperation map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (PaymentOperation) null;
    }

    public int id = 0;

    public static PaymentOperationMapper getObject(int id) {
        PaymentOperationMapper obj = (PaymentOperationMapper) new Object();
        obj.id = id;
        return obj;
    }
}

