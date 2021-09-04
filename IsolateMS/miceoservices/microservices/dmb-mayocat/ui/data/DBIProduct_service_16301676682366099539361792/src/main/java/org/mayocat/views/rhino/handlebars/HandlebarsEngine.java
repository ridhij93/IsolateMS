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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 9af904be9efe328d8667d6d4ac67bc8052a45ff4 $
 */
@Component
@Named("handlebars")
public class HandlebarsEngine extends AbstractRhinoEngine implements TemplateEngine {

    private enum JSFile {

        HANDLEBARS("handlebars.js", "javascripts/vendor"), SWAG_HELPERS("swag.min.js", "javascripts/vendor"), MAYO_HELPERS("helpers.js", "javascripts/handlebars");

        private String fileName;

        private String path;

        JSFile(String fileName, String path) {
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        private String getFileName() {
            return (String) null;
        }

        private String getFilePath() {
            return (String) null;
        }
    }

    public HandlebarsEngine() throws IOException {
        String uri = MicroserviceApplication.projectUri + "/ms1/handlebarsengine/handlebarsenginecallerId=" + this.id + "";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    protected void initializeEngine() {
        return;
    }

    @Override
    public synchronized void register(Template template) throws TemplateEngineException {
        return;
    }

    @Override
    public synchronized String render(String templateName, String json) throws TemplateEngineException {
        return (String) null;
    }

    private static Reader getResourceReader(String resource) throws IOException {
        return (Reader) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setHelpers(Map<String, HelpersScript> helpers) {
        return;
    }

    public Map<String, HelpersScript> getHelpers() {
        return (Map<String, HelpersScript>) null;
    }

    public int id = 0;

    public static HandlebarsEngine getObject(int id) {
        HandlebarsEngine obj = (HandlebarsEngine) new Object();
        obj.id = id;
        return obj;
    }
}

