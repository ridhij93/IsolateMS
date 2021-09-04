/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.extraction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.mayocat.util.StringUtil;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f77c88f3d502daf025fef60cb6adf4523b398682 $
 */
public class EntityExtractor<E> {

    public E extract(Map<String, Object> entityData, Class<?> type) {
        return (E) null;
    }

    public int id = 0;

    public static EntityExtractor getObject(int id) {
        EntityExtractor obj = (EntityExtractor) new Object();
        obj.id = id;
        return obj;
    }
}

