/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.jersey;

import javax.inject.Inject;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.mayocat.accounts.AccountsService;
import org.mayocat.accounts.api.v1.TenantUserApi;
import org.mayocat.accounts.model.Role;
import org.mayocat.accounts.model.User;
import org.mayocat.authorization.Gatekeeper;
import org.mayocat.authorization.annotation.Authorized;
import org.mayocat.context.WebContext;
import org.mayocat.rest.Provider;
import org.mayocat.rest.annotation.ExistingTenant;
import org.mayocat.rest.error.Error;
import org.mayocat.rest.error.ErrorUtil;
import org.mayocat.rest.error.StandardError;
import org.xwiki.component.annotation.Component;
import com.sun.jersey.api.core.HttpContext;
import com.sun.jersey.api.model.AbstractResourceMethod;
import com.sun.jersey.spi.container.ResourceMethodDispatchAdapter;
import com.sun.jersey.spi.container.ResourceMethodDispatchProvider;
import com.sun.jersey.spi.dispatch.RequestDispatcher;
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
 * Processes resources and check for the presence of Mayocat-specific annotation on the resource method and/or class and
 * instrument the resource accordingly if necessary.
 *
 * @version $Id: ad17be8a3c63ee62799e5f8aa7846673e856e41b $
 */
@Component("checkTenantAndUserMethodDispatch")
public class CheckTenantAndUserMethodDispatchWrapper {

    /**
     * Request dispatcher that checks if a valid tenant has been set in the context, throws a NOT FOUND (404)
     * if none is found. <p /> Used when {@link org.mayocat.rest.annotation.ExistingTenant} annotation is present on a resource.
     */
    private class CheckValidTenantRequestDispatcher implements RequestDispatcher {

        private final RequestDispatcher underlying;

        public CheckValidTenantRequestDispatcher(RequestDispatcher underlying) {
            this.underlying = underlying;
        }
    }

    /**
     * Request dispatcher that checks the authorization level of the user set in the context relatively to the declared
     * clearance required by the {@link org.mayocat.authorization.annotation.Authorized} annotation on a resource.
     */
    private class CheckAuthorizationMethodDispatcher implements RequestDispatcher {

        private final AbstractResourceMethod method;

        private final RequestDispatcher underlying;

        private final Authorized annotation;

        public CheckAuthorizationMethodDispatcher(AbstractResourceMethod method, Authorized authorizedAnnotation, RequestDispatcher underlying) {
            this.underlying = underlying;
            this.method = method;
            this.annotation = authorizedAnnotation;
        }
    }

    /**
     * Request dispatcher provider that inspects Mayocat annotation on resources and declares the proper dispatchers
     * when necessary.
     */
    private class AnnotationResourceMethodDispatchProvider implements ResourceMethodDispatchProvider {

        private final ResourceMethodDispatchProvider provider;

        public AnnotationResourceMethodDispatchProvider(ResourceMethodDispatchProvider provider) {
            this.provider = provider;
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, CheckTenantAndUserMethodDispatchServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "checktenantandusermethoddispatch")
    public  @ResponseBody int CheckTenantAndUserMethodDispatch() {
        CheckTenantAndUserMethodDispatchServer newServerObj = new CheckTenantAndUserMethodDispatchServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

