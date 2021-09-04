/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.general;

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
 * @version $Id: eb68c719b7c106d4b5115478e19759e57aa33463 $
 */
public class GeneralSettings implements ExposedSettings {

    public LocalesSettings getLocales() {
        return (LocalesSettings) null;
    }

    public TimeSettings getTime() {
        return (TimeSettings) null;
    }

    public String getNotificationsEmail() {
        return (String) null;
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    @JsonIgnore
    public String getKey() {
        return (String) null;
    }

    public void setLocales(LocalesSettings locales) {
        return;
    }

    public void setTime(TimeSettings time) {
        return;
    }

    public void setNotificationsEmail(String notificationsEmail) {
        return;
    }

    public int id = 0;

    public static GeneralSettings getObject(int id) {
        GeneralSettings obj = (GeneralSettings) new Object();
        obj.id = id;
        return obj;
    }
}

