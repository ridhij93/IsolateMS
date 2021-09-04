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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 576c58059e54d0465908167199f5c3748d931885 $
 */
@Component("imageOptionsProvider")
public class ImageOptionsProvider implements InjectableProvider<Context, Parameter>, Provider {

    private class ImageOptionsInjectable extends AbstractHttpContextInjectable<Optional<ImageOptions>> {

        @Override
        public Optional<ImageOptions> getValue(HttpContext httpContext) {
            return (Optional<ImageOptions>) null;
        }

        private Optional<Integer> extractValue(List<String> value) {
            return (Optional<Integer>) null;
        }
    }

    @Override
    public ComponentScope getScope() {
        return (ComponentScope) null;
    }

    @Override
    public Injectable getInjectable(ComponentContext ic, Context context, Parameter parameter) {
        return (Injectable) null;
    }

    private boolean isExtractable(Parameter param) {
        return (Boolean) null;
    }

    public static String getWIDTH_OPTION() {
        return (String) null;
    }

    public static String getHEIGHT_OPTION() {
        return (String) null;
    }

    public int id = 0;

    public static ImageOptionsProvider getObject(int id) {
        ImageOptionsProvider obj = (ImageOptionsProvider) new Object();
        obj.id = id;
        return obj;
    }
}

