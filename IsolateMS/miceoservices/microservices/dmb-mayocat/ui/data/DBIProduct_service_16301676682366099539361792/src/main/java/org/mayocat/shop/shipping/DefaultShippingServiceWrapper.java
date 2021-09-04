/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.inject.Inject;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.shop.catalog.model.Purchasable;
import org.mayocat.shop.shipping.configuration.ShippingSettings;
import org.mayocat.shop.shipping.model.Carrier;
import org.mayocat.shop.shipping.store.CarrierStore;
import org.mayocat.shop.taxes.PriceWithTaxes;
import org.slf4j.Logger;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentManager;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.io.Resources;
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
 * @version $Id: a7505eb07faf2b287fb671d811eff42b36d837b2 $
 */
@Component
public class DefaultShippingServiceWrapper {

    static class Destination {

        private String name;

        private String code;
    }

    private static int maxId = 0;

    public static HashMap<Integer, DefaultShippingServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaultshippingservice")
    public  @ResponseBody int DefaultShippingService() {
        DefaultShippingServiceServer newServerObj = new DefaultShippingServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

