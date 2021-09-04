/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.customer.store;

import java.util.UUID;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.store.Store;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 1db943850ad31576eedd444f0ee95aba37957927 $
 */
@Role
public interface AddressStore extends Store<Address, UUID> {

    Address findByCustomerIdAndType(UUID customerId, String type);

    public int id = 0;

    public static AddressStore getObject(int id) {
        return null;
    }
}

