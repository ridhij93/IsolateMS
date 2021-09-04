/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context.internal.request;

import java.net.URI;
import org.mayocat.context.request.WebRequest;
import org.mayocat.theme.Breakpoint;
import com.google.common.base.Optional;
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
 * Default implementation of {@link WebRequest}
 *
 * @version $Id: 045f3e52047a536d7c839e5a83948fd61ac2e0f5 $
 */
@Controller
@RequestMapping("/ms1/defaultwebrequest/")
public class DefaultWebRequestWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultWebRequestServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultwebrequest")
    public  @ResponseBody int DefaultWebRequest(@RequestParam int baseURIId, @RequestParam String canonicalPath, @RequestParam String path, @RequestParam boolean isTenantRequest, @RequestParam String tenantPrefix, @RequestParam boolean isApiRequest, @RequestParam boolean secure, @RequestParam int breakpointId) {
    }
}

