/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes.configuration;

import javax.inject.Inject;
import org.mayocat.configuration.GestaltConfigurationSource;
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
 * @version $Id: cfa4cea04b47d980f0e4b689e6c957148b43dfca $
 */
@Component("taxes")
public class TaxesGestaltConfigurationSourceWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TaxesGestaltConfigurationSourceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "taxesgestaltconfigurationsource")
    public  @ResponseBody int TaxesGestaltConfigurationSource() {
        TaxesGestaltConfigurationSourceServer newServerObj = new TaxesGestaltConfigurationSourceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

