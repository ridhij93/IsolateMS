/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.localization.rest.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.context.WebContext;
import org.mayocat.rest.Resource;
import org.mayocat.rest.annotation.ExistingTenant;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import asia.redact.bracket.properties.Properties;
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
 * Expose theme localization properties.
 *
 * @version $Id: e5f5e0c55b51e6a4eeace47237fd00db2ea242d9 $
 */
@Component("/tenant/{tenant}/api/localization/theme/")
@Path("/tenant/{tenant}/api/localization/theme/")
@Produces(MediaType.APPLICATION_JSON)
@ExistingTenant
public class LocalizationResourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LocalizationResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "localizationresource")
    public  @ResponseBody int LocalizationResource() {
        LocalizationResourceServer newServerObj = new LocalizationResourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

