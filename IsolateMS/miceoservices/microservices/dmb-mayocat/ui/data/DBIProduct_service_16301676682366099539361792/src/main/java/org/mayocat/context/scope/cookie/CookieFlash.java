/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.context.scope.cookie;

import org.mayocat.context.scope.Flash;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Cookie based implementation of the {@link org.mayocat.context.scope.Flash} session.
 *
 * @version $Id: d224696e3e426e71a24aa1d4d1cfc27af57437c1 $
 */
public class CookieFlash extends CookieSession implements Flash {

    public void consume() {
        return;
    }

    public boolean isConsumed() {
        return (Boolean) null;
    }

    public void setIsConsumed(boolean isConsumed) {
        return;
    }

    public boolean getIsConsumed() {
        return (Boolean) null;
    }

    public int id = 0;

    public static CookieFlash getObject(int id) {
        CookieFlash obj = (CookieFlash) new Object();
        obj.id = id;
        return obj;
    }
}

