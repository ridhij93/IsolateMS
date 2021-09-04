/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Utility functions for mappers
 *
 * @version $Id: 0c9afbf1a10a42c11207d2b5377dc37e90d2686d $
 */
public class MapperUtils {

    public static boolean hasColumn(String columnName, ResultSet resultSet) {
        return (Boolean) null;
    }

    public int id = 0;

    public static MapperUtils getObject(int id) {
        MapperUtils obj = (MapperUtils) new Object();
        obj.id = id;
        return obj;
    }
}

