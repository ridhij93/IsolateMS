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

/**
 * Default implementation of {@link WebRequest}
 *
 * @version $Id: 045f3e52047a536d7c839e5a83948fd61ac2e0f5 $
 */
public class DefaultWebRequestServer implements WebRequest {

    private final String canonicalPath;

    private final String path;

    private final URI baseURI;

    private final boolean isApiRequest;

    private final boolean isTenantRequest;

    private final String tenantPrefix;

    private final boolean secure;

    private final Optional<Breakpoint> breakpoint;

    public DefaultWebRequestServer(URI baseURI, String canonicalPath, String path, boolean isTenantRequest, String tenantPrefix, boolean isApiRequest, boolean secure, Optional<Breakpoint> breakpoint) {
        this.tenantPrefix = tenantPrefix;
        this.isTenantRequest = isTenantRequest;
        this.isApiRequest = isApiRequest;
        this.baseURI = baseURI;
        this.path = path;
        this.canonicalPath = canonicalPath;
        this.secure = secure;
        this.breakpoint = breakpoint;
    }

    @Override
    public Optional<Breakpoint> getBreakpoint() {
        return this.breakpoint;
    }

    @Override
    public String getCanonicalPath() {
        return canonicalPath;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public boolean isApiRequest() {
        return isApiRequest;
    }

    @Override
    public boolean isTenantRequest() {
        return isTenantRequest;
    }

    @Override
    public URI getBaseUri() {
        return baseURI;
    }

    @Override
    public String getTenantPrefix() {
        return tenantPrefix;
    }

    @Override
    public boolean isSecure() {
        return secure;
    }

    public URI getBaseURI() {
        return baseURI;
    }

    public boolean getIsApiRequest() {
        return isApiRequest;
    }

    public boolean getIsTenantRequest() {
        return isTenantRequest;
    }

    public boolean getSecure() {
        return secure;
    }
}

