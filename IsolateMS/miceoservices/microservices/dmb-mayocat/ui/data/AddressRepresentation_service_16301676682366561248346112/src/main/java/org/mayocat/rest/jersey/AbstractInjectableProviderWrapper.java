/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.jersey;

import java.lang.reflect.Type;
import javax.ws.rs.core.Context;
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
 * See http://codahale.com/what-makes-jersey-interesting-injection-providers/
 *
 * @version $Id: 3bc84179bd6d101190dc6071f44958f666d78a36 $
 */
@Controller
@RequestMapping("/ms2/abstractinjectableprovider/")
public abstract class AbstractInjectableProviderWrapper<E> {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractInjectableProviderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractinjectableprovider")
    public  @ResponseBody int AbstractInjectableProvider(@RequestParam int tId) {
        AbstractInjectableProviderServer newServerObj = new AbstractInjectableProviderServer(Type.getObject(tId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

