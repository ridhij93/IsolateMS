/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;

/**
 * @version $Id: 70b1c6ee2c1e912a51ba3302721cfbb70d618dad $
 */
public class PaymentOperationEventServer extends AbstractFilterableEvent implements Event {

    /**
     * Change when the serialization of this class changes.
     */
    private static final long serialVersionUID = -7272420077313879368L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

