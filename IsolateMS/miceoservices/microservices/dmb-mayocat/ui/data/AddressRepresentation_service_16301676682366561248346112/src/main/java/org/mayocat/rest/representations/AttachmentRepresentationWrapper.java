/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.representations;

import java.util.Locale;
import java.util.Map;
import org.mayocat.attachment.model.Attachment;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * @version $Id: b8b8071fc36f965e99fc83c059a889a3fc962cf3 $
 */
@Controller
@RequestMapping("/ms2/attachmentrepresentation/")
public class AttachmentRepresentationWrapper {

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, AttachmentRepresentationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "attachmentrepresentation")
    public  @ResponseBody int AttachmentRepresentation() {
        AttachmentRepresentationServer newServerObj = new AttachmentRepresentationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "attachmentrepresentation")
    public  @ResponseBody int AttachmentRepresentation(@RequestParam int attachmentId) {
        AttachmentRepresentationServer newServerObj = new AttachmentRepresentationServer(Attachment.getObject(attachmentId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "attachmentrepresentation")
    public  @ResponseBody int AttachmentRepresentation(@RequestParam int attachmentId, @RequestParam String uri, @RequestParam int fileId) {
        AttachmentRepresentationServer newServerObj = new AttachmentRepresentationServer(Attachment.getObject(attachmentId), uri, FileRepresentation.getObject(fileId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

