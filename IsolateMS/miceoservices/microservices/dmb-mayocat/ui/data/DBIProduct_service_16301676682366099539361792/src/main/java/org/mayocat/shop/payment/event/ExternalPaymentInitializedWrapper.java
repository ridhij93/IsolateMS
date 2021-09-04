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
 * @version $Id: 5eef57fbd653c776476e752256e0f2057a45dbcf $
 */
@Controller
@RequestMapping("/ms1/externalpaymentinitialized/")
public class ExternalPaymentInitializedWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ExternalPaymentInitializedServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "externalpaymentinitialized")
    public  @ResponseBody int ExternalPaymentInitialized() {
        ExternalPaymentInitializedServer newServerObj = new ExternalPaymentInitializedServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

