/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jersey;

import javax.inject.Inject;
import org.mayocat.rest.Provider;
import org.mayocat.theme.Breakpoint;
import org.mayocat.theme.UserAgentBreakpointDetector;
import org.xwiki.component.annotation.Component;
import com.sun.jersey.api.core.HttpContext;
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
 * @version $Id: 1a11a63dd9e640f849c1e0468651d243cec9edb4 $
 */
@Component("breakpoint")
public class BreakpointProviderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, BreakpointProviderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "breakpointprovider")
    public  @ResponseBody int BreakpointProvider() {
        BreakpointProviderServer newServerObj = new BreakpointProviderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

