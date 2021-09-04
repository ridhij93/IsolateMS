/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.configuration.internal;

import java.util.Map;
import com.google.common.reflect.TypeToken;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: cf6d6ff7c7b6e37a0b88cb53b8627410c41c06a1 $
 */
public class ConfigurationMerger {

    public <T> T merge(T object, Map<String, Object> json) {
        return (T) null;
    }

    private Object mergeInternal(Class klass, Object object, Map<String, Object> json) {
        return (Object) null;
    }

    public <T> Class getConfigurationClass(Object object) {
        return (Class) null;
    }

    public int id = 0;

    public static ConfigurationMerger getObject(int id) {
        ConfigurationMerger obj = (ConfigurationMerger) new Object();
        obj.id = id;
        return obj;
    }
}

