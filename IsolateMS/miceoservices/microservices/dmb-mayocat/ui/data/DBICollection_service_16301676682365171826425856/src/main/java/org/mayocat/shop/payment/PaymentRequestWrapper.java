/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
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
 * @version $Id: e8987d6e35c490607a0b8f8f8be90647c00f1a54 $
 */
@Controller
@RequestMapping("/ms0/paymentrequest/")
public class PaymentRequestWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaymentRequestServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentrequest")
    public  @ResponseBody int PaymentRequest(@RequestParam int statusId, @RequestParam int nextActionId) {
        PaymentRequestServer newServerObj = new PaymentRequestServer(PaymentStatus.getObject(statusId), RequiredAction.getObject(nextActionId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "paymentrequest")
    public  @ResponseBody int PaymentRequest(@RequestParam int statusId, @RequestParam int nextActionId, @RequestParam int dataId) {
    }

    @RequestMapping(method = RequestMethod.GET, value = "paymentrequest")
    public  @ResponseBody int PaymentRequest(@RequestParam int statusId, @RequestParam int nextActionId, @RequestParam int dataId, @RequestParam int redirectionTargetId) {
    }
}

