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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: faef0d935f7b6667e5e273b06de518327db4fb1c $
 */
@Component("/api/locales")
@Path("/api/locales")
@Produces(MediaType.APPLICATION_JSON)
public class LocalesResource implements Resource {

    @GET
    public Response getLocales() {
        return (Response) null;
    }

    public void setLocalesRepresentations(Set<LocaleRepresentation> localesRepresentations) {
        return;
    }

    public Set<LocaleRepresentation> getLocalesRepresentations() {
        return (Set<LocaleRepresentation>) null;
    }

    public int id = 0;

    public static LocalesResource getObject(int id) {
        LocalesResource obj = (LocalesResource) new Object();
        obj.id = id;
        return obj;
    }
}

