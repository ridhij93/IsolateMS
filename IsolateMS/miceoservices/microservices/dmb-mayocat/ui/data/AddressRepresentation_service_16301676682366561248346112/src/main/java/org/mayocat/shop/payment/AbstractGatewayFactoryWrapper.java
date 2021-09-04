/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import java.io.File;
import javax.inject.Inject;
import org.mayocat.configuration.general.FilesSettings;
import org.mayocat.context.WebContext;
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
 * @version $Id: db3a364a1976cd413adc903862851be623fc8d0c $
 */
@Controller
@RequestMapping("/ms2/abstractgatewayfactory/")
public abstract class AbstractGatewayFactoryWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractGatewayFactoryServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractgatewayfactory")
    public  @ResponseBody int AbstractGatewayFactory() {
        AbstractGatewayFactoryServer newServerObj = new AbstractGatewayFactoryServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

