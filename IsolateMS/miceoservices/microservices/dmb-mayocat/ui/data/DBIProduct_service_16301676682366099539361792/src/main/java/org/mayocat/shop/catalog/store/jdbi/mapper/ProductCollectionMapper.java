/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.store.jdbi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.mayocat.shop.catalog.model.ProductCollection;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Mapper for {@link ProductCollection}
 *
 * @version $Id: ebdad70c18fd2f9fe397bd2cdcd91b33fa196f09 $
 */
public class ProductCollectionMapper implements ResultSetMapper<ProductCollection> {

    public ProductCollection map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return (ProductCollection) null;
    }

    public int id = 0;

    public static ProductCollectionMapper getObject(int id) {
        ProductCollectionMapper obj = (ProductCollectionMapper) new Object();
        obj.id = id;
        return obj;
    }
}

