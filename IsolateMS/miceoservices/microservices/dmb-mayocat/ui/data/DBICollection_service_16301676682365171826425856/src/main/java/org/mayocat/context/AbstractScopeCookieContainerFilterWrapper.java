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
 * Base class for cookie-based scope container filters such as {@link SessionScopeCookieContainerFilter} or {@link
 * FlashScopeCookieContainerFilter}
 *
 * @version $Id: f457d81b06a59c18644a3bdf42b37ae283e15e82 $
 */
@Controller
@RequestMapping("/ms0/abstractscopecookiecontainerfilter/")
public abstract class AbstractScopeCookieContainerFilterWrapper<T extends WebScope> {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractScopeCookieContainerFilterServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractscopecookiecontainerfilter")
    public  @ResponseBody int AbstractScopeCookieContainerFilter() {
        AbstractScopeCookieContainerFilterServer newServerObj = new AbstractScopeCookieContainerFilterServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

