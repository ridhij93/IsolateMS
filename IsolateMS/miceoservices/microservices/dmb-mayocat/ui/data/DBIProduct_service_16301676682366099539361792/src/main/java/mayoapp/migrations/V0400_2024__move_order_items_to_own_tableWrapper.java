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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 079e28514b38d326e90c17b3d54b30ca696ce3d1 $
 */
@Controller
@RequestMapping("/ms1/v0400_2024__move_order_items_to_own_table/")
public class V0400_2024__move_order_items_to_own_tableWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, V0400_2024__move_order_items_to_own_tableServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "v0400_2024__move_order_items_to_own_table")
    public  @ResponseBody int V0400_2024__move_order_items_to_own_table() {
        V0400_2024__move_order_items_to_own_tableServer newServerObj = new V0400_2024__move_order_items_to_own_tableServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

