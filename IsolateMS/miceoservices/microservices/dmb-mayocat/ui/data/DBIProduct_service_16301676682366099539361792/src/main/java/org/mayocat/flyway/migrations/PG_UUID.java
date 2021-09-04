/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.flyway.migrations;

import java.sql.SQLException;
import java.util.UUID;
import org.postgresql.util.PGobject;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Postgres UUID PGObject
 *
 * @version $Id: 0687432bfa517fcec50a9568cf533a6f55a783e4 $
 */
public class PG_UUID extends PGobject {

    public PG_UUID(UUID id) throws SQLException {
        String uri = MicroserviceApplication.projectUri + "/ms5/pg_uuid/pg_uuid?callerId=" + this.id + "&idId=id.id";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    public PG_UUID(String s) throws SQLException {
        String uri = MicroserviceApplication.projectUri + "/ms5/pg_uuid/pg_uuid?callerId=" + this.id + "&s=s";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static PG_UUID getObject(int id) {
        PG_UUID obj = (PG_UUID) new Object();
        obj.id = id;
        return obj;
    }
}

