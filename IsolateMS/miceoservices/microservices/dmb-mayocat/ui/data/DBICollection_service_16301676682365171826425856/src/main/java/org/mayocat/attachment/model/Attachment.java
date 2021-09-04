/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.mayocat.model.Child;
import org.mayocat.model.Entity;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.LocalizedField;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 08724e69a979b7d256d45ee798f62c53f7af1467 $
 */
public class Attachment implements Entity, Child, Localized {

    public Attachment() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/attachmentcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    @Override
    public void setSlug(String slug) {
        return;
    }

    @Override
    public UUID getId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/getidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    @Override
    public void setId(UUID id) {
        return;
    }

    public String getTitle() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/gettitlecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setTitle(String title) {
        return;
    }

    public String getDescription() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/getdescriptioncallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setDescription(String description) {
        return;
    }

    public String getExtension() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/getextensioncallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setExtension(String extension) {
        return;
    }

    public Map<String, Map<String, Object>> getMetadata() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/getmetadatacallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Map<String, Map<String, Object>> result = (Map<String, Map<String, Object>>) new Object();
        return result;
    }

    public void setMetadata(Map<String, Map<String, Object>> metadata) {
        return;
    }

    @Override
    public UUID getParentId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/attachment/getparentidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setParentId(UUID parentId) {
        return;
    }

    @Override
    public Map<Locale, Map<String, Object>> getLocalizedVersions() {
        return (Map<Locale, Map<String, Object>>) null;
    }

    public void setLocalizedVersions(Map<Locale, Map<String, Object>> versions) {
        return;
    }

    // //////////////////////////////////////////////
    public String getFilename() {
        return (String) null;
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

    public static Attachment getObject(int id) {
        Attachment obj = (Attachment) new Object();
        obj.id = id;
        return obj;
    }
}

