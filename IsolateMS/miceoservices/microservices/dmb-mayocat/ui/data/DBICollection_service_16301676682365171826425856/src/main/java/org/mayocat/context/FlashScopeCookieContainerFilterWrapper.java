/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context;

import org.mayocat.context.scope.Flash;
import org.mayocat.context.scope.cookie.CookieFlash;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.sun.jersey.spi.container.ContainerResponseFilter;
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
 * Flash scope container filter. It is not encrypted.
 *
 * @version $Id: 2b4eacff48b9e8189c44e4350fb5e4f1fe76c4b1 $
 */
@Controller
@RequestMapping("/ms0/flashscopecookiecontainerfilter/")
public class FlashScopeCookieContainerFilterWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, FlashScopeCookieContainerFilterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "flashscopecookiecontainerfilter")
    public  @ResponseBody int FlashScopeCookieContainerFilter() {
        FlashScopeCookieContainerFilterServer newServerObj = new FlashScopeCookieContainerFilterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

