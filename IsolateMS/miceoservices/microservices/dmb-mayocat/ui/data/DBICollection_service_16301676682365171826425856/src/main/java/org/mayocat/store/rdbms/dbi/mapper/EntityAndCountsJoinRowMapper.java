/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.mapper;

import java.util.Map;
import org.mayocat.store.rdbms.dbi.jointype.EntityAndCountsJoinRow;
import com.google.common.collect.ImmutableMap;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: db808f97025438d3de834b6db7b97f99d0be473b $
 */
public class EntityAndCountsJoinRowMapper extends BaseMapMapper<EntityAndCountsJoinRow> {

    @Override
    protected EntityAndCountsJoinRow mapInternal(int index, final Map<String, Object> rowData) {
        return (EntityAndCountsJoinRow) null;
    }

    private boolean isCountKey(String rowKey) {
        return (Boolean) null;
    }

    public int id = 0;

    public static EntityAndCountsJoinRowMapper getObject(int id) {
        EntityAndCountsJoinRowMapper obj = (EntityAndCountsJoinRowMapper) new Object();
        obj.id = id;
        return obj;
    }
}

