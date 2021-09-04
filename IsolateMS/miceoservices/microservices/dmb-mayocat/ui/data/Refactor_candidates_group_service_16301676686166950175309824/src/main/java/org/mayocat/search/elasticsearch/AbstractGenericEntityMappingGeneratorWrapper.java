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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: f6bb193b1fb3f1bb696c797db91c4f6dbd30949f $
 */
@Controller
@RequestMapping("/ms3/abstractgenericentitymappinggenerator/")
public abstract class AbstractGenericEntityMappingGeneratorWrapper {

    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, AbstractGenericEntityMappingGeneratorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractgenericentitymappinggenerator")
    public  @ResponseBody int AbstractGenericEntityMappingGenerator() {
        AbstractGenericEntityMappingGeneratorServer newServerObj = new AbstractGenericEntityMappingGeneratorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

