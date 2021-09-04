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
 * @version $Id: ad7d444036d2596f85dc524724dace63554a8f6d $
 */
@Component("paypaladaptivepayments")
public class PaypalAdaptivePaymentsGatewayFactoryWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PaypalAdaptivePaymentsGatewayFactoryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "paypaladaptivepaymentsgatewayfactory")
    public  @ResponseBody int PaypalAdaptivePaymentsGatewayFactory() {
        PaypalAdaptivePaymentsGatewayFactoryServer newServerObj = new PaypalAdaptivePaymentsGatewayFactoryServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

