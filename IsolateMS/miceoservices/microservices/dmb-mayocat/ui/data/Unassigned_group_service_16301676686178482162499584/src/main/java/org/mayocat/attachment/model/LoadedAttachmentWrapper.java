/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.model;

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
 * @version $Id: dc932f72ea181b898416041612a9ad16f16f816f $
 */
@Controller
@RequestMapping("/ms5/loadedattachment/")
public class LoadedAttachmentWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LoadedAttachmentServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "loadedattachment")
    public  @ResponseBody int LoadedAttachment() {
        LoadedAttachmentServer newServerObj = new LoadedAttachmentServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

