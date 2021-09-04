/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.util;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a7f2ff62a50c6f8e4b271b68446ba30e00ece615 $
 */
public class StringUtil {

    /**
     * Transform a camelCase notation to a snake_case notation.
     *
     * @param string the string to snakify
     * @return the snakified string
     */
    public static String snakify(String string) {
        return (String) null;
    }

    public int id = 0;

    public static StringUtil getObject(int id) {
        StringUtil obj = (StringUtil) new Object();
        obj.id = id;
        return obj;
    }
}

