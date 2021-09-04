/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.multitenancy;

import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.configuration.MultitenancySettings;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.sun.jersey.spi.resource.Singleton;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Singleton
@Component
public class TenantResolverProvider implements Provider<TenantResolver> {

    @Override
    public TenantResolver get() {
        return (TenantResolver) null;
    }

    public void setConfiguration(MultitenancySettings configuration) {
        return;
    }

    public MultitenancySettings getConfiguration() {
        return (MultitenancySettings) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setComponentManager(ComponentManager componentManager) {
        return;
    }

    public ComponentManager getComponentManager() {
        return (ComponentManager) null;
    }

    public int id = 0;

    public static TenantResolverProvider getObject(int id) {
        TenantResolverProvider obj = (TenantResolverProvider) new Object();
        obj.id = id;
        return obj;
    }
}

