/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mayocat.configuration.SiteSettings;
import org.mayocat.mail.Mail;
import org.mayocat.mail.MailException;
import org.mayocat.mail.MailService;
import org.mayocat.shop.billing.event.OrderPaidEvent;
import org.mayocat.shop.billing.model.Order;
import org.mayocat.shop.billing.store.OrderStore;
import org.mayocat.shop.payment.event.PaymentOperationEvent;
import org.mayocat.shop.payment.model.PaymentOperation;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.observation.EventListener;
import org.xwiki.observation.ObservationManager;
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
 * An event listener that respond to payment operation events.
 *
 * When a payment operation with result "CAPTURED" is received, this listener updates the status of the concerned
 * order.
 *
 * @version $Id: 927faafa76556f630b135354f9b6c5b864d55624 $
 */
@Component("billingPaymentOperationListener")
public class PaymentOperationEventListenerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaymentOperationEventListenerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paymentoperationeventlistener")
    public  @ResponseBody int PaymentOperationEventListener() {
        PaymentOperationEventListenerServer newServerObj = new PaymentOperationEventListenerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

