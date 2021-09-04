/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration;

import java.util.Collections;
import java.util.Map;
import javax.validation.Valid;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.configuration.images.ImageFormatDefinition;
import org.mayocat.theme.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: ca4089543c99dd9ba52d09b60b5684fbc872d395 $
 */
public class PlatformSettings {

    public Map<String, ImageFormatDefinition> getImages() {
        return (Map<String, ImageFormatDefinition>) null;
    }

    public Map<String, AddonGroupDefinition> getAddons() {
        return (Map<String, AddonGroupDefinition>) null;
    }

    public Map<String, Model> getModels() {
        return (Map<String, Model>) null;
    }

    public void setModels(Map<String, Model> models) {
        return;
    }

    public void setImages(Map<String, ImageFormatDefinition> images) {
        return;
    }

    public void setAddons(Map<String, AddonGroupDefinition> addons) {
        return;
    }

    public int id = 0;

    public static PlatformSettings getObject(int id) {
        PlatformSettings obj = (PlatformSettings) new Object();
        obj.id = id;
        return obj;
    }
}

