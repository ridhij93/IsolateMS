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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1a11a63dd9e640f849c1e0468651d243cec9edb4 $
 */
@Component("breakpoint")
public class BreakpointProvider extends AbstractInjectableProvider<Breakpoint> implements Provider {

    public BreakpointProvider() {
        String uri = MicroserviceApplication.projectUri + "/ms2/breakpointprovider/breakpointprovidercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public Breakpoint getValue(HttpContext httpContext) {
        return (Breakpoint) null;
    }

    public void setBreakpointDetector(UserAgentBreakpointDetector breakpointDetector) {
        return;
    }

    public UserAgentBreakpointDetector getBreakpointDetector() {
        return (UserAgentBreakpointDetector) null;
    }

    public int id = 0;

    public static BreakpointProvider getObject(int id) {
        BreakpointProvider obj = (BreakpointProvider) new Object();
        obj.id = id;
        return obj;
    }
}

