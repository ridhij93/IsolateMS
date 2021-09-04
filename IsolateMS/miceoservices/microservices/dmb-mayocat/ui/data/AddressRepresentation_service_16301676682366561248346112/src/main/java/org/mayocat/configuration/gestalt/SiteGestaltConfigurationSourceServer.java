/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.gestalt;

import java.util.Map;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.configuration.MultitenancySettings;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.context.WebContext;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

/**
 * @version $Id: 2b9d4f9a64dd84ce162b34d346bce54d7cfccc18 $
 */
@Component("site")
public class SiteGestaltConfigurationSourceServer implements GestaltConfigurationSource {

    @Inject
    private MultitenancySettings multitenancySettings;

    @Inject
    private SiteSettings siteSettings;

    @Inject
    private WebContext context;

    @Override
    public Object get() {
        Tenant tenant = context.getTenant();
        Map<String, Object> result = Maps.newHashMap();
        String domain = null;
        if (multitenancySettings.isActivated()) {
            if (tenant != null) {
                domain = !Strings.isNullOrEmpty(tenant.getDefaultHost()) ? tenant.getDefaultHost() : tenant.getSlug() + "." + siteSettings.getDomainName();
            }
        }
        if (domain == null) {
            domain = siteSettings.getDomainName();
        }
        result.put("domain", domain);
        result.put("url", "http://" + domain);
        return result;
    }

    public void setMultitenancySettings(MultitenancySettings multitenancySettings) {
        this.multitenancySettings = multitenancySettings;
    }

    public MultitenancySettings getMultitenancySettings() {
        return multitenancySettings;
    }

    public void setSiteSettings(SiteSettings siteSettings) {
        this.siteSettings = siteSettings;
    }

    public SiteSettings getSiteSettings() {
        return siteSettings;
    }

    public void setContext(WebContext context) {
        this.context = context;
    }

    public WebContext getContext() {
        return context;
    }
}

