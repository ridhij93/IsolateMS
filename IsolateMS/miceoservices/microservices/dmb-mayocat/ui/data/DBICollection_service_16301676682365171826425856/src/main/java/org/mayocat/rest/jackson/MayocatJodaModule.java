/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jackson;

import java.io.IOException;
import org.joda.time.DateTime;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MayocatJodaModule extends SimpleModule {

    public MayocatJodaModule() {
        String uri = MicroserviceApplication.projectUri + "/ms1/mayocatjodamodule/mayocatjodamodulecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public int id = 0;

    public static MayocatJodaModule getObject(int id) {
        MayocatJodaModule obj = (MayocatJodaModule) new Object();
        obj.id = id;
        return obj;
    }
}

