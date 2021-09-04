/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import groovy.lang.GString;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Jackson module for the groovy language.
 *
 * @version $Id: 24dec349b2441b5ed1904794a52eee128fd07556 $
 */
public class MayocatGroovyModule extends SimpleModule {

    public MayocatGroovyModule() {
        String uri = MicroserviceApplication.projectUri + "/ms0/mayocatgroovymodule/mayocatgroovymodulecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static MayocatGroovyModule getObject(int id) {
        MayocatGroovyModule obj = (MayocatGroovyModule) new Object();
        obj.id = id;
        return obj;
    }
}

