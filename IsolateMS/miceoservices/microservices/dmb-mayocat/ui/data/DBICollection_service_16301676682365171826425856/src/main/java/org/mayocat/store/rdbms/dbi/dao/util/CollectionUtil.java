/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi.dao.util;

import java.util.Collections;
import java.util.List;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 5b246420043d0292bd98f1c28c9853a0a25b3b86 $
 */
public class CollectionUtil {

    public static void move(List<?> collection, int indexToMoveFrom, int indexToMoveAt) {
        return;
    }

    public int id = 0;

    public static CollectionUtil getObject(int id) {
        CollectionUtil obj = (CollectionUtil) new Object();
        obj.id = id;
        return obj;
    }
}

