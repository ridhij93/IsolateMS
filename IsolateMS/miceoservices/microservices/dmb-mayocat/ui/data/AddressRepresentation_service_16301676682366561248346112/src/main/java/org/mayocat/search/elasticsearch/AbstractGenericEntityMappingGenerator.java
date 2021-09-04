/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search.elasticsearch;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.addons.model.AddonFieldDefinition;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.configuration.PlatformSettings;
import org.mayocat.model.Slug;
import org.slf4j.Logger;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Resources;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f6bb193b1fb3f1bb696c797db91c4f6dbd30949f $
 */
public abstract class AbstractGenericEntityMappingGenerator implements EntityMappingGenerator {

    @Override
    public Map<String, Object> generateMapping() {
        return (Map<String, Object>) null;
    }

    /**
     * Generates and insert the mapping for platform addon fields for this entity in the entity mapping.
     *
     * @param inEntityMapping the entity mapping to insert the addons mapping in.
     */
    protected void insertAddonsMapping(Map<String, Object> inEntityMapping) {
        return;
    }

    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Generates the mapping for addons for the entity covered by the concrete class implementing this abstract class,
     * based on addons definition for the platform. Addon definition can specify elastic search field mapping using the
     * {@link ESAddonProperties#MAPPING} key.
     *
     * @return the generated addon mapping map
     */
    private Map<String, Object> generateAddonsMapping() {
        return (Map<String, Object>) null;
    }

    /**
     * @param mapping the mapping map to check the presence of addon mapping for
     * @return true if the passed mapping contains an addons mapping, false otherwise
     */
    private boolean hasAddonsMapping(Map<String, Object> mapping) {
        return (Boolean) null;
    }

    /**
     * @param mapping the mapping map to get the addons mapping for
     * @return the addons mapping for this entity, if present, null otherwise
     */
    private Map<String, Object> getAddonsMapping(Map<String, Object> mapping) {
        return (Map<String, Object>) null;
    }

    /**
     * @param entityClass the class to get the mapping file name for.
     * @return the full path of the file that would define the mapping for this entity
     */
    private String getMappingFileName(Class entityClass) {
        return (String) null;
    }

    /**
     * @param entityClass the class to get the mapping file name for.
     * @return the full path of the file that would define the mapping <strong>of properties only<strong>of this entity
     */
    private String getPropertiesMappingFileName(Class entityClass) {
        return (String) null;
    }

    /**
     * @param entityClass the class to get the entity name for
     * @return the name of the entity the passed class represents
     */
    private String getEntityName(Class entityClass) {
        return (String) null;
    }

    public static String getMAYOAPP_PATH() {
        return (String) null;
    }

    public static String getES_PATH() {
        return (String) null;
    }

    public static String getENTITIES_PATH() {
        return (String) null;
    }

    public void setPlatformSettings(PlatformSettings platformSettings) {
        return;
    }

    public PlatformSettings getPlatformSettings() {
        return (PlatformSettings) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static AbstractGenericEntityMappingGenerator getObject(int id) {
        AbstractGenericEntityMappingGenerator obj = (AbstractGenericEntityMappingGenerator) new Object();
        obj.id = id;
        return obj;
    }
}

