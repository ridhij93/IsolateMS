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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 8ba71789c1b71ac84cf3a5767017298b852ba6a5 $
 */
public class SiteSettings {

    public String getDomainName() {
        return (String) null;
    }

    public String getDefaultScheme() {
        return (String) null;
    }

    public String getName() {
        return (String) null;
    }

    public String getContactEmail() {
        return (String) null;
    }

    public String getAdministratorEmail() {
        return (String) null;
    }

    public Optional<String> getWebDomainName() {
        return (Optional<String>) null;
    }

    public Optional<String> getBackOfficeDomainName() {
        return (Optional<String>) null;
    }

    public void setDomainName(String domainName) {
        return;
    }

    public void setDefaultScheme(String defaultScheme) {
        return;
    }

    public void setName(String name) {
        return;
    }

    public void setWeb(Optional<String> web) {
        return;
    }

    public Optional<String> getWeb() {
        return (Optional<String>) null;
    }

    public void setBackOffice(Optional<String> backOffice) {
        return;
    }

    public Optional<String> getBackOffice() {
        return (Optional<String>) null;
    }

    public void setContactEmail(String contactEmail) {
        return;
    }

    public void setAdministratorEmail(String administratorEmail) {
        return;
    }

    public int id = 0;

    public static SiteSettings getObject(int id) {
        SiteSettings obj = (SiteSettings) new Object();
        obj.id = id;
        return obj;
    }
}

