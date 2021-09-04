/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.model.OrderItem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.googlecode.flyway.core.api.migration.jdbc.JdbcMigration;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 079e28514b38d326e90c17b3d54b30ca696ce3d1 $
 */
public class V0400_2024__move_order_items_to_own_table implements JdbcMigration {

    @Override
    public void migrate(Connection connection) throws Exception {
        return;
    }

    private Map<String, Object> convertAddonsToMap(List<Map<String, Object>> addons) {
        return (Map<String, Object>) null;
    }

    public int id = 0;

    public static V0400_2024__move_order_items_to_own_table getObject(int id) {
        V0400_2024__move_order_items_to_own_table obj = (V0400_2024__move_order_items_to_own_table) new Object();
        obj.id = id;
        return obj;
    }
}

