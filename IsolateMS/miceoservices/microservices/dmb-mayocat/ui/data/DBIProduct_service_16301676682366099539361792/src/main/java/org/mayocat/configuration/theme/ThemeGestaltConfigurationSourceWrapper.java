/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.theme;

import java.util.List;
import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.theme.ThemeDefinition;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.annotation.InstantiationStrategy;
import org.xwiki.component.descriptor.ComponentInstantiationStrategy;
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
 * @version $Id: ab8db0a375971ede7cc6635d6451b48027b14e85 $
 */
@Component("theme")
@InstantiationStrategy(ComponentInstantiationStrategy.getPER_LOOKUP())
public class ThemeGestaltConfigurationSourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ThemeGestaltConfigurationSourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "themegestaltconfigurationsource")
    public  @ResponseBody int ThemeGestaltConfigurationSource() {
        ThemeGestaltConfigurationSourceServer newServerObj = new ThemeGestaltConfigurationSourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

