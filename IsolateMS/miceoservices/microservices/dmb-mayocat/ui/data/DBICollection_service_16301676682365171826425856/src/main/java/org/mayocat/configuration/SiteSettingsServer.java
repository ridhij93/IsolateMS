/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

/**
 * @version $Id: 8ba71789c1b71ac84cf3a5767017298b852ba6a5 $
 */
public class SiteSettingsServer {

    /**
     * The domain this web site runs under. Here the term "domain" is a language abuse since it does not correspond
     * exactly to what an internet domain name is (for example here the default value contains a port specification).
     *
     * This is used for all absolute URL creation.
     */
    @Valid
    @JsonProperty
    private String domainName = "localhost:8080";

    @Valid
    @JsonProperty
    private String defaultScheme = "http://";

    @Valid
    @JsonProperty
    private String name = "Mayocat";

    @Valid
    @JsonProperty
    private Optional<String> web = Optional.absent();

    @Valid
    @JsonProperty
    private Optional<String> backOffice = Optional.absent();

    @Valid
    @JsonProperty
    private String contactEmail = "contact@example.com";

    @Valid
    @JsonProperty
    private String administratorEmail = "admin@example.com";

    public String getDomainName() {
        return domainName;
    }

    public String getDefaultScheme() {
        return defaultScheme;
    }

    public String getName() {
        return name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getAdministratorEmail() {
        return administratorEmail;
    }

    public Optional<String> getWebDomainName() {
        return web;
    }

    public Optional<String> getBackOfficeDomainName() {
        return backOffice;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setDefaultScheme(String defaultScheme) {
        this.defaultScheme = defaultScheme;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeb(Optional<String> web) {
        this.web = web;
    }

    public Optional<String> getWeb() {
        return web;
    }

    public void setBackOffice(Optional<String> backOffice) {
        this.backOffice = backOffice;
    }

    public Optional<String> getBackOffice() {
        return backOffice;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setAdministratorEmail(String administratorEmail) {
        this.administratorEmail = administratorEmail;
    }
}

