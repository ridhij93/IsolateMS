/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.model;

import java.util.Map;
import java.util.UUID;
import org.mayocat.model.Identifiable;
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
 * @version $Id: 54a418c155cb8a37bf5f08b65fbbf07f1ac3f015 $
 */
@Controller
@RequestMapping("/ms1/paymentoperation/")
public class PaymentOperationWrapper {

    public enum Result {

        INITIALIZED,
        AUTHORIZED,
        CAPTURED,
        CANCELLED,
        REFUSED,
        FAILED,
        REFUND
    }

    private static int maxId = 0;

    public static HashMap<Integer, PaymentOperationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentoperation")
    public  @ResponseBody int PaymentOperation() {
        PaymentOperationServer newServerObj = new PaymentOperationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

