/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import org.mayocat.configuration.SecuritySettings;
import org.mayocat.security.Cipher;
import org.mayocat.security.EncryptionException;
import org.mayocat.context.scope.WebScope;
import org.mayocat.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Charsets;
import com.google.common.base.Strings;
import com.sun.jersey.core.util.Base64;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Base class for cookie-based scope container filters such as {@link SessionScopeCookieContainerFilter} or {@link
 * FlashScopeCookieContainerFilter}
 *
 * @version $Id: f457d81b06a59c18644a3bdf42b37ae283e15e82 $
 */
public abstract class AbstractScopeCookieContainerFilter<T extends WebScope> implements ContainerResponseFilter, ContainerRequestFilter {

    protected abstract String getScopeAndCookieName() {
        return (String) null;
    }

    protected abstract boolean scopeExistsAndNotEmpty(WebContext context) {
        return (Boolean) null;
    }

    protected abstract T getScope(WebContext context) {
        return (T) null;
    }

    protected abstract void setScope(WebContext context, T scope) {
        return;
    }

    protected abstract boolean encryptAndSign() {
        return (Boolean) null;
    }

    protected abstract T cast(Object object) {
        return (T) null;
    }

    protected int getCookieDuration() {
        return (Integer) null;
    }

    public ContainerResponse filter(ContainerRequest containerRequest, ContainerResponse containerResponse) {
        return (ContainerResponse) null;
    }

    @Override
    public ContainerRequest filter(ContainerRequest containerRequest) {
        return (ContainerRequest) null;
    }

    protected void deleteCookie(ContainerResponse containerResponse) {
        return;
    }

    protected void storeScopeInCookies(WebContext context, ContainerResponse containerResponse) {
        return;
    }

    protected T getScopeFromCookies(ContainerRequest containerRequest) throws IOException, EncryptionException {
        return (T) null;
    }

    protected Object deserialize(String serialized) throws IOException, ClassNotFoundException {
        return (Object) null;
    }

    protected String serialize(Serializable object) throws IOException {
        return (String) null;
    }

    protected String getCookie(ContainerRequest request, String cookieName) {
        return (String) null;
    }

    private String computeSignature(String message) throws GeneralSecurityException {
        return (String) null;
    }

    private String encode(String s) {
        return (String) null;
    }

    private String decode(String s) {
        return (String) null;
    }

    public static Logger getLOGGER() {
        return (Logger) null;
    }

    public static String getHMAC_SHA256_ALGORITHM() {
        return (String) null;
    }

    public int id = 0;

    public static AbstractScopeCookieContainerFilter getObject(int id) {
        AbstractScopeCookieContainerFilter obj = (AbstractScopeCookieContainerFilter) new Object();
        obj.id = id;
        return obj;
    }
}

