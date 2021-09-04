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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 1a33a0bc6004eb2f2bfbcb767301aea3865e8cb1 $
 */
public class PaypalAdaptivePaymentsTenantConfiguration {

    public String getEmail() {
        return (String) null;
    }

    public void setEmail(String email) {
        return;
    }

    public int id = 0;

    public static PaypalAdaptivePaymentsTenantConfiguration getObject(int id) {
        PaypalAdaptivePaymentsTenantConfiguration obj = (PaypalAdaptivePaymentsTenantConfiguration) new Object();
        obj.id = id;
        return obj;
    }
}

