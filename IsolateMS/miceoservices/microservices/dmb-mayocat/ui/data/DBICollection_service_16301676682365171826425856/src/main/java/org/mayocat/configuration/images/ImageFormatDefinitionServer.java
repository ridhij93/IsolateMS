/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.images;

import java.util.List;
import org.mayocat.jackson.OptionalStringListDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;

/**
 * @version $Id: 1d68e64a350765e05eed11ed4f3e449ecf072d99 $
 */
public class ImageFormatDefinitionServer {

    @JsonProperty
    private String name;

    @JsonProperty
    private Integer width;

    @JsonProperty
    private Integer height;

    @JsonInclude(JsonInclude.getInclude().NON_NULL)
    private String description;

    @JsonDeserialize(using = OptionalStringListDeserializer.class)
    @JsonProperty("for")
    private Optional<List<String>> entities = Optional.absent();

    public String getName() {
        return name;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getDescription() {
        return description;
    }

    public Optional<List<String>> getEntities() {
        return entities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEntities(Optional<List<String>> entities) {
        this.entities = entities;
    }
}

