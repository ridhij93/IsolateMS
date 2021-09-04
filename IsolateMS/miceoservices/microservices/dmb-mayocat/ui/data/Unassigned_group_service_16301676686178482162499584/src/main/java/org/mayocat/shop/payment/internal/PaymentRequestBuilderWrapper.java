/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.internal;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.mayocat.shop.payment.PaymentRequest;
import org.mayocat.shop.payment.PaymentStatus;
import org.mayocat.shop.payment.RequiredAction;
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
 * @version $Id: 0a0f6d8362cd97ef1ccfbcf5382a3de05fdb2d2f $
 */
@Controller
@RequestMapping("/ms5/paymentrequestbuilder/")
public class PaymentRequestBuilderWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaymentRequestBuilderServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentrequestbuilder")
    public  @ResponseBody int PaymentRequestBuilder() {
        PaymentRequestBuilderServer newServerObj = new PaymentRequestBuilderServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

