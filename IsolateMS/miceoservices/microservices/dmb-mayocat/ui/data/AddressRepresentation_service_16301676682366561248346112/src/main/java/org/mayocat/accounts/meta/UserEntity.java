/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts.meta;

import org.mayocat.accounts.model.User;
import org.mayocat.meta.EntityMeta;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 93f68d17d36d51fe8de31d02b768073a7423ee06 $
 */
public class UserEntity implements EntityMeta {

    @Override
    public String getEntityName() {
        return (String) null;
    }

    @Override
    public Class getEntityClass() {
        return (Class) null;
    }

    public static String getID() {
        return (String) null;
    }

    public static String getPATH() {
        return (String) null;
    }

    public int id = 0;

    public static UserEntity getObject(int id) {
        UserEntity obj = (UserEntity) new Object();
        obj.id = id;
        return obj;
    }
}

