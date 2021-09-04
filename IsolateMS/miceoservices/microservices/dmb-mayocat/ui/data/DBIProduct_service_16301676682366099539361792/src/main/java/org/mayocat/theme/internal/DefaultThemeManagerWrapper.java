/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme.internal;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.configuration.general.FilesSettings;
import org.mayocat.configuration.theme.ThemeSettings;
import org.mayocat.context.WebContext;
import org.mayocat.theme.Theme;
import org.mayocat.theme.ThemeDefinition;
import org.mayocat.theme.ThemeFileResolver;
import org.mayocat.theme.ThemeManager;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.io.Files;
import com.google.common.io.Resources;
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
 * @version $Id: dfa6ed213d2db544b5357ad8bd1bf52de6e8785d $
 */
@Component
public class DefaultThemeManagerWrapper {

    /**
     * The "levels" at which themes can be defined.
     */
    private enum Level {

        /**
         * The tenant own permanent directory
         */
        TENANT_DIRECTORY,
        /**
         * The global themes directory
         */
        THEME_DIRECTORY,
        /**
         * The JVM classpath
         */
        CLASSPATH
    }

    private static int maxId = 0;

    public static HashMap<Integer, DefaultThemeManagerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultthememanager")
    public  @ResponseBody int DefaultThemeManager() {
        DefaultThemeManagerServer newServerObj = new DefaultThemeManagerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

