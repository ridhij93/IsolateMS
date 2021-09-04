/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.paypal.adaptivepayments;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @version $Id: 1a33a0bc6004eb2f2bfbcb767301aea3865e8cb1 $
 */
public class PaypalAdaptivePaymentsTenantConfigurationServer {

    @Pattern(regexp = "^(([^@\\s]+)@((?:[-a-zA-Z0-9]+\\.)+[a-zA-Z]{2,}))?$", message = "Not a valid email")
    @NotNull
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

