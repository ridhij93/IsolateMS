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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: e8987d6e35c490607a0b8f8f8be90647c00f1a54 $
 */
public class PaymentRequest {

    public PaymentRequest(PaymentStatus status, RequiredAction nextAction) {
        String uri = MicroserviceApplication.projectUri + "/ms0/paymentrequest/paymentrequest?callerId=" + this.id + "&statusId=status.id&nextActionId=nextAction.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PaymentRequest(PaymentStatus status, RequiredAction nextAction, ImmutableMap<String, Object> data) {
        String uri = MicroserviceApplication.projectUri + "/ms0/paymentrequest/paymentrequest?callerId=" + this.id + "&statusId=status.id&nextActionId=nextAction.id&dataId=data.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PaymentRequest(PaymentStatus status, RequiredAction nextAction, ImmutableMap<String, Object> data, Optional<String> redirectionTarget) {
        String uri = MicroserviceApplication.projectUri + "/ms0/paymentrequest/paymentrequest?callerId=" + this.id + "&statusId=status.id&nextActionId=nextAction.id&dataId=data.id&redirectionTargetId=redirectionTarget.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public PaymentStatus getStatus() {
        return (PaymentStatus) null;
    }

    public RequiredAction getNextAction() {
        return (RequiredAction) null;
    }

    public ImmutableMap<String, Object> getData() {
        return (ImmutableMap<String, Object>) null;
    }

    public Optional<String> getRedirectionTarget() {
        return (Optional<String>) null;
    }

    public int id = 0;

    public static PaymentRequest getObject(int id) {
        PaymentRequest obj = (PaymentRequest) new Object();
        obj.id = id;
        return obj;
    }
}

