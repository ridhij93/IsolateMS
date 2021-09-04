/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.util;

import java.util.HashSet;
import java.util.Set;
import org.mayocat.attachment.model.Attachment;
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
 * @version $Id: 37ce2d9b02c60e09bef5d4192868c2abeb34cdff $
 */
@Controller
@RequestMapping("/ms0/attachmentutils/")
public class AttachmentUtilsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AttachmentUtilsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "attachmentutils")
    public  @ResponseBody int AttachmentUtils() {
        AttachmentUtilsServer newServerObj = new AttachmentUtilsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

