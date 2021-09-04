/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.store;

import java.util.UUID;
import org.mayocat.shop.customer.model.Customer;
import org.mayocat.store.EntityStore;
import org.mayocat.store.Store;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: d11daf9a2adfc646deba45c9e9b4fededc4d197e $
 */
@Role
public interface CustomerStore extends Store<Customer, UUID>, EntityStore {

    Customer findBySlug(String slug);

    Customer findByUserId(UUID userId);

    public int id = 0;

    public static CustomerStore getObject(int id) {
        return null;
    }
}

