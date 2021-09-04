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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e9a8ac6b27c74db51663c72c36d97db646f6bc2e $
 */
public abstract class AbstractRhinoEngine implements TemplateEngine, Initializable {

    public AbstractRhinoEngine(String engineFileName, Reader engineReader) {
        String uri = MicroserviceApplication.projectUri + "/ms1/abstractrhinoengine/abstractrhinoengine?callerId=" + this.id + "&engineFileName=engineFileName&engineReaderId=engineReader.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public void initialize() {
        return;
    }

    protected abstract void initializeEngine() {
        return;
    }

    protected Scriptable getScope() {
        return (Scriptable) null;
    }

    public void setGlobalScope(Scriptable globalScope) {
        return;
    }

    public Scriptable getGlobalScope() {
        return (Scriptable) null;
    }

    public void setEngineFileName(String engineFileName) {
        return;
    }

    public String getEngineFileName() {
        return (String) null;
    }

    public void setEngineReader(Reader engineReader) {
        return;
    }

    public Reader getEngineReader() {
        return (Reader) null;
    }

    public int id = 0;

    public static AbstractRhinoEngine getObject(int id) {
        AbstractRhinoEngine obj = (AbstractRhinoEngine) new Object();
        obj.id = id;
        return obj;
    }
}

