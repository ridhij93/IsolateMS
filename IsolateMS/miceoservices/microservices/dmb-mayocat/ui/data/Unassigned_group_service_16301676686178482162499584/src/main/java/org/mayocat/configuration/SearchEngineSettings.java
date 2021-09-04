/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SearchEngineSettings {

    public String getName() {
        return (String) null;
    }

    public void setName(String name) {
        return;
    }

    public int id = 0;

    public static SearchEngineSettings getObject(int id) {
        SearchEngineSettings obj = (SearchEngineSettings) new Object();
        obj.id = id;
        return obj;
    }
}

