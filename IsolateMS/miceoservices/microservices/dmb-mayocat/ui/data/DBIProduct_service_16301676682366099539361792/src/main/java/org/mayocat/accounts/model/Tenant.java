/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.model;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;
import org.mayocat.image.model.Image;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.annotation.Index;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Tenant implements Entity, HasAddons, HasFeaturedImage {

    // FIXME
    // /////////////////////////////////////////////////
    public Tenant() {
        String uri = MicroserviceApplication.projectUri + "/ms0/tenant/tenantcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Tenant(String slug, TenantConfiguration configuration) {
        String uri = MicroserviceApplication.projectUri + "/ms0/tenant/tenant?callerId=" + this.id + "&slug=slug&configurationId=configuration.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Tenant(UUID id, String slug, TenantConfiguration configuration) {
        String uri = MicroserviceApplication.projectUri + "/ms0/tenant/tenant?callerId=" + this.id + "&idId=id.id&slug=slug&configurationId=configuration.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    // /////////////////////////////////////////////////
    public TenantConfiguration getConfiguration() {
        return (TenantConfiguration) null;
    }

    public UUID getId() {
        return (UUID) null;
    }

    public void setId(UUID id) {
        return;
    }

    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms0/tenant/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSlug(String slug) {
        return;
    }

    public void setDefaultHost(String defaultHost) {
        return;
    }

    public String getDefaultHost() {
        return (String) null;
    }

    public String getName() {
        return (String) null;
    }

    public void setName(String name) {
        return;
    }

    public String getDescription() {
        return (String) null;
    }

    public void setDescription(String description) {
        return;
    }

    public String getContactEmail() {
        return (String) null;
    }

    public void setContactEmail(String contactEmail) {
        return;
    }

    public Date getCreationDate() {
        return (Date) null;
    }

    public void setCreationDate(Date creationDate) {
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

    public UUID getFeaturedImageId() {
        return (UUID) null;
    }

    public void setFeaturedImageId(UUID featuredImageId) {
        return;
    }

    public Association<Image> getFeaturedImage() {
        return (Association<Image>) null;
    }

    public void setFeaturedImage(Image featuredImage) {
        return;
    }

    // ///////////////////////////////////////////////////////////
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

    public void setConfiguration(TenantConfiguration configuration) {
        return;
    }

    public int id = 0;

    public static Tenant getObject(int id) {
        Tenant obj = (Tenant) new Object();
        obj.id = id;
        return obj;
    }
}

