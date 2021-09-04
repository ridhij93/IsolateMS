/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.attachment.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Function;
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
 * Data of an {@link Attachment}
 *
 * @version $Id: ed7e6cb82d3f8d11cc1602ede500c8b3176f2233 $
 */
@Controller
@RequestMapping("/ms1/attachmentdata/")
public class AttachmentDataWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AttachmentDataServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "attachmentdata")
    public  @ResponseBody int AttachmentData(@RequestParam int streamId) {
        AttachmentDataServer newServerObj = new AttachmentDataServer(InputStream.getObject(streamId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

