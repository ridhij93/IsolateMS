/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons.mapper;

import java.io.IOException;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.AddonSource;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 00f43bcf8c93341e98edb306692b601ca14846cc $
 */
public class AddonGroupMapper implements ResultSetMapper<AddonGroup> {

    @Override
    public AddonGroup map(int index, ResultSet result, StatementContext context) throws SQLException {
        return (AddonGroup) null;
    }

    public int id = 0;

    public static AddonGroupMapper getObject(int id) {
        AddonGroupMapper obj = (AddonGroupMapper) new Object();
        obj.id = id;
        return obj;
    }
}

