/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.theme;

import javax.validation.Valid;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @verison $Id: 8f53d87885e0a90487ec481d6d0064a94b53d79a $
 */
public class ThemeSettings implements ExposedSettings {

    public Configurable<String> getActive() {
        return (Configurable<String>) null;
    }

    @JsonIgnore
    @Override
    public String getKey() {
        return (String) null;
    }

    public void setActive(Configurable<String> active) {
        return;
    }

    public int id = 0;

    public static ThemeSettings getObject(int id) {
        ThemeSettings obj = (ThemeSettings) new Object();
        obj.id = id;
        return obj;
    }
}

