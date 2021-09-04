/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.event;

import org.xwiki.observation.event.AbstractFilterableEvent;
import org.xwiki.observation.event.Event;
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
 * @version $Id: 70b1c6ee2c1e912a51ba3302721cfbb70d618dad $
 */
@Controller
@RequestMapping("/ms5/paymentoperationevent/")
public class PaymentOperationEventWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaymentOperationEventServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentoperationevent")
    public  @ResponseBody int PaymentOperationEvent() {
        PaymentOperationEventServer newServerObj = new PaymentOperationEventServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

