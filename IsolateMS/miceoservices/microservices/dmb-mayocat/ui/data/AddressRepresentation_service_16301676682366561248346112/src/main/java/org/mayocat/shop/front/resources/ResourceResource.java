/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.resources;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Date;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import org.mayocat.context.WebContext;
import org.mayocat.rest.Resource;
import org.mayocat.theme.ThemeFileResolver;
import org.mayocat.theme.ThemeResource;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import io.dropwizard.servlets.assets.ResourceURL;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 7d9ab5465990a316a4c5e14aad437af7c9e9c687 $
 */
@Component(ResourceResource.getPATH())
@Path(ResourceResource.getPATH())
public class ResourceResource implements Resource {

    @GET
    @Path("{path:.+}")
    public Response getResource(@PathParam("path") String resource, @Context Request request) throws Exception {
        return (Response) null;
    }

    private Optional<String> guessMimeType(File file) {
        return (Optional<String>) null;
    }

    public static String getPATH() {
        String uri = MicroserviceApplication.projectUri + "/ms2/resourceresource/getpath";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setThemeFileResolver(ThemeFileResolver themeFileResolver) {
        return;
    }

    public ThemeFileResolver getThemeFileResolver() {
        return (ThemeFileResolver) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setContext(WebContext context) {
        return;
    }

    public WebContext getContext() {
        return (WebContext) null;
    }

    public int id = 0;

    public static ResourceResource getObject(int id) {
        ResourceResource obj = (ResourceResource) new Object();
        obj.id = id;
        return obj;
    }
}

