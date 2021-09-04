/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.url;

import java.net.URL;
import javax.inject.Inject;
import org.mayocat.accounts.model.Tenant;
import org.mayocat.attachment.model.Attachment;
import org.mayocat.attachment.util.AttachmentUtils;
import org.mayocat.url.EntityURLFactory;
import org.mayocat.url.URLHelper;
import org.mayocat.url.URLType;
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
 * @version $Id: b273328472394b7372c8a9c76dcd99c58d959b77 $
 */
@Component
public class AttachmentURLFactoryWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AttachmentURLFactoryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "attachmenturlfactory")
    public  @ResponseBody int AttachmentURLFactory() {
        AttachmentURLFactoryServer newServerObj = new AttachmentURLFactoryServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

