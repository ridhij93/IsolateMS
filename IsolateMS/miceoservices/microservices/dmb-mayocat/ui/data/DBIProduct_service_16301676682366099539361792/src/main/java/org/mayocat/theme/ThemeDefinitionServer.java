/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.util.Collections;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import org.hibernate.validator.constraints.NotBlank;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.configuration.images.ImageFormatDefinition;

/**
 * @version $Id: 0cb9712b6d6f41aac2c870bbf63665a7a4cdf905 $
 */
public class ThemeDefinitionServer {

    @NotBlank
    @JsonProperty
    private String name = "";

    @JsonProperty
    private String description = "";

    @JsonProperty
    private Map<String, ImageFormatDefinition> images = Maps.newHashMap();

    @JsonProperty
    private Map<String, Model> models = Maps.newLinkedHashMap();

    @JsonProperty
    private Map<String, AddonGroupDefinition> addons = Collections.emptyMap();

    @JsonProperty
    private Map<String, PaginationDefinition> pagination = Collections.emptyMap();

    @JsonProperty
    private Map<String, TypeDefinition> productTypes = Maps.newHashMap();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, ImageFormatDefinition> getImageFormats() {
        return images;
    }

    public Map<String, Model> getModels() {
        return models;
    }

    public Map<String, AddonGroupDefinition> getAddons() {
        return this.addons;
    }

    @JsonIgnore
    public Map<String, PaginationDefinition> getPaginationDefinitions() {
        return pagination;
    }

    public PaginationDefinition getPaginationDefinition(String key) {
        return pagination.containsKey(key) ? pagination.get(key) : new PaginationDefinition();
    }

    public Map<String, TypeDefinition> getProductTypes() {
        return productTypes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImages(Map<String, ImageFormatDefinition> images) {
        this.images = images;
    }

    public Map<String, ImageFormatDefinition> getImages() {
        return images;
    }

    public void setModels(Map<String, Model> models) {
        this.models = models;
    }

    public void setAddons(Map<String, AddonGroupDefinition> addons) {
        this.addons = addons;
    }

    public void setPagination(Map<String, PaginationDefinition> pagination) {
        this.pagination = pagination;
    }

    public Map<String, PaginationDefinition> getPagination() {
        return pagination;
    }

    public void setProductTypes(Map<String, TypeDefinition> productTypes) {
        this.productTypes = productTypes;
    }
}

