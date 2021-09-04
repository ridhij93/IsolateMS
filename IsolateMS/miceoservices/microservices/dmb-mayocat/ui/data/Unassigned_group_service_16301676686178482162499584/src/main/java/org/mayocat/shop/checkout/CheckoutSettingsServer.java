/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout;

import javax.validation.Valid;
import org.mayocat.configuration.Configurable;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mayocat.configuration.ExposedSettings;

/**
 * @version $Id: 2e59c680818e941b37c962ae10932d3c212010de $
 */
public class CheckoutSettingsServer implements ExposedSettings {

    @Valid
    @JsonProperty
    private Configurable<Boolean> guestCheckout = new Configurable<>(Boolean.TRUE);

    public Configurable<Boolean> isGuestCheckoutEnabled() {
        return guestCheckout;
    }

    @Override
    public String getKey() {
        return "checkout";
    }

    public void setGuestCheckout(Configurable<Boolean> guestCheckout) {
        this.guestCheckout = guestCheckout;
    }

    public Configurable<Boolean> getGuestCheckout() {
        return guestCheckout;
    }
}

