/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.front.util;

import org.apache.commons.lang3.StringEscapeUtils;
import com.google.common.base.Strings;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 76de1f464f20a161a37f5f0a9a25ab375f6a271a $
 */
public class ContextUtils {

    public static String safeString(String string) {
        return (String) null;
    }

    public static String safeHtml(String string) {
        return (String) null;
    }

    public int id = 0;

    public static ContextUtils getObject(int id) {
        ContextUtils obj = (ContextUtils) new Object();
        obj.id = id;
        return obj;
    }
}

