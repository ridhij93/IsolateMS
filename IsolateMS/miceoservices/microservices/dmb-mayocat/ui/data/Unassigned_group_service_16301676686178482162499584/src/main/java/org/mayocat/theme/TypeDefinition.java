/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme;

import java.util.Map;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Represents the definition of a product type.
 *
 * @version $Id: be576a5cc02f7b1475bd8e1c2faebeca2d049b25 $
 */
public class TypeDefinition {

    public String getName() {
        return (String) null;
    }

    public Map<String, FeatureDefinition> getFeatures() {
        return (Map<String, FeatureDefinition>) null;
    }

    public VariantsDefinition getVariants() {
        return (VariantsDefinition) null;
    }

    public void setName(String name) {
        return;
    }

    public void setFeatures(Map<String, FeatureDefinition> features) {
        return;
    }

    public void setVariants(VariantsDefinition variants) {
        return;
    }

    public int id = 0;

    public static TypeDefinition getObject(int id) {
        TypeDefinition obj = (TypeDefinition) new Object();
        obj.id = id;
        return obj;
    }
}

