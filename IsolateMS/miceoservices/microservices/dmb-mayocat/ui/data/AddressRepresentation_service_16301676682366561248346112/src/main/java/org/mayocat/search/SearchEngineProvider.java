/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search;

import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.configuration.SearchEngineSettings;
import org.slf4j.Logger;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SearchEngineProvider implements Provider<SearchEngine> {

    @Override
    public SearchEngine get() {
        return (SearchEngine) null;
    }

    public void setConfiguration(SearchEngineSettings configuration) {
        return;
    }

    public SearchEngineSettings getConfiguration() {
        return (SearchEngineSettings) null;
    }

    public void setComponentManager(ComponentManager componentManager) {
        return;
    }

    public ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static SearchEngineProvider getObject(int id) {
        SearchEngineProvider obj = (SearchEngineProvider) new Object();
        obj.id = id;
        return obj;
    }
}

