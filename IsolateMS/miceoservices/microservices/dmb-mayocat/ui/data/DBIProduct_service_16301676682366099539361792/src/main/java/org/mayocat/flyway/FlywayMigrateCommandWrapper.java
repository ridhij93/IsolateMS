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
 * @version $Id: 7be08cb104b0251fbb687c47609d7ca30314f367 $
 */
@Controller
@RequestMapping("/ms1/flywaymigratecommand/")
public class FlywayMigrateCommandWrapper<T extends Configuration> {

    private static int maxId = 0;

    public static HashMap<Integer, FlywayMigrateCommandServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "flywaymigratecommand")
    public  @ResponseBody int FlywayMigrateCommand(@RequestParam int strategyId, @RequestParam int configurationClassId) {
    }
}

