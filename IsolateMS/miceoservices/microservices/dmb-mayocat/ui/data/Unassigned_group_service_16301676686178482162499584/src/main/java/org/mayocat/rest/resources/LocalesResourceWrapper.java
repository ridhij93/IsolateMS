/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.resources;

import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.LocaleUtils;
import org.mayocat.rest.Resource;
import org.mayocat.rest.representations.LocaleRepresentation;
import org.xwiki.component.annotation.Component;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Locale;
import java.util.Set;
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
 * @version $Id: faef0d935f7b6667e5e273b06de518327db4fb1c $
 */
@Component("/api/locales")
@Path("/api/locales")
@Produces(MediaType.APPLICATION_JSON)
public class LocalesResourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, LocalesResourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "localesresource")
    public  @ResponseBody int LocalesResource() {
        LocalesResourceServer newServerObj = new LocalesResourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

