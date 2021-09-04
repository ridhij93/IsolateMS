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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 273f1cf04c926402dd0f503f29896e353eeb576c $
 */
@Component
public class DefaultTaxesService implements TaxesService {

    @Override
    public BigDecimal getVatRate(Taxable taxable) {
        return (BigDecimal) null;
    }

    @Override
    public PriceWithTaxes getPriceWithTaxes(Taxable taxable) {
        return (PriceWithTaxes) null;
    }

    private Optional<Rate> getRateForId(final String id) {
        return (Optional<Rate>) null;
    }

    private TaxesSettings getTaxesSettings() {
        return (TaxesSettings) null;
    }

    public void setConfigurationService(ConfigurationService configurationService) {
        return;
    }

    public ConfigurationService getConfigurationService() {
        return (ConfigurationService) null;
    }

    public int id = 0;

    public static DefaultTaxesService getObject(int id) {
        DefaultTaxesService obj = (DefaultTaxesService) new Object();
        obj.id = id;
        return obj;
    }
}

