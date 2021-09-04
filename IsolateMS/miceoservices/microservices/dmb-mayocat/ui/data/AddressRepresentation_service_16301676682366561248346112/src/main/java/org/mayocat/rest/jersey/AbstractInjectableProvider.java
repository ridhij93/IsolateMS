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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * See http://codahale.com/what-makes-jersey-interesting-injection-providers/
 *
 * @version $Id: 3bc84179bd6d101190dc6071f44958f666d78a36 $
 */
public abstract class AbstractInjectableProvider<E> extends AbstractHttpContextInjectable<E> implements InjectableProvider<Context, Type> {

    public AbstractInjectableProvider(Type t) {
        String uri = MicroserviceApplication.projectUri + "/ms2/abstractinjectableprovider/abstractinjectableprovider?callerId=" + this.id + "&tId=t.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public Injectable<E> getInjectable(ComponentContext ic, Context a, Type c) {
        return (Injectable<E>) null;
    }

    public Injectable<E> getInjectable(ComponentContext ic, Context a) {
        return (Injectable<E>) null;
    }

    @Override
    public ComponentScope getScope() {
        return (ComponentScope) null;
    }

    public Type getT() {
        return (Type) null;
    }

    public int id = 0;

    public static AbstractInjectableProvider getObject(int id) {
        AbstractInjectableProvider obj = (AbstractInjectableProvider) new Object();
        obj.id = id;
        return obj;
    }
}

