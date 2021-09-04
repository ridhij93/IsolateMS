/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.views.rhino;

import java.io.IOException;
import java.io.Reader;
import org.mayocat.views.TemplateEngine;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.xwiki.component.phase.Initializable;

/**
 * @version $Id: e9a8ac6b27c74db51663c72c36d97db646f6bc2e $
 */
public abstract class AbstractRhinoEngineServer implements TemplateEngine, Initializable {

    private Scriptable globalScope;

    private String engineFileName;

    private Reader engineReader;

    public AbstractRhinoEngineServer(String engineFileName, Reader engineReader) {
        this.engineFileName = engineFileName;
        this.engineReader = engineReader;
    }

    public void initialize() {
        try {
            Context engineContext = Context.enter();
            engineContext.setOptimizationLevel(9);
            try {
                globalScope = engineContext.initStandardObjects();
                engineContext.evaluateReader(globalScope, engineReader, engineFileName, 0, null);
                engineContext.evaluateString(globalScope, ";var templates = {};", "templates.js", 0, null);
            } finally {
                Context.exit();
            }
        } catch (IOException ex) {
            throw new RuntimeException("ERROR : Unable to load engine resource: ", ex);
        }
        initializeEngine();
    }

    protected abstract void initializeEngine();

    protected Scriptable getScope() {
        return this.globalScope;
    }

    public void setGlobalScope(Scriptable globalScope) {
        this.globalScope = globalScope;
    }

    public Scriptable getGlobalScope() {
        return globalScope;
    }

    public void setEngineFileName(String engineFileName) {
        this.engineFileName = engineFileName;
    }

    public String getEngineFileName() {
        return engineFileName;
    }

    public void setEngineReader(Reader engineReader) {
        this.engineReader = engineReader;
    }

    public Reader getEngineReader() {
        return engineReader;
    }
}

