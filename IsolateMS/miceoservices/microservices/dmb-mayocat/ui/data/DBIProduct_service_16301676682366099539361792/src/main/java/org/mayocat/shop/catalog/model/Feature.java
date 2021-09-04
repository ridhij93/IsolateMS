/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.model;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Child;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.DoNotIndex;
import org.mayocat.model.annotation.LocalizedField;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Model for a product feature (for example: a size, a color, etc.)
 *
 * @version $Id: 4364e3313c4fc8cfc5e711150ba27c418b8cdf4e $
 */
public class Feature implements Entity, HasAddons, Localized, Child {

    public Feature() {
        String uri = MicroserviceApplication.projectUri + "/ms2/feature/featurecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void setLocalizedVersions(Map<Locale, Map<String, Object>> versions) {
        return;
    }

    @Override
    public Map<Locale, Map<String, Object>> getLocalizedVersions() {
        return (Map<Locale, Map<String, Object>>) null;
    }

    public UUID getId() {
        String uri = MicroserviceApplication.projectUri + "/ms2/feature/getidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setId(UUID id) {
        return;
    }

    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms2/feature/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSlug(String slug) {
        return;
    }

    public String getTitle() {
        String uri = MicroserviceApplication.projectUri + "/ms2/feature/gettitlecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setTitle(String title) {
        return;
    }

    public UUID getParentId() {
        String uri = MicroserviceApplication.projectUri + "/ms2/feature/getparentidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setParentId(UUID id) {
        return;
    }

    public String getFeature() {
        String uri = MicroserviceApplication.projectUri + "/ms2/feature/getfeaturecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setFeature(String feature) {
        return;
    }

    public String getFeatureSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms2/feature/getfeatureslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setFeatureSlug(String featureSlug) {
        return;
    }

    @Override
    public Association<Map<String, AddonGroup>> getAddons() {
        return (Association<Map<String, AddonGroup>>) null;
    }

    @Override
    public void setAddons(Map<String, AddonGroup> addons) {
        return;
    }

    // 
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

    public static Feature getObject(int id) {
        Feature obj = (Feature) new Object();
        obj.id = id;
        return obj;
    }
}

