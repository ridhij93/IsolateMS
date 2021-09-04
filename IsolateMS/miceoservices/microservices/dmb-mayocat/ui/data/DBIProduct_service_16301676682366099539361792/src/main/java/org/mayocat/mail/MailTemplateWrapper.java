/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import java.util.Locale;
import com.google.common.base.Optional;
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
 * @version $Id: 3a17a8abbaee2776ff1d44876f8d66025043e9e4 $
 */
@Controller
@RequestMapping("/ms1/mailtemplate/")
public class MailTemplateWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MailTemplateServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mailtemplate")
    public  @ResponseBody int MailTemplate() {
        MailTemplateServer newServerObj = new MailTemplateServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

