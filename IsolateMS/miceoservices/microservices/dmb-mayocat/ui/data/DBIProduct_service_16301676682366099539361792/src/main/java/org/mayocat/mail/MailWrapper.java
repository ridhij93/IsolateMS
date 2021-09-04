/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.mail;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
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
 * Represents an email that can be sent from the {@link MailService}
 *
 * @version $Id: 0715dcf50631bb26ae466fba4c06770ba7eddfc5 $
 */
@Controller
@RequestMapping("/ms1/mail/")
public class MailWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MailServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mail")
    public  @ResponseBody int Mail() {
        MailServer newServerObj = new MailServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

