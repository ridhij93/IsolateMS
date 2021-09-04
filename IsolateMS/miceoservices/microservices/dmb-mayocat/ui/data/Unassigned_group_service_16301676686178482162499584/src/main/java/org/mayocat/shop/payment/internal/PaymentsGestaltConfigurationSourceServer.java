/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.internal;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
import org.mayocat.shop.payment.PaymentsSettings;
import org.xwiki.component.annotation.Component;

/**
 * @version $Id: e7524c43c7363d973e43f14f67cedde0e8a5b0b8 $
 */
@Component("payments")
public class PaymentsGestaltConfigurationSourceServer implements GestaltConfigurationSource {

    @Inject
    private PaymentsSettings paymentsSettings;

    @Override
    public Object get() {
        return paymentsSettings;
    }

    public void setPaymentsSettings(PaymentsSettings paymentsSettings) {
        this.paymentsSettings = paymentsSettings;
    }

    public PaymentsSettings getPaymentsSettings() {
        return paymentsSettings;
    }
}

