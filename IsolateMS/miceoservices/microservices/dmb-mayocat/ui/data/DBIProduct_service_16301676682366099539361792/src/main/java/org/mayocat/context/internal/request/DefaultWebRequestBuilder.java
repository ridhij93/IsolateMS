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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 24b45451ea46ca44231b45548c5f753a90da6122 $
 */
public class DefaultWebRequestBuilder {

    public DefaultWebRequestBuilder canonicalPath(String path) {
        return (DefaultWebRequestBuilder) null;
    }

    public DefaultWebRequestBuilder path(String path) {
        return (DefaultWebRequestBuilder) null;
    }

    public DefaultWebRequestBuilder baseURI(URI baseURI) {
        return (DefaultWebRequestBuilder) null;
    }

    public DefaultWebRequestBuilder apiRequest(boolean isApiRequest) {
        return (DefaultWebRequestBuilder) null;
    }

    public DefaultWebRequestBuilder tenantRequest(boolean isTenantRequest) {
        return (DefaultWebRequestBuilder) null;
    }

    public DefaultWebRequestBuilder tenantPrefix(String tenantPrefix) {
        return (DefaultWebRequestBuilder) null;
    }

    public DefaultWebRequestBuilder secure(boolean secure) {
        return (DefaultWebRequestBuilder) null;
    }

    public DefaultWebRequestBuilder breakpoint(Optional<Breakpoint> breakpoint) {
        return (DefaultWebRequestBuilder) null;
    }

    public WebRequest build() {
        return (WebRequest) null;
    }

    public void setCanonicalPath(String canonicalPath) {
        return;
    }

    public String getCanonicalPath() {
        return (String) null;
    }

    public void setPath(String path) {
        return;
    }

    public String getPath() {
        return (String) null;
    }

    public void setBaseURI(URI baseURI) {
        return;
    }

    public URI getBaseURI() {
        return (URI) null;
    }

    public void setIsApiRequest(boolean isApiRequest) {
        return;
    }

    public boolean getIsApiRequest() {
        return (Boolean) null;
    }

    public void setIsTenantRequest(boolean isTenantRequest) {
        return;
    }

    public boolean getIsTenantRequest() {
        return (Boolean) null;
    }

    public void setTenantPrefix(String tenantPrefix) {
        return;
    }

    public String getTenantPrefix() {
        return (String) null;
    }

    public void setBreakpoint(Optional<Breakpoint> breakpoint) {
        return;
    }

    public Optional<Breakpoint> getBreakpoint() {
        return (Optional<Breakpoint>) null;
    }

    public void setSecure(boolean secure) {
        return;
    }

    public boolean getSecure() {
        return (Boolean) null;
    }

    public int id = 0;

    public static DefaultWebRequestBuilder getObject(int id) {
        DefaultWebRequestBuilder obj = (DefaultWebRequestBuilder) new Object();
        obj.id = id;
        return obj;
    }
}

