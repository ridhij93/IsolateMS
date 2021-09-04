/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.url;

import com.google.common.base.Strings;
import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.context.WebContext;
import org.mayocat.context.internal.ThreadLocalWebContext;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 299ccc9e9285e9f929d9080269fe99aeee83ec59 $
 */
@Component
public class DefaultURLHelper implements URLHelper {

    public String getContextWebBaseURL() {
        return (String) null;
    }

    public String getContextPlatformBaseURL() {
        return (String) null;
    }

    public String getTenantWebBaseURL(Tenant tenant) {
        return (String) null;
    }

    public String getTenantPlatformBaseURL(Tenant tenant) {
        return (String) null;
    }

    public String getContextWebDomain() {
        return (String) null;
    }

    public String getContextPlatformDomain() {
        return (String) null;
    }

    public String getTenantWebDomain(Tenant tenant) {
        return (String) null;
    }

    public String getTenantPlatformDomain(Tenant tenant) {
        return (String) null;
    }

    public URL getContextWebURL(String path) {
        return (URL) null;
    }

    public URL getContextBackOfficeURL(String path) {
        return (URL) null;
    }

    public URL getContextPlatformURL(String path) {
        return (URL) null;
    }

    public URL getTenantWebURL(Tenant tenant, String path) {
        return (URL) null;
    }

    public URL getTenantBackOfficeURL(Tenant tenant, String path) {
        return (URL) null;
    }

    public URL getTenantPlatformURL(Tenant tenant, String path) {
        return (URL) null;
    }

    // Private helpers
    // -----------------------------------------------------------------------------------------------------------------
    private String getTenantDomainName(String domainName, Tenant tenant) {
        return (String) null;
    }

    private URL getURL(String domain, String path) {
        return (URL) null;
    }

    public void setSiteSettings(SiteSettings siteSettings) {
        return;
    }

    public SiteSettings getSiteSettings() {
        return (SiteSettings) null;
    }

    public void setMultitenancySettings(MultitenancySettings multitenancySettings) {
        return;
    }

    public MultitenancySettings getMultitenancySettings() {
        return (MultitenancySettings) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static DefaultURLHelper getObject(int id) {
        DefaultURLHelper obj = (DefaultURLHelper) new Object();
        obj.id = id;
        return obj;
    }
}

