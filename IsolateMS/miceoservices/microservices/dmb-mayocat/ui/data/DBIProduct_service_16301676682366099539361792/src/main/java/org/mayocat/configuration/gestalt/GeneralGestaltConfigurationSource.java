/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.gestalt;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.configuration.general.GeneralSettings;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7ede20042399d889c35edf13e1a4790543248911 $
 */
@Component("general")
public class GeneralGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    public void setGeneralSettings(GeneralSettings generalSettings) {
        return;
    }

    public GeneralSettings getGeneralSettings() {
        return (GeneralSettings) null;
    }

    public int id = 0;

    public static GeneralGestaltConfigurationSource getObject(int id) {
        GeneralGestaltConfigurationSource obj = (GeneralGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

