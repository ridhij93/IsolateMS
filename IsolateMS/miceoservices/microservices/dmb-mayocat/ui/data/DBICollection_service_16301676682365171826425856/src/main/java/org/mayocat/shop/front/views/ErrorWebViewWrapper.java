/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.views;

import java.nio.file.Paths;
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
 * Web views for errors. Templates names correspond to the HTTP status code for that error, example : 500.html for
 * 500 errors, 404.html for 400 errors, etc.
 *
 * @version $Id: b21cdbe8135bd266f4051cae03ebaa9c94cd4aca $
 */
@Controller
@RequestMapping("/ms0/errorwebview/")
public class ErrorWebViewWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ErrorWebViewServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "errorwebview")
    public  @ResponseBody int ErrorWebView() {
        ErrorWebViewServer newServerObj = new ErrorWebViewServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

