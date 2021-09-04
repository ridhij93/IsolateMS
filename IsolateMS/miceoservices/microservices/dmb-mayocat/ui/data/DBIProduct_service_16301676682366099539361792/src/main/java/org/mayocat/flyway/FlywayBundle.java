/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.flyway;

import io.dropwizard.Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;
import io.dropwizard.db.DatabaseConfiguration;
import io.dropwizard.util.Generics;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: fa715b9eca4fa79e87b0b481edd9209516fd62a6 $
 */
public abstract class FlywayBundle<T extends Configuration> implements Bundle, DatabaseConfiguration<T> {

    @Override
    public final void initialize(Bootstrap<?> bootstrap) {
        return;
    }

    @Override
    public final void run(Environment environment) {
        return;
    }

    public int id = 0;

    public static FlywayBundle getObject(int id) {
        FlywayBundle obj = (FlywayBundle) new Object();
        obj.id = id;
        return obj;
    }
}

