/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages.model;

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
import org.mayocat.model.HasModel;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.Index;
import org.mayocat.model.annotation.LocalizedField;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1de4b0fbb8ae5066690048c187b4ab3c1dd7ad65 $
 */
public class Page implements Entity, Localized, Child, HasAddons, HasModel, HasFeaturedImage {

    public Page() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/pagecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Page(UUID id) {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/page?callerId=" + this.id + "&idId=id.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/getidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setId(UUID id) {
        return;
    }

    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSlug(String slug) {
        return;
    }

    public Boolean getPublished() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/getpublishedcallerId=" + this.id + "";
        Boolean resultTemp = new RestTemplate().getForObject(uri, Boolean.class);
        Boolean result = resultTemp;
        return result;
    }

    public void setPublished(Boolean published) {
        return;
    }

    public String getTitle() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/gettitlecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setTitle(String title) {
        return;
    }

    public String getContent() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/getcontentcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setContent(String content) {
        return;
    }

    // //////////////////////////////////////////////
    @Override
    public UUID getParentId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/getparentidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    @Override
    public void setParentId(UUID id) {
        return;
    }

    @Override
    public Association<Map<String, AddonGroup>> getAddons() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/getaddonscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Association<Map<String, AddonGroup>> result = (Association<Map<String, AddonGroup>>) new Object();
        return result;
    }

    @Override
    public void setAddons(Map<String, AddonGroup> addons) {
        return;
    }

    public void setModel(String model) {
        return;
    }

    @Override
    public Optional<String> getModel() {
        return (Optional<String>) null;
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

    // //////////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/equals?callerId=" + this.id + "&objId=obj.id";
        boolean resultTemp = new RestTemplate().getForObject(uri, boolean.class);
        boolean result = resultTemp;
        return result;
    }

    @Override
    public int hashCode() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/hashcodecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    @Override
    public String toString() {
        String uri = MicroserviceApplication.projectUri + "/ms1/page/tostringcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public int id = 0;

    public static Page getObject(int id) {
        Page obj = (Page) new Object();
        obj.id = id;
        return obj;
    }
}

