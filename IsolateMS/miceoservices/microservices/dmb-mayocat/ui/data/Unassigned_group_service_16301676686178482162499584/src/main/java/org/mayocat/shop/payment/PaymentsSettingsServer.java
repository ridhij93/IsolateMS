/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.google.common.collect.Lists;
import java.util.List;
import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;

/**
 * @version $Id: 778640435ec9979a8a73e39b9c08eb7f07e4bad8 $
 */
public class PaymentsSettingsServer implements ExposedSettings {

    @Override
    public String getKey() {
        return "payments";
    }

    private Configurable<List<String>> gateways = new Configurable<List<String>>(Lists.newArrayList("paypaladaptivepayments"));

    public Configurable<List<String>> getGateways() {
        return gateways;
    }

    public void setGateways(Configurable<List<String>> gateways) {
        this.gateways = gateways;
    }
}

