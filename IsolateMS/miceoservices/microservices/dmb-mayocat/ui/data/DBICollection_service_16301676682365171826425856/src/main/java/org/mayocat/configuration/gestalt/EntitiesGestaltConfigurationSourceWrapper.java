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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 88f81d07b16a4c35f49311197a5faffb127aad57 $
 */
@Component("entities")
@InstantiationStrategy(ComponentInstantiationStrategy.getPER_LOOKUP())
public class EntitiesGestaltConfigurationSourceWrapper {

    private interface EntitiesMapTransformation {
    }

    private static int maxId = 0;

    public static HashMap<Integer, EntitiesGestaltConfigurationSourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "entitiesgestaltconfigurationsource")
    public  @ResponseBody int EntitiesGestaltConfigurationSource() {
        EntitiesGestaltConfigurationSourceServer newServerObj = new EntitiesGestaltConfigurationSourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

