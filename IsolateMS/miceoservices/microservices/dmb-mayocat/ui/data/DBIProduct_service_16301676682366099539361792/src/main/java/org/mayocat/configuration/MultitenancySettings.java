/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import javax.validation.Valid;
import org.mayocat.accounts.model.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MultitenancySettings {

    public boolean isActivated() {
        return (Boolean) null;
    }

    public String getDefaultTenantSlug() {
        return (String) null;
    }

    public String getResolver() {
        return (String) null;
    }

    public Role getRequiredRoleForTenantCreation() {
        return (Role) null;
    }

    public void setActivated(boolean activated) {
        return;
    }

    public boolean getActivated() {
        return (Boolean) null;
    }

    public void setDefaultTenant(String defaultTenant) {
        return;
    }

    public String getDefaultTenant() {
        return (String) null;
    }

    public void setResolver(String resolver) {
        return;
    }

    public void setRequiredRoleForTenantCreation(Role requiredRoleForTenantCreation) {
        return;
    }

    public int id = 0;

    public static MultitenancySettings getObject(int id) {
        MultitenancySettings obj = (MultitenancySettings) new Object();
        obj.id = id;
        return obj;
    }
}

