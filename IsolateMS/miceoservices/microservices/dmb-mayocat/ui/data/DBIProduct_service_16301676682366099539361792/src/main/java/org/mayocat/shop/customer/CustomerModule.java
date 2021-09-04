/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer;

import java.util.ArrayList;
import java.util.List;
import org.mayocat.Module;
import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.customer.meta.CustomerEntity;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a6f459ada0097bb089e02d6786392b68a9621265 $
 */
public class CustomerModule implements Module {

    @Override
    public String getName() {
        return (String) null;
    }

    @Override
    public List<EntityMeta> getEntities() {
        return (List<EntityMeta>) null;
    }

    public int id = 0;

    public static CustomerModule getObject(int id) {
        CustomerModule obj = (CustomerModule) new Object();
        obj.id = id;
        return obj;
    }
}

