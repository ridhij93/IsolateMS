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
import com.google.common.base.Preconditions;
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
 * @version $Id: 24b45451ea46ca44231b45548c5f753a90da6122 $
 */
@Controller
@RequestMapping("/ms1/defaultwebrequestbuilder/")
public class DefaultWebRequestBuilderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultWebRequestBuilderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultwebrequestbuilder")
    public  @ResponseBody int DefaultWebRequestBuilder() {
        DefaultWebRequestBuilderServer newServerObj = new DefaultWebRequestBuilderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

