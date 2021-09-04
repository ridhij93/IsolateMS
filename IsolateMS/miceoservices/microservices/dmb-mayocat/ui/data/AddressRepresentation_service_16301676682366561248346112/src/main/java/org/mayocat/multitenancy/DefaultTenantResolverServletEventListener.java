/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.multitenancy;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import org.mayocat.event.EventListener;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component
@Named("defaultResolverEventListener")
public class DefaultTenantResolverServletEventListener implements ServletRequestListener, EventListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        return;
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        return;
    }

    public void setDefaultTenantResolver(TenantResolver defaultTenantResolver) {
        return;
    }

    public TenantResolver getDefaultTenantResolver() {
        return (TenantResolver) null;
    }

    public int id = 0;

    public static DefaultTenantResolverServletEventListener getObject(int id) {
        DefaultTenantResolverServletEventListener obj = (DefaultTenantResolverServletEventListener) new Object();
        obj.id = id;
        return obj;
    }
}

