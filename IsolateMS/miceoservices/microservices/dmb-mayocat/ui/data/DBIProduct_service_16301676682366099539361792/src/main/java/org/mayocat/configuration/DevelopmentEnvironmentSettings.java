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

/**
 * Settings for the development environment
 *
 * @version $Id: 9e78442f41baf5ead3b487ec5754acdb91f609c2 $
 */
public class DevelopmentEnvironmentSettings {

    public boolean isEnabled() {
        return (Boolean) null;
    }

    public boolean isLogDatabaseRequests() {
        return (Boolean) null;
    }

    public void setEnabled(boolean enabled) {
        return;
    }

    public boolean getEnabled() {
        return (Boolean) null;
    }

    public void setLogDatabaseRequests(boolean logDatabaseRequests) {
        return;
    }

    public boolean getLogDatabaseRequests() {
        return (Boolean) null;
    }

    public int id = 0;

    public static DevelopmentEnvironmentSettings getObject(int id) {
        DevelopmentEnvironmentSettings obj = (DevelopmentEnvironmentSettings) new Object();
        obj.id = id;
        return obj;
    }
}

