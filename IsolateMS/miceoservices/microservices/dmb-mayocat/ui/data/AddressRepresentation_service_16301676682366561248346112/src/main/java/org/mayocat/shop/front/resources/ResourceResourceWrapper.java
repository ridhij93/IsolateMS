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
 * @version $Id: 7d9ab5465990a316a4c5e14aad437af7c9e9c687 $
 */
@Component(ResourceResource.getPATH())
@Path(ResourceResource.getPATH())
public class ResourceResourceWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getpath")
    public static @ResponseBody String getPATH() {
        String result = ResourceResourceServer.getPATH();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, ResourceResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "resourceresource")
    public  @ResponseBody int ResourceResource() {
        ResourceResourceServer newServerObj = new ResourceResourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

