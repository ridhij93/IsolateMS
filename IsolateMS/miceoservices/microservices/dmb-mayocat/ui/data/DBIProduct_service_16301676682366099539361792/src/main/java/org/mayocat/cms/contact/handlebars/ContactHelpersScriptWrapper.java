/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.contact.handlebars;

import java.nio.file.Path;
import java.nio.file.Paths;
import javax.inject.Named;
import org.mayocat.views.rhino.handlebars.HelpersScript;
import org.xwiki.component.annotation.Component;
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
 * Declares Handlebar.js helpers for the CMS contact module
 *
 * @version $Id: d6a5cca5a40963ea6db488c9efc80709b0d38f43 $
 */
@Component
@Named("cmsContacts.js")
public class ContactHelpersScriptWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ContactHelpersScriptServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "contacthelpersscript")
    public  @ResponseBody int ContactHelpersScript() {
        ContactHelpersScriptServer newServerObj = new ContactHelpersScriptServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

