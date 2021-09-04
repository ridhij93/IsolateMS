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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Pagination element of a {@link ThemeDefinition}.
 *
 * @version $Id: ede985618c648851f4a3dcea0d83c04d67fc3681 $
 */
public class PaginationDefinition {

    /**
     * Default value for when the pagination is not defined. We chose 24 as the default value because it can be divided
     * in 2, 3, 4 and 6
     */
    public Integer getItemsPerPage() {
        return (Integer) null;
    }

    /**
     * The pagination definition for alternative models for the template this pagination definition applies to.
     */
    public Map<String, PaginationDefinition> getModels() {
        return (Map<String, PaginationDefinition>) null;
    }

    /**
     * A map of optional others pagination for this entity/page
     */
    public Map<String, Integer> getOthers() {
        return (Map<String, Integer>) null;
    }

    /**
     */
    public Optional<Integer> getOtherDefinition(String key) {
        return (Optional<Integer>) null;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        return;
    }

    public void setModels(Map<String, PaginationDefinition> models) {
        return;
    }

    public void setOthers(Map<String, Integer> others) {
        return;
    }

    public int id = 0;

    public static PaginationDefinition getObject(int id) {
        PaginationDefinition obj = (PaginationDefinition) new Object();
        obj.id = id;
        return obj;
    }
}

