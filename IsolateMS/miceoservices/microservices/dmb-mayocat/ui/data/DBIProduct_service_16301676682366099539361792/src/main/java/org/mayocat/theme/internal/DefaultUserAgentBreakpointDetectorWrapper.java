/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.theme.internal;

import org.mayocat.theme.Breakpoint;
import org.mayocat.theme.UserAgentBreakpointDetector;
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
 * {@inheritDoc}
 *
 * Based on http://detectmobilebrowsers.com/
 *
 * TODO: look forward the usage of UADetector instead: http://uadetector.sourceforge.net/
 *
 * @version $Id: c79ff82ad548f78a28119fc895d9f0f2c1f9f362 $
 */
@Controller
@RequestMapping("/ms1/defaultuseragentbreakpointdetector/")
public class DefaultUserAgentBreakpointDetectorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultUserAgentBreakpointDetectorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultuseragentbreakpointdetector")
    public  @ResponseBody int DefaultUserAgentBreakpointDetector() {
        DefaultUserAgentBreakpointDetectorServer newServerObj = new DefaultUserAgentBreakpointDetectorServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

