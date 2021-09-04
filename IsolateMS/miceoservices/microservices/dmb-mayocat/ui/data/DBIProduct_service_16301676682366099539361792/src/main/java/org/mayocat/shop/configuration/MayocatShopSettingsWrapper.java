/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.mayocat.cms.news.NewsSettings;
import org.mayocat.configuration.AbstractSettings;
import org.mayocat.configuration.DevelopmentEnvironmentSettings;
import org.mayocat.configuration.general.GeneralSettings;
import org.mayocat.configuration.theme.ThemeSettings;
import org.mayocat.shop.catalog.configuration.shop.CatalogSettings;
import org.mayocat.shop.checkout.CheckoutSettings;
import org.mayocat.shop.invoicing.InvoicingSettings;
import org.mayocat.shop.payment.PaymentsSettings;
import org.mayocat.shop.shipping.configuration.ShippingSettings;
import org.mayocat.shop.taxes.configuration.TaxesSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.db.DataSourceFactory;
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
 * @version $Id: e00109c906b83f9367c899ef113328eb5844badd $
 */
@Controller
@RequestMapping("/ms1/mayocatshopsettings/")
public class MayocatShopSettingsWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MayocatShopSettingsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "mayocatshopsettings")
    public  @ResponseBody int MayocatShopSettings() {
        MayocatShopSettingsServer newServerObj = new MayocatShopSettingsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

