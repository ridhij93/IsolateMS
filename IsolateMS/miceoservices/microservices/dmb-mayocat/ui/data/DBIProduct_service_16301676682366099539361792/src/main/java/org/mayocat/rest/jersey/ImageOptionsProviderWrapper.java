/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jersey;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.ws.rs.core.Context;
import org.mayocat.rest.Provider;
import org.mayocat.rest.parameters.ImageOptions;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Optional;
import com.sun.jersey.api.core.HttpContext;
import com.sun.jersey.api.model.Parameter;
import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.core.spi.component.ComponentScope;
import com.sun.jersey.server.impl.inject.AbstractHttpContextInjectable;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.InjectableProvider;
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
 * @version $Id: 576c58059e54d0465908167199f5c3748d931885 $
 */
@Component("imageOptionsProvider")
public class ImageOptionsProviderWrapper {

    private class ImageOptionsInjectable extends AbstractHttpContextInjectable<Optional<ImageOptions>> {
    }

    private static int maxId = 0;

    public static HashMap<Integer, ImageOptionsProviderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "imageoptionsprovider")
    public  @ResponseBody int ImageOptionsProvider() {
        ImageOptionsProviderServer newServerObj = new ImageOptionsProviderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

