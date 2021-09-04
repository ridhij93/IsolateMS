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

/**
 * @version $Id: 24b45451ea46ca44231b45548c5f753a90da6122 $
 */
public class DefaultWebRequestBuilderServer {

    private String canonicalPath;

    private String path;

    private URI baseURI;

    private boolean isApiRequest = false;

    private boolean isTenantRequest = false;

    private String tenantPrefix = "";

    private Optional<Breakpoint> breakpoint = Optional.absent();

    private boolean secure = false;

    public DefaultWebRequestBuilder canonicalPath(String path) {
        this.canonicalPath = path;
        return this;
    }

    public DefaultWebRequestBuilder path(String path) {
        this.path = path;
        return this;
    }

    public DefaultWebRequestBuilder baseURI(URI baseURI) {
        this.baseURI = baseURI;
        return this;
    }

    public DefaultWebRequestBuilder apiRequest(boolean isApiRequest) {
        this.isApiRequest = isApiRequest;
        return this;
    }

    public DefaultWebRequestBuilder tenantRequest(boolean isTenantRequest) {
        this.isTenantRequest = isTenantRequest;
        return this;
    }

    public DefaultWebRequestBuilder tenantPrefix(String tenantPrefix) {
        this.tenantPrefix = tenantPrefix;
        return this;
    }

    public DefaultWebRequestBuilder secure(boolean secure) {
        this.secure = secure;
        return this;
    }

    public DefaultWebRequestBuilder breakpoint(Optional<Breakpoint> breakpoint) {
        this.breakpoint = breakpoint;
        return this;
    }

    public WebRequest build() {
        Preconditions.checkNotNull(path, "The path has not been set");
        Preconditions.checkNotNull(canonicalPath, "The path has not been set");
        Preconditions.checkNotNull(baseURI, "The base URI has not been set");
        return new DefaultWebRequest(baseURI, canonicalPath, path, isTenantRequest, tenantPrefix, isApiRequest, secure, breakpoint);
    }

    public void setCanonicalPath(String canonicalPath) {
        this.canonicalPath = canonicalPath;
    }

    public String getCanonicalPath() {
        return canonicalPath;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setBaseURI(URI baseURI) {
        this.baseURI = baseURI;
    }

    public URI getBaseURI() {
        return baseURI;
    }

    public void setIsApiRequest(boolean isApiRequest) {
        this.isApiRequest = isApiRequest;
    }

    public boolean getIsApiRequest() {
        return isApiRequest;
    }

    public void setIsTenantRequest(boolean isTenantRequest) {
        this.isTenantRequest = isTenantRequest;
    }

    public boolean getIsTenantRequest() {
        return isTenantRequest;
    }

    public void setTenantPrefix(String tenantPrefix) {
        this.tenantPrefix = tenantPrefix;
    }

    public String getTenantPrefix() {
        return tenantPrefix;
    }

    public void setBreakpoint(Optional<Breakpoint> breakpoint) {
        this.breakpoint = breakpoint;
    }

    public Optional<Breakpoint> getBreakpoint() {
        return breakpoint;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public boolean getSecure() {
        return secure;
    }
}

