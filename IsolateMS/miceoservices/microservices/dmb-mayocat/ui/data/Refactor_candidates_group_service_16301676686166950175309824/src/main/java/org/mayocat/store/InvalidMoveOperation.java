/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 15e0e4ae75c4066ed9d91d8feec90d42c3f97659 $
 */
public class InvalidMoveOperation extends InvalidOperation {

    public InvalidMoveOperation() {
        String uri = MicroserviceApplication.projectUri + "/ms2/invalidmoveoperation/invalidmoveoperationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public InvalidMoveOperation(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms2/invalidmoveoperation/invalidmoveoperation?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static InvalidMoveOperation getObject(int id) {
        InvalidMoveOperation obj = (InvalidMoveOperation) new Object();
        obj.id = id;
        return obj;
    }
}

