/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package mayoapp.migrations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.UUID;
import org.mayocat.flyway.migrations.PG_UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
 * Migrates tenant configuration : extract the tenant name from the configuration to put it directly in the
 * new "name" column.
 *
 * @version $Id: 23ff694f8b4788af9ce7ab99f2a68e3921a019ee $
 */
@Controller
@RequestMapping("/ms1/v0075_0003__update_tenant_configurations/")
public class V0075_0003__update_tenant_configurationsWrapper {

    private class ConfigurationAndName {

        private String configuration;

        private String name;

        private ConfigurationAndName(String configuration, String name) {
            this.configuration = configuration;
            this.name = name;
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, V0075_0003__update_tenant_configurationsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "v0075_0003__update_tenant_configurations")
    public  @ResponseBody int V0075_0003__update_tenant_configurations() {
        V0075_0003__update_tenant_configurationsServer newServerObj = new V0075_0003__update_tenant_configurationsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

