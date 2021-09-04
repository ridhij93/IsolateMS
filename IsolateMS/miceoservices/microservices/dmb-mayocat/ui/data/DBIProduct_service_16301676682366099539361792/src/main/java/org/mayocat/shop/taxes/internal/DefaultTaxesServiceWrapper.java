/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes.internal;

import java.math.BigDecimal;
import javax.inject.Inject;
import org.mayocat.configuration.ConfigurationService;
import org.mayocat.shop.catalog.model.Purchasable;
import org.mayocat.shop.taxes.PriceWithTaxes;
import org.mayocat.shop.taxes.Taxable;
import org.mayocat.shop.taxes.TaxesService;
import org.mayocat.shop.taxes.configuration.Rate;
import org.mayocat.shop.taxes.configuration.TaxRule;
import org.mayocat.shop.taxes.configuration.TaxesSettings;
import org.xwiki.component.annotation.Component;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
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
 * @version $Id: 273f1cf04c926402dd0f503f29896e353eeb576c $
 */
@Component
public class DefaultTaxesServiceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, DefaultTaxesServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "defaulttaxesservice")
    public  @ResponseBody int DefaultTaxesService() {
        DefaultTaxesServiceServer newServerObj = new DefaultTaxesServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

