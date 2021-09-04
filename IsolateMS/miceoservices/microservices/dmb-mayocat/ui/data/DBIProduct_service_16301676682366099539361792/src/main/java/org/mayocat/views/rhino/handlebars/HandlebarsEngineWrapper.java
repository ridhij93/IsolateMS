/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views.rhino.handlebars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.util.Map;
import org.mayocat.views.Template;
import org.mayocat.views.TemplateEngine;
import org.mayocat.views.TemplateEngineException;
import org.mayocat.views.rhino.AbstractRhinoEngine;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Scriptable;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import javax.inject.Inject;
import javax.inject.Named;
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
 * @version $Id: 9af904be9efe328d8667d6d4ac67bc8052a45ff4 $
 */
@Component
@Named("handlebars")
public class HandlebarsEngineWrapper {

    private enum JSFile {

        HANDLEBARS("handlebars.js", "javascripts/vendor"), SWAG_HELPERS("swag.min.js", "javascripts/vendor"), MAYO_HELPERS("helpers.js", "javascripts/handlebars");

        private String fileName;

        private String path;

        JSFile(String fileName, String path) {
            this.fileName = fileName;
            this.path = path;
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, HandlebarsEngineServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "handlebarsengine")
    public  @ResponseBody int HandlebarsEngine() {
        HandlebarsEngineServer newServerObj = new HandlebarsEngineServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

