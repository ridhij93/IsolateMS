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
import org.mayocat.shop.payment.model.GatewayCustomerData;
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
 * Mapper for {@link GatewayCustomerData}
 *
 * @version $Id: f1aea28a7f14d38385553ef2555ce6861bfd8ae5 $
 */
public class GatewayCustomerDataMapper implements ResultSetMapper<GatewayCustomerData> {

    @Override
    public GatewayCustomerData map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (GatewayCustomerData) null;
    }

    public int id = 0;

    public static GatewayCustomerDataMapper getObject(int id) {
        GatewayCustomerDataMapper obj = (GatewayCustomerDataMapper) new Object();
        obj.id = id;
        return obj;
    }
}

