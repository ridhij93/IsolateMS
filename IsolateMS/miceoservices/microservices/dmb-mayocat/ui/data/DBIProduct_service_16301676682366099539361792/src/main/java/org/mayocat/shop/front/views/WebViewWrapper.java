/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.views;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
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
 * @version $Id: 71930d4b6a1acfe65ae1584f19e670dd444da810 $
 */
@Controller
@RequestMapping("/ms1/webview/")
public class WebViewWrapper {

    public enum Option {

        FALLBACK_ON_DEFAULT_THEME, FALLBACK_ON_GLOBAL_TEMPLATES
    }

    private static int maxId = 0;

    public static HashMap<Integer, WebViewServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "webview")
    public  @ResponseBody int WebView() {
        WebViewServer newServerObj = new WebViewServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

