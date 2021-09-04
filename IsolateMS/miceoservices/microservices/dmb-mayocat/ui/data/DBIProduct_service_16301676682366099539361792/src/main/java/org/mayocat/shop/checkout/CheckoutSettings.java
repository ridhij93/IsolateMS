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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 2e59c680818e941b37c962ae10932d3c212010de $
 */
public class CheckoutSettings implements ExposedSettings {

    public Configurable<Boolean> isGuestCheckoutEnabled() {
        return (Configurable<Boolean>) null;
    }

    @Override
    public String getKey() {
        return (String) null;
    }

    public void setGuestCheckout(Configurable<Boolean> guestCheckout) {
        return;
    }

    public Configurable<Boolean> getGuestCheckout() {
        return (Configurable<Boolean>) null;
    }

    public int id = 0;

    public static CheckoutSettings getObject(int id) {
        CheckoutSettings obj = (CheckoutSettings) new Object();
        obj.id = id;
        return obj;
    }
}

