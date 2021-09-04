/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views.provider;

import javax.inject.Inject;
import javax.inject.Provider;
import org.mayocat.views.TemplateEngine;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
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
 * @version $Id: 59ed44ed4bac7f1c90ddff1d6a8226b9bdec2d8d $
 */
@Controller
@RequestMapping("/ms2/templateengineprovider/")
public class TemplateEngineProviderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TemplateEngineProviderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "templateengineprovider")
    public  @ResponseBody int TemplateEngineProvider() {
        TemplateEngineProviderServer newServerObj = new TemplateEngineProviderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

