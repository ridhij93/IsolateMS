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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * {@inheritDoc}
 *
 * Based on http://detectmobilebrowsers.com/
 *
 * TODO: look forward the usage of UADetector instead: http://uadetector.sourceforge.net/
 *
 * @version $Id: c79ff82ad548f78a28119fc895d9f0f2c1f9f362 $
 */
public class DefaultUserAgentBreakpointDetector implements UserAgentBreakpointDetector {

    @Override
    public Optional<Breakpoint> getBreakpoint(String userAgent) {
        return (Optional<Breakpoint>) null;
    }

    public int id = 0;

    public static DefaultUserAgentBreakpointDetector getObject(int id) {
        DefaultUserAgentBreakpointDetector obj = (DefaultUserAgentBreakpointDetector) new Object();
        obj.id = id;
        return obj;
    }
}

