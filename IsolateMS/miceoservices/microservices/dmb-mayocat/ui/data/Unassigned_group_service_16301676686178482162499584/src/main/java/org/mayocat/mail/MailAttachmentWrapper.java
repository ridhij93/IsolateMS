/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import javax.activation.DataSource;
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
 * @version $Id: 16b45103bf613c387db95f31f3b93de307555bf1 $
 */
@Controller
@RequestMapping("/ms5/mailattachment/")
public class MailAttachmentWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MailAttachmentServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mailattachment")
    public  @ResponseBody int MailAttachment(@RequestParam int dataSourceId, @RequestParam String fileName) {
        MailAttachmentServer newServerObj = new MailAttachmentServer(DataSource.getObject(dataSourceId), fileName);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

