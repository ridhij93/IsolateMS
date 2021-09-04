/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.multitenancy;

import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import org.apache.commons.lang3.StringUtils;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.accounts.AccountsService;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.store.EntityAlreadyExistsException;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Strings;
import com.google.common.net.InternetDomainName;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Component
@Singleton
public class DefaultTenantResolver implements TenantResolver, ServletRequestListener {

    public void requestDestroyed() {
        return;
    }

    @Override
    public Tenant resolve(String host) {
        return (Tenant) null;
    }

    @Override
    public Tenant resolve(String host, String path) {
        return (Tenant) null;
    }

    private String extractSlugFromHost(String host) {
        return (String) null;
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        return;
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        return;
    }

    public void setResolved(ThreadLocal<Map<String, Tenant>> resolved) {
        return;
    }

    public ThreadLocal<Map<String, Tenant>> getResolved() {
        return (ThreadLocal<Map<String, Tenant>>) null;
    }

    public void setAccountsService(AccountsService accountsService) {
        return;
    }

    public AccountsService getAccountsService() {
        return (AccountsService) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setConfiguration(MultitenancySettings configuration) {
        return;
    }

    public MultitenancySettings getConfiguration() {
        return (MultitenancySettings) null;
    }

    public void setSiteSettings(SiteSettings siteSettings) {
        return;
    }

    public SiteSettings getSiteSettings() {
        return (SiteSettings) null;
    }

    public int id = 0;

    public static DefaultTenantResolver getObject(int id) {
        DefaultTenantResolver obj = (DefaultTenantResolver) new Object();
        obj.id = id;
        return obj;
    }
}

