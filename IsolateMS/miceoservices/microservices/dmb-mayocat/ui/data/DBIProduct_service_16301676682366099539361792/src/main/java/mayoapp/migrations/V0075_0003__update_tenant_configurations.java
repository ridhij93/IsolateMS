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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Migrates tenant configuration : extract the tenant name from the configuration to put it directly in the
 * new "name" column.
 *
 * @version $Id: 23ff694f8b4788af9ce7ab99f2a68e3921a019ee $
 */
public class V0075_0003__update_tenant_configurations implements JdbcMigration {

    private class ConfigurationAndName {

        private String configuration;

        private String name;

        private ConfigurationAndName(String configuration, String name) {
            String uri = MicroserviceApplication.projectUri + "/ms1/configurationandname/configurationandname?callerId=" + this.id + "&configuration=configuration&name=name";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        public String getConfiguration() {
            return (String) null;
        }

        public String getName() {
            return (String) null;
        }
    }

    @Override
    public void migrate(Connection connection) throws Exception {
        return;
    }

    public int id = 0;

    public static V0075_0003__update_tenant_configurations getObject(int id) {
        V0075_0003__update_tenant_configurations obj = (V0075_0003__update_tenant_configurations) new Object();
        obj.id = id;
        return obj;
    }
}

