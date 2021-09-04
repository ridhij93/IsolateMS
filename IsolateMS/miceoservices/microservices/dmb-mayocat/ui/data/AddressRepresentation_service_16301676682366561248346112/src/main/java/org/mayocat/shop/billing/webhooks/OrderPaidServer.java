/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.webhooks;

import org.mayocat.webhooks.Hook;
import org.mayocat.webhooks.Webhook;
import org.xwiki.component.annotation.Component;

/**
 * @version $Id: c07b5e39c76be6c523f0b70378ce939418f9e705 $
 */
@Component(OrderPaid.getID())
public class OrderPaidServer implements Webhook {

    static final String ID = "order_paid";

    @Override
    public String getName() {
        return ID;
    }

    public static String getID() {
        return ID;
    }
}

