/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.resources;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Response;
import org.mayocat.attachment.model.LoadedAttachment;
import org.mayocat.attachment.store.AttachmentStore;
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
 * @version $Id: 2815b8c5117f2d4f96da36961381757a8005e0bb $
 */
@Controller
@RequestMapping("/ms1/abstractattachmentresource/")
public class AbstractAttachmentResourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractAttachmentResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractattachmentresource")
    public  @ResponseBody int AbstractAttachmentResource() {
        AbstractAttachmentResourceServer newServerObj = new AbstractAttachmentResourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

