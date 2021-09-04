/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 991a70ed414be63594cecf2f8e8961ebaefae602 $
 */
@Role
public interface CartInSessionConverter {

    CartInSession convertToCartInSession(CartContents cartContents);

    CartContents loadFromCartInSession(CartInSession cartInSession);

    public int id = 0;

    public static CartInSessionConverter getObject(int id) {
        return null;
    }
}

