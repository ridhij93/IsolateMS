/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.home.store.jdbi.mapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang3.LocaleUtils;
import org.mayocat.cms.home.model.HomePage;
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
 * @version $Id: 951d7f763075f780fd20ca03b7a58f86e4a62f96 $
 */
public class HomePageMapper implements ResultSetMapper<HomePage> {

    @Override
    public HomePage map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        return (HomePage) null;
    }

    public int id = 0;

    public static HomePageMapper getObject(int id) {
        HomePageMapper obj = (HomePageMapper) new Object();
        obj.id = id;
        return obj;
    }
}

