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
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Child;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.Index;
import org.mayocat.model.annotation.LocalizedField;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Collection implements Entity, HasFeaturedImage, Localized, Child, HasAddons {

    public Collection() {
        String uri = MicroserviceApplication.projectUri + "/ms2/collection/collectioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Collection(UUID id) {
        String uri = MicroserviceApplication.projectUri + "/ms2/collection/collection?callerId=" + this.id + "&idId=id.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getId() {
        String uri = MicroserviceApplication.projectUri + "/ms2/collection/getidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    @Override
    public UUID getParentId() {
        String uri = MicroserviceApplication.projectUri + "/ms2/collection/getparentidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    @Override
    public void setParentId(UUID parentId) {
        return;
    }

    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms2/collection/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSlug(String slug) {
        return;
    }

    public void setId(UUID id) {
        return;
    }

    public String getTitle() {
        String uri = MicroserviceApplication.projectUri + "/ms2/collection/gettitlecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setTitle(String title) {
        return;
    }

    public String getDescription() {
        String uri = MicroserviceApplication.projectUri + "/ms2/collection/getdescriptioncallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setDescription(String description) {
        return;
    }

    @Override
    public UUID getFeaturedImageId() {
        return (UUID) null;
    }

    public void setFeaturedImageId(UUID featuredImageId) {
        return;
    }

    public void setLocalizedVersions(Map<Locale, Map<String, Object>> versions) {
        return;
    }

    @Override
    public Map<Locale, Map<String, Object>> getLocalizedVersions() {
        return (Map<Locale, Map<String, Object>>) null;
    }

    @Override
    public Association<Map<String, AddonGroup>> getAddons() {
        return (Association<Map<String, AddonGroup>>) null;
    }

    @Override
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

    public static Collection getObject(int id) {
        Collection obj = (Collection) new Object();
        obj.id = id;
        return obj;
    }
}

