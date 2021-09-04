/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Settings for the localization filter. See {@link org.mayocat.localization.RequestLocalizationFilter}.
 *
 * @version $Id: 0ae96cd4a4ec2007257404634e2667828accefd0 $
 */
public class LocalizationFilterSettings {

    public List<String> getExcludePaths() {
        return (List<String>) null;
    }

    public void setExcludePaths(List<String> excludePaths) {
        return;
    }

    public int id = 0;

    public static LocalizationFilterSettings getObject(int id) {
        LocalizationFilterSettings obj = (LocalizationFilterSettings) new Object();
        obj.id = id;
        return obj;
    }
}

