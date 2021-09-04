/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.argument.pg;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Postgres UUID jdbc object
 *
 * @version $Id: feb04b17422e862d150338c9535f14d312fd462b $
 */
public class PG_UUID extends org.postgresql.util.PGobject {

    public PG_UUID(String s) throws java.sql.SQLException {
        String uri = MicroserviceApplication.projectUri + "/ms5/pg_uuid/pg_uuid?callerId=" + this.id + "&s=s";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    public static String getUUID_TYPE() {
        return (String) null;
    }

    public int id = 0;

    public static PG_UUID getObject(int id) {
        PG_UUID obj = (PG_UUID) new Object();
        obj.id = id;
        return obj;
    }
}

