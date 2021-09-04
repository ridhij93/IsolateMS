/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.resources;

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
 * @version $Id: 830910393764aae88b7ef850b50492db2ac72a7d $
 */
@Controller
@RequestMapping("/ms2/abstractwebviewresource/")
public class AbstractWebViewResourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractWebViewResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractwebviewresource")
    public  @ResponseBody int AbstractWebViewResource() {
        AbstractWebViewResourceServer newServerObj = new AbstractWebViewResourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

