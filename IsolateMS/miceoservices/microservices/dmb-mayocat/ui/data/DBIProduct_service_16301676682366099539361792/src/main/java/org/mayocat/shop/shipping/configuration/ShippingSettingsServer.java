/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.configuration;

import org.mayocat.configuration.Configurable;
import org.mayocat.configuration.ExposedSettings;
import org.mayocat.shop.shipping.Strategy;

/**
 * @version $Id: 539f66a1e4628f333560ee4360a3f10ae55f4cbc $
 */
public class ShippingSettingsServer implements ExposedSettings {

    private Configurable<Strategy> strategy = new Configurable<>(Strategy.getNONE());

    public String getKey() {
        return "shipping";
    }

    public Configurable<Strategy> getStrategy() {
        return strategy;
    }

    public void setStrategy(Configurable<Strategy> strategy) {
        this.strategy = strategy;
    }
}

