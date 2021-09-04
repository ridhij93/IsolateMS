/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.addons.web;

import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.addons.AddonFieldTransformer;
import org.mayocat.addons.model.AddonFieldDefinition;
import org.mayocat.addons.model.AddonGroupDefinition;
import org.mayocat.addons.web.AddonFieldValueWebObject;
import org.mayocat.addons.web.AddonsWebObjectBuilder;
import org.mayocat.configuration.PlatformSettings;
import org.mayocat.context.WebContext;
import org.mayocat.entity.EntityData;
import org.mayocat.localization.EntityLocalizationService;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.HasAddons;
import org.mayocat.model.Localized;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Optional;
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
 * @version $Id: 039c2210baa195d2359fa424563a95b283bef3a7 $
 */
@Component
public class DefaultAddonsWebObjectBuilderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultAddonsWebObjectBuilderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultaddonswebobjectbuilder")
    public  @ResponseBody int DefaultAddonsWebObjectBuilder() {
        DefaultAddonsWebObjectBuilderServer newServerObj = new DefaultAddonsWebObjectBuilderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

