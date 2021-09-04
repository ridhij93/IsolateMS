/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.meta;

import org.mayocat.meta.EntityMeta;
import org.mayocat.shop.billing.model.Order;

/**
 * @version $Id: eddef23e4986738c31f927a845ba31aa96627580 $
 */
public class OrderEntityServer implements EntityMeta {

    public static final String ID = "order";

    public static final String PATH = "orders";

    @Override
    public String getEntityName() {
        return ID;
    }

    @Override
    public Class getEntityClass() {
        return Order.class;
    }

    public static String getID() {
        return ID;
    }

    public static String getPATH() {
        return PATH;
    }
}

