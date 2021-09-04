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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 2b9d4f9a64dd84ce162b34d346bce54d7cfccc18 $
 */
@Component("site")
public class SiteGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    public void setMultitenancySettings(MultitenancySettings multitenancySettings) {
        return;
    }

    public MultitenancySettings getMultitenancySettings() {
        return (MultitenancySettings) null;
    }

    public void setSiteSettings(SiteSettings siteSettings) {
        return;
    }

    public SiteSettings getSiteSettings() {
        return (SiteSettings) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static SiteGestaltConfigurationSource getObject(int id) {
        SiteGestaltConfigurationSource obj = (SiteGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

