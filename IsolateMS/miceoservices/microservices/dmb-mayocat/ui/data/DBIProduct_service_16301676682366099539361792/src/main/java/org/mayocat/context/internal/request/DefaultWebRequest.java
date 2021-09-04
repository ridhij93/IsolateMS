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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Default implementation of {@link WebRequest}
 *
 * @version $Id: 045f3e52047a536d7c839e5a83948fd61ac2e0f5 $
 */
public class DefaultWebRequest implements WebRequest {

    public DefaultWebRequest(URI baseURI, String canonicalPath, String path, boolean isTenantRequest, String tenantPrefix, boolean isApiRequest, boolean secure, Optional<Breakpoint> breakpoint) {
        String uri = MicroserviceApplication.projectUri + "/ms1/defaultwebrequest/defaultwebrequest?callerId=" + this.id + "&baseURIId=baseURI.id&canonicalPath=canonicalPath&path=path&isTenantRequest=isTenantRequest&tenantPrefix=tenantPrefix&isApiRequest=isApiRequest&secure=secure&breakpointId=breakpoint.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public Optional<Breakpoint> getBreakpoint() {
        return (Optional<Breakpoint>) null;
    }

    @Override
    public String getCanonicalPath() {
        return (String) null;
    }

    @Override
    public String getPath() {
        return (String) null;
    }

    @Override
    public boolean isApiRequest() {
        return (Boolean) null;
    }

    @Override
    public boolean isTenantRequest() {
        return (Boolean) null;
    }

    @Override
    public URI getBaseUri() {
        return (URI) null;
    }

    @Override
    public String getTenantPrefix() {
        return (String) null;
    }

    @Override
    public boolean isSecure() {
        return (Boolean) null;
    }

    public URI getBaseURI() {
        return (URI) null;
    }

    public boolean getIsApiRequest() {
        return (Boolean) null;
    }

    public boolean getIsTenantRequest() {
        return (Boolean) null;
    }

    public boolean getSecure() {
        return (Boolean) null;
    }

    public int id = 0;

    public static DefaultWebRequest getObject(int id) {
        DefaultWebRequest obj = (DefaultWebRequest) new Object();
        obj.id = id;
        return obj;
    }
}

