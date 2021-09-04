/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.flyway;

import com.googlecode.flyway.core.Flyway;
import io.dropwizard.Configuration;
import io.dropwizard.cli.ConfiguredCommand;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.db.DatabaseConfiguration;
import io.dropwizard.setup.Bootstrap;
import net.sourceforge.argparse4j.inf.Namespace;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7be08cb104b0251fbb687c47609d7ca30314f367 $
 */
public class FlywayMigrateCommand<T extends Configuration> extends ConfiguredCommand<T> {

    public FlywayMigrateCommand(DatabaseConfiguration<T> strategy, Class<T> configurationClass) {
        String uri = MicroserviceApplication.projectUri + "/ms1/flywaymigratecommand/flywaymigratecommand?callerId=" + this.id + "&strategyId=strategy.id&configurationClassId=configurationClass.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    protected Class<T> getConfigurationClass() {
        return (Class<T>) null;
    }

    @Override
    protected void run(Bootstrap<T> bootstrap, Namespace namespace, T configuration) throws Exception {
        return;
    }

    public static String getMAYOAPP_MIGRATIONS() {
        return (String) null;
    }

    public DatabaseConfiguration<T> getStrategy() {
        return (DatabaseConfiguration<T>) null;
    }

    public int id = 0;

    public static FlywayMigrateCommand getObject(int id) {
        FlywayMigrateCommand obj = (FlywayMigrateCommand) new Object();
        obj.id = id;
        return obj;
    }
}

