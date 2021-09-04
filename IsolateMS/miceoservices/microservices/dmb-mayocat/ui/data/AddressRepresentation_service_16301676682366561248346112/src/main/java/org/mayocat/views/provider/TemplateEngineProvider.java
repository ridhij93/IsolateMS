/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views.provider;

import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.views.TemplateEngine;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 59ed44ed4bac7f1c90ddff1d6a8226b9bdec2d8d $
 */
public class TemplateEngineProvider implements Provider<TemplateEngine> {

    @Override
    public TemplateEngine get() {
        return (TemplateEngine) null;
    }

    public void setComponentManager(ComponentManager componentManager) {
        return;
    }

    public ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    public int id = 0;

    public static TemplateEngineProvider getObject(int id) {
        TemplateEngineProvider obj = (TemplateEngineProvider) new Object();
        obj.id = id;
        return obj;
    }
}

