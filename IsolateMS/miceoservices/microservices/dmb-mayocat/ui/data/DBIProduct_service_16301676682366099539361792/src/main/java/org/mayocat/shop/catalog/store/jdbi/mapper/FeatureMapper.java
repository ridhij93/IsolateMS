/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.store.jdbi.mapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.mayocat.shop.catalog.model.Feature;
import org.mayocat.shop.catalog.model.Product;
import org.mayocat.store.rdbms.dbi.mapper.MapperUtils;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * JDBI mapper for {@link Feature}
 *
 * @version $Id: 1f36fff59aba3141dab1cf48324d5cd2f452167b $
 */
public class FeatureMapper implements ResultSetMapper<Feature> {

    @Override
    public Feature map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (Feature) null;
    }

    public int id = 0;

    public static FeatureMapper getObject(int id) {
        FeatureMapper obj = (FeatureMapper) new Object();
        obj.id = id;
        return obj;
    }
}

