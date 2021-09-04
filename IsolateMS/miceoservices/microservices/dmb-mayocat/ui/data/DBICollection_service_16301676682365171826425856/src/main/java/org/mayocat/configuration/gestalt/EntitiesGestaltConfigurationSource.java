/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.gestalt;

import java.util.Map;
import javax.inject.Inject;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.configuration.PlatformSettings;
import org.mayocat.configuration.images.ImageFormatDefinition;
import org.mayocat.context.WebContext;
import org.mayocat.meta.EntityMeta;
import org.mayocat.meta.EntityMetaRegistry;
import org.mayocat.model.AddonSource;
import org.mayocat.theme.Model;
import org.mayocat.theme.Theme;
import org.mayocat.theme.TypeDefinition;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.annotation.InstantiationStrategy;
import org.xwiki.component.descriptor.ComponentInstantiationStrategy;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 88f81d07b16a4c35f49311197a5faffb127aad57 $
 */
@Component("entities")
@InstantiationStrategy(ComponentInstantiationStrategy.getPER_LOOKUP())
public class EntitiesGestaltConfigurationSource implements GestaltConfigurationSource {

    @Override
    public Object get() {
        return (Object) null;
    }

    private void addTypes(Map<String, Map<String, Object>> entities, Map<String, TypeDefinition> productTypes) {
        return;
    }

    private void addImageFormats(Map<String, Map<String, Object>> entities, Map<String, ImageFormatDefinition> formats, AddonSource source) {
        return;
    }

    private void addModels(Map<String, Map<String, Object>> entities, Map<String, Model> models) {
        return;
    }

    private void addAddons(Map<String, Map<String, Object>> entities, Map<String, AddonGroupDefinition> addons, AddonSource source) {
        return;
    }

    private interface EntitiesMapTransformation {

        void apply(Map<String, Object> entity, Object... arguments) {
            return;
        }
    }

    private void addImageFormatDefinitionToEntity(Map<String, Map<String, Object>> entities, String entity, final String source, String modelId, ImageFormatDefinition imageFormatDefinition) {
        return;
    }

    private void addModelsToEntity(Map<String, Map<String, Object>> entities, String entity, String modelId, Model model) {
        return;
    }

    private void addAddonGroupToEntity(Map<String, Map<String, Object>> entities, String entity, String groupKey, AddonGroupDefinition group, AddonSource source) {
        return;
    }

    private void transformEntitiesMap(Map<String, Map<String, Object>> entities, String entity, EntitiesMapTransformation transfornation, Object... argument) {
        return;
    }

    public void setPlatformSettings(PlatformSettings platformSettings) {
        return;
    }

    public PlatformSettings getPlatformSettings() {
        return (PlatformSettings) null;
    }

    public void setEntityMetaRegistry(EntityMetaRegistry entityMetaRegistry) {
        return;
    }

    public EntityMetaRegistry getEntityMetaRegistry() {
        return (EntityMetaRegistry) null;
    }

    public void setContributors(Map<String, EntityConfigurationContributor> contributors) {
        return;
    }

    public Map<String, EntityConfigurationContributor> getContributors() {
        return (Map<String, EntityConfigurationContributor>) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static EntitiesGestaltConfigurationSource getObject(int id) {
        EntitiesGestaltConfigurationSource obj = (EntitiesGestaltConfigurationSource) new Object();
        obj.id = id;
        return obj;
    }
}

