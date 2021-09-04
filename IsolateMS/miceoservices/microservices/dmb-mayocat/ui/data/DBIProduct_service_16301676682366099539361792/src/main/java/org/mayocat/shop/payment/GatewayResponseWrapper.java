/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import java.util.Map;
import org.mayocat.shop.payment.model.PaymentOperation;
import com.google.common.collect.Maps;
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
 * Represents the response returned by {@link PaymentGateway} operations.
 *
 * @version $Id: 6744b5ccacd357dc117353396018676d48e38e6d $
 */
@Controller
@RequestMapping("/ms1/gatewayresponse/")
public final class GatewayResponseWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, GatewayResponseServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "gatewayresponse")
    public  @ResponseBody int GatewayResponse(@RequestParam boolean isSuccessful, @RequestParam int operationId) {
        GatewayResponseServer newServerObj = new GatewayResponseServer(isSuccessful, PaymentOperation.getObject(operationId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

