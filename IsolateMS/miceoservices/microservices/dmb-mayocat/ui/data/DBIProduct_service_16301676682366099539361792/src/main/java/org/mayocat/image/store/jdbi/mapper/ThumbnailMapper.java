/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.image.store.jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.mayocat.image.model.Thumbnail;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1103077377c65f0bbad39e80b6bae62575a963f6 $
 */
public class ThumbnailMapper implements ResultSetMapper<Thumbnail> {

    @Override
    public Thumbnail map(int index, ResultSet result, StatementContext ctx) throws SQLException {
        return (Thumbnail) null;
    }

    public int id = 0;

    public static ThumbnailMapper getObject(int id) {
        ThumbnailMapper obj = (ThumbnailMapper) new Object();
        obj.id = id;
        return obj;
    }
}

