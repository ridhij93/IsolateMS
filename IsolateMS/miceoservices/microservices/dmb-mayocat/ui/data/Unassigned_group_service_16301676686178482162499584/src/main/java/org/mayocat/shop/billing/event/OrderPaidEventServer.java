/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;

/**
 * @version $Id: 1abf3613f508824e80d95230ab7df385bf3dbda7 $
 */
public class OrderPaidEventServer extends AbstractFilterableEvent implements Event {

    private static final long serialVersionUID = 2785944219455400735L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

