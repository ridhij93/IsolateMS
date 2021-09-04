/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.home.model;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.DoNotIndex;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9239b0c2cf1d39475a81432b2f53d3b4f0c1a507 $
 */
public class HomePage implements Entity, HasAddons, Localized {

    public UUID getId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/homepage/getidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setId(UUID id) {
        return;
    }

    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms1/homepage/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSlug(String slug) {
        return;
    }

    public Map<Locale, Map<String, Object>> getLocalizedVersions() {
        return (Map<Locale, Map<String, Object>>) null;
    }

    public void setLocalizedVersions(Map<Locale, Map<String, Object>> versions) {
        return;
    }

    public Association<Map<String, AddonGroup>> getAddons() {
        String uri = MicroserviceApplication.projectUri + "/ms1/homepage/getaddonscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Association<Map<String, AddonGroup>> result = (Association<Map<String, AddonGroup>>) new Object();
        return result;
    }

    public void setAddons(Map<String, AddonGroup> addons) {
        return;
    }

    // //////////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public int id = 0;

    public static HomePage getObject(int id) {
        HomePage obj = (HomePage) new Object();
        obj.id = id;
        return obj;
    }
}

