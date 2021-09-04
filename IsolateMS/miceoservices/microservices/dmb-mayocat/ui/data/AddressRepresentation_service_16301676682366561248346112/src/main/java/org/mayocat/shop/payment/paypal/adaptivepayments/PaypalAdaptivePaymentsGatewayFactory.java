/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment.paypal.adaptivepayments;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.google.common.base.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Inject;
import org.mayocat.shop.payment.AbstractGatewayFactory;
import org.mayocat.shop.payment.GatewayFactory;
import org.mayocat.shop.payment.PaymentGateway;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: ad7d444036d2596f85dc524724dace63554a8f6d $
 */
@Component("paypaladaptivepayments")
public class PaypalAdaptivePaymentsGatewayFactory extends AbstractGatewayFactory implements GatewayFactory {

    @Override
    public String getId() {
        return (String) null;
    }

    @Override
    public PaymentGateway createGateway() {
        return (PaymentGateway) null;
    }

    public static String getID() {
        return (String) null;
    }

    public static String getCONFIG_FILE_NAME() {
        return (String) null;
    }

    public static String getTENANT_CONFIGURATION_FILENAME() {
        return (String) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setMapper(ObjectMapper mapper) {
        return;
    }

    public ObjectMapper getMapper() {
        return (ObjectMapper) null;
    }

    public int id = 0;

    public static PaypalAdaptivePaymentsGatewayFactory getObject(int id) {
        PaypalAdaptivePaymentsGatewayFactory obj = (PaypalAdaptivePaymentsGatewayFactory) new Object();
        obj.id = id;
        return obj;
    }
}

