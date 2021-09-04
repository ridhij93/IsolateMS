/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.checkout.internal;

import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.FluentIterable;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.ws.rs.core.MultivaluedMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;
import org.mayocat.shop.checkout.CheckoutRequest;
import org.mayocat.shop.customer.model.Address;
import org.mayocat.shop.customer.model.Customer;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: a8a5ef828ece19ab7b30c411448488bb01d44104 $
 */
public class CheckoutRequestBuilder {

    public CheckoutRequest build(final MultivaluedMap data) {
        return (CheckoutRequest) null;
    }

    private static String fullName(String firstName, String lastName) {
        return (String) null;
    }

    private static String getNonEmptyFieldValueOrAddToErrorMap(String field, MultivaluedMap data, CheckoutRequest request) {
        return (String) null;
    }

    private static boolean multimapContains(MultivaluedMap data, String field) {
        return (Boolean) null;
    }

    public int id = 0;

    public static CheckoutRequestBuilder getObject(int id) {
        CheckoutRequestBuilder obj = (CheckoutRequestBuilder) new Object();
        obj.id = id;
        return obj;
    }
}

