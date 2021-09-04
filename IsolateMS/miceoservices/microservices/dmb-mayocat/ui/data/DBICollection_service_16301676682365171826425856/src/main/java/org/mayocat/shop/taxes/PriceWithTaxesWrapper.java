/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes;

import java.io.Serializable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
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
 * Represents a price with taxes. Right now only VAT is supported.
 *
 * This is a container, immutable object.
 *
 * PriceWithTaxes objects holds strictly no information about how the taxes were calculated (what rate, what country,
 * etc.), they just hold the inclusive, exclusive and tax amounts.
 *
 * @version $Id: 26fa00d4a56ad7575b5af83cdf9bf0f2bedbf7d1 $
 */
@Controller
@RequestMapping("/ms0/pricewithtaxes/")
public class PriceWithTaxesWrapper {

    // 
    // 
    @RequestMapping(method = RequestMethod.GET, value = "getincl")
    public @ResponseBody BigDecimal getIncl(@RequestParam int callerId) {
        PriceWithTaxesServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getIncl();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getexcl")
    public @ResponseBody BigDecimal getExcl(@RequestParam int callerId) {
        PriceWithTaxesServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getExcl();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getvat")
    public @ResponseBody BigDecimal getVat(@RequestParam int callerId) {
        PriceWithTaxesServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getVat();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, PriceWithTaxesServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pricewithtaxes")
    public  @ResponseBody int PriceWithTaxes(@JsonProperty("incl") @RequestParam BigDecimal incl, @JsonProperty("excl") @RequestParam BigDecimal excl, @JsonProperty("vat") @RequestParam BigDecimal vat) {
        PriceWithTaxesServer newServerObj = new PriceWithTaxesServer(incl, excl, vat);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // 
    // 
}

