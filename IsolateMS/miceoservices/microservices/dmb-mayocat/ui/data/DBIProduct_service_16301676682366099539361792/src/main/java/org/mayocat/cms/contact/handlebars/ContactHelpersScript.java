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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Declares Handlebar.js helpers for the CMS contact module
 *
 * @version $Id: d6a5cca5a40963ea6db488c9efc80709b0d38f43 $
 */
@Component
@Named("cmsContacts.js")
public class ContactHelpersScript implements HelpersScript {

    @Override
    public Path getPath() {
        return (Path) null;
    }

    public int id = 0;

    public static ContactHelpersScript getObject(int id) {
        ContactHelpersScript obj = (ContactHelpersScript) new Object();
        obj.id = id;
        return obj;
    }
}

