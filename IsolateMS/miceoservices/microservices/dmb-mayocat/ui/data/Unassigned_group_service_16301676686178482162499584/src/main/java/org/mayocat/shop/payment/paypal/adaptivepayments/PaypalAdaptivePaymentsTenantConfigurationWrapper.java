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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: 1a33a0bc6004eb2f2bfbcb767301aea3865e8cb1 $
 */
@Controller
@RequestMapping("/ms5/paypaladaptivepaymentstenantconfiguration/")
public class PaypalAdaptivePaymentsTenantConfigurationWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaypalAdaptivePaymentsTenantConfigurationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paypaladaptivepaymentstenantconfiguration")
    public  @ResponseBody int PaypalAdaptivePaymentsTenantConfiguration() {
        PaypalAdaptivePaymentsTenantConfigurationServer newServerObj = new PaypalAdaptivePaymentsTenantConfigurationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

