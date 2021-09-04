/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mayocat.addons.model.AddonFieldDefinition;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.model.AddonGroup;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 8d23cd36dc343fbbaf14008a59c3d5cbc95e522f $
 */
public class AddonUtils {

    public static Map<String, AddonGroup> asMap(List<AddonGroup> addons) {
        return (Map<String, AddonGroup>) null;
    }

    /**
     * Finds a addon group definition in a list of group definitions. The priority of the group definitions is order in
     * which they are passed : first passed has the highest priority, last passed the lowest.
     *
     * @param name the name of the addon group definition to find
     * @param groupDefinitions the list of group definitions
     * @return the first definition found, or absent if none is found
     */
    public static Optional<AddonGroupDefinition> findAddonGroupDefinition(String name, Map<String, AddonGroupDefinition>... groupDefinitions) {
        return (Optional<AddonGroupDefinition>) null;
    }

    public static boolean isListWithKeyAndDisplayValues(AddonFieldDefinition field) {
        return (Boolean) null;
    }

    public static boolean isListWithKeyAndDisplayValues(Map<String, Object> properties) {
        return (Boolean) null;
    }

    public static List<Map<String, Object>> getListValues(AddonFieldDefinition fieldDefinition) {
        return (List<Map<String, Object>>) null;
    }

    public static Object emptyToNull(Object value) {
        return (Object) null;
    }

    public int id = 0;

    public static AddonUtils getObject(int id) {
        AddonUtils obj = (AddonUtils) new Object();
        obj.id = id;
        return obj;
    }
}

