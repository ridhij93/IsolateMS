/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.accounts;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.accounts.meta.TenantEntity;
import org.mayocat.meta.EntityMeta;
import org.mayocat.Module;
import org.mayocat.accounts.meta.UserEntity;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 62dbc44939ff76df75b6e31872b2ecf8758bcf89 $
 */
public class AccountsModule implements Module {

    @Override
    public String getName() {
        return (String) null;
    }

    @Override
    public List<EntityMeta> getEntities() {
        return (List<EntityMeta>) null;
    }

    public int id = 0;

    public static AccountsModule getObject(int id) {
        AccountsModule obj = (AccountsModule) new Object();
        obj.id = id;
        return obj;
    }
}

