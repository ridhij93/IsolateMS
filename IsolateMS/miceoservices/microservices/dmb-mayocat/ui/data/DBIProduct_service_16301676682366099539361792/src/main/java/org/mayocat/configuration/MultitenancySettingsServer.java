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

public class MultitenancySettingsServer {

    @Valid
    @JsonProperty
    private boolean activated = false;

    @Valid
    @JsonProperty
    private String defaultTenant = "default";

    @Valid
    @JsonProperty
    private String resolver = "default";

    @Valid
    @JsonProperty
    private Role requiredRoleForTenantCreation = Role.getNONE();

    public boolean isActivated() {
        return activated;
    }

    public String getDefaultTenantSlug() {
        return defaultTenant;
    }

    public String getResolver() {
        return resolver;
    }

    public Role getRequiredRoleForTenantCreation() {
        return requiredRoleForTenantCreation;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setDefaultTenant(String defaultTenant) {
        this.defaultTenant = defaultTenant;
    }

    public String getDefaultTenant() {
        return defaultTenant;
    }

    public void setResolver(String resolver) {
        this.resolver = resolver;
    }

    public void setRequiredRoleForTenantCreation(Role requiredRoleForTenantCreation) {
        this.requiredRoleForTenantCreation = requiredRoleForTenantCreation;
    }
}

