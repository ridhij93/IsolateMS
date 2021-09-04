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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1d68e64a350765e05eed11ed4f3e449ecf072d99 $
 */
public class ImageFormatDefinition {

    public String getName() {
        return (String) null;
    }

    public Integer getWidth() {
        return (Integer) null;
    }

    public Integer getHeight() {
        return (Integer) null;
    }

    public String getDescription() {
        return (String) null;
    }

    public Optional<List<String>> getEntities() {
        return (Optional<List<String>>) null;
    }

    public void setName(String name) {
        return;
    }

    public void setWidth(Integer width) {
        return;
    }

    public void setHeight(Integer height) {
        return;
    }

    public void setDescription(String description) {
        return;
    }

    public void setEntities(Optional<List<String>> entities) {
        return;
    }

    public int id = 0;

    public static ImageFormatDefinition getObject(int id) {
        ImageFormatDefinition obj = (ImageFormatDefinition) new Object();
        obj.id = id;
        return obj;
    }
}

