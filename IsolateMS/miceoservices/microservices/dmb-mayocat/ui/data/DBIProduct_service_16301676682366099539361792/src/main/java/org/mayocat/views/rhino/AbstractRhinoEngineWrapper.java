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
 * @version $Id: e9a8ac6b27c74db51663c72c36d97db646f6bc2e $
 */
@Controller
@RequestMapping("/ms1/abstractrhinoengine/")
public abstract class AbstractRhinoEngineWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractRhinoEngineServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractrhinoengine")
    public  @ResponseBody int AbstractRhinoEngine(@RequestParam String engineFileName, @RequestParam int engineReaderId) {
        AbstractRhinoEngineServer newServerObj = new AbstractRhinoEngineServer(engineFileName, Reader.getObject(engineReaderId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

