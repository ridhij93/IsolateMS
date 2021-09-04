/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons.model;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 5e754228d980921e800f42469e8f0fe0b6e3a32c $
 */
public class AddonFieldDefinition {

    public String getType() {
        return (String) null;
    }

    public String getName() {
        return (String) null;
    }

    public String getPlaceholder() {
        return (String) null;
    }

    public String getTemplate() {
        return (String) null;
    }

    public String getEditor() {
        return (String) null;
    }

    public Map<String, Object> getProperties() {
        return (Map<String, Object>) null;
    }

    public void setName(String name) {
        return;
    }

    public void setPlaceholder(String placeholder) {
        return;
    }

    public void setTemplate(String template) {
        return;
    }

    public void setType(String type) {
        return;
    }

    public void setEditor(String editor) {
        return;
    }

    public void setProperties(Map<String, Object> properties) {
        return;
    }

    public int id = 0;

    public static AddonFieldDefinition getObject(int id) {
        AddonFieldDefinition obj = (AddonFieldDefinition) new Object();
        obj.id = id;
        return obj;
    }
}

