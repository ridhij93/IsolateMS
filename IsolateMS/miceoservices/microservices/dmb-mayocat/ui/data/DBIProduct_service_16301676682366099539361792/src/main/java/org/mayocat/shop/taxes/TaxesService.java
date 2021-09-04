/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes;

import java.math.BigDecimal;
import org.xwiki.component.annotation.Role;

/**
 * @version $Id: 67ecdf4e8bc8c615a28f6c83d2264cd4285316a4 $
 */
@Role
public interface TaxesService {

    BigDecimal getVatRate(Taxable taxable);

    PriceWithTaxes getPriceWithTaxes(Taxable taxable);

    public int id = 0;

    public static TaxesService getObject(int id) {
        return null;
    }
}

