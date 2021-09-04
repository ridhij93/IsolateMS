/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f75674e3ac650e10de38588a7381b89ae62f7b3f $
 */
public class AddonGroup implements Serializable {

    public UUID getEntityId() {
        return (UUID) null;
    }

    public void setEntityId(UUID entityId) {
        return;
    }

    public AddonSource getSource() {
        return (AddonSource) null;
    }

    public void setSource(AddonSource source) {
        return;
    }

    public String getGroup() {
        return (String) null;
    }

    public void setGroup(String group) {
        return;
    }

    public Map<String, Map<String, Object>> getModel() {
        return (Map<String, Map<String, Object>>) null;
    }

    public void setModel(Map<String, Map<String, Object>> model) {
        return;
    }

    public Object getValue() {
        return (Object) null;
    }

    public void setValue(Object value) {
        return;
    }

    public int id = 0;

    public static AddonGroup getObject(int id) {
        AddonGroup obj = (AddonGroup) new Object();
        obj.id = id;
        return obj;
    }
}

