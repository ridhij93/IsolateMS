/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes.configuration;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
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
 * The rule that describe how a certain tax (for example VAT/sales tax)
 *
 * @version $Id: 9e647e604c2808ae96ba7d6b1464dbaa64560614 $
 */
@Controller
@RequestMapping("/ms1/taxrule/")
public class TaxRuleWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TaxRuleServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "taxrule")
    public  @ResponseBody int TaxRule() {
        TaxRuleServer newServerObj = new TaxRuleServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

