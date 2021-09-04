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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 0a0f6d8362cd97ef1ccfbcf5382a3de05fdb2d2f $
 */
public class PaymentRequestBuilder {

    public PaymentRequestBuilder withStatus(PaymentStatus status) {
        return (PaymentRequestBuilder) null;
    }

    public PaymentRequestBuilder withNextAction(RequiredAction nextAction) {
        return (PaymentRequestBuilder) null;
    }

    public PaymentRequestBuilder withData(Map<String, Object> data) {
        return (PaymentRequestBuilder) null;
    }

    public PaymentRequestBuilder withRedirectionTarget(String target) {
        return (PaymentRequestBuilder) null;
    }

    public PaymentRequest build() {
        return (PaymentRequest) null;
    }

    public void setStatus(PaymentStatus status) {
        return;
    }

    public PaymentStatus getStatus() {
        return (PaymentStatus) null;
    }

    public void setNextAction(RequiredAction nextAction) {
        return;
    }

    public RequiredAction getNextAction() {
        return (RequiredAction) null;
    }

    public void setData(ImmutableMap<String, Object> data) {
        return;
    }

    public ImmutableMap<String, Object> getData() {
        return (ImmutableMap<String, Object>) null;
    }

    public void setRedirectionTarget(Optional<String> redirectionTarget) {
        return;
    }

    public Optional<String> getRedirectionTarget() {
        return (Optional<String>) null;
    }

    public int id = 0;

    public static PaymentRequestBuilder getObject(int id) {
        PaymentRequestBuilder obj = (PaymentRequestBuilder) new Object();
        obj.id = id;
        return obj;
    }
}

