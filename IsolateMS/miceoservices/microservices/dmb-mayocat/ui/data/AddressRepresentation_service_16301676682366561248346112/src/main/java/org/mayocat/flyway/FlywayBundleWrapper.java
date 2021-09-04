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
 * @version $Id: fa715b9eca4fa79e87b0b481edd9209516fd62a6 $
 */
@Controller
@RequestMapping("/ms2/flywaybundle/")
public abstract class FlywayBundleWrapper<T extends Configuration> {

    private static int maxId = 0;

    public static HashMap<Integer, FlywayBundleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "flywaybundle")
    public  @ResponseBody int FlywayBundle() {
        FlywayBundleServer newServerObj = new FlywayBundleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

