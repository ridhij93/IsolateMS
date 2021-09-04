/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.multitenancy;

import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.mayocat.context.WebContext;
import org.mayocat.util.Utils;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
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
 * @version $Id: 5e4584f4348fc98596b1b9eefb13c1ed5f86b14a $
 */
@Controller
@RequestMapping("/ms1/multitenancycontainerfilter/")
public class MultitenancyContainerFilterWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MultitenancyContainerFilterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "multitenancycontainerfilter")
    public  @ResponseBody int MultitenancyContainerFilter() {
        MultitenancyContainerFilterServer newServerObj = new MultitenancyContainerFilterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

