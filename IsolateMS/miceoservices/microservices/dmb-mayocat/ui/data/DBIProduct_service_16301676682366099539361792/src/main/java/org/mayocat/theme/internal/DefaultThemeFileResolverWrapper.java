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
import java.util.Map;
import javax.inject.Inject;
import org.mayocat.context.WebContext;
import org.mayocat.theme.Breakpoint;
import org.mayocat.theme.Model;
import org.mayocat.theme.TemplateNotFoundException;
import org.mayocat.theme.Theme;
import org.mayocat.theme.ThemeDefinition;
import org.mayocat.theme.ThemeFileResolver;
import org.mayocat.theme.ThemeManager;
import org.mayocat.theme.ThemeResource;
import org.mayocat.views.Template;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
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
 * @version $Id: 01976c9b2badc61085c64bcb71759da6d37a6027 $
 */
@Component
public class DefaultThemeFileResolverWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultThemeFileResolverServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultthemefileresolver")
    public  @ResponseBody int DefaultThemeFileResolver() {
        DefaultThemeFileResolverServer newServerObj = new DefaultThemeFileResolverServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

