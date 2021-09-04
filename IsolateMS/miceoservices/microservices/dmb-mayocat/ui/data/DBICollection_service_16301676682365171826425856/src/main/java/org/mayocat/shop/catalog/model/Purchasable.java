/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import org.mayocat.model.Association;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.Identifiable;
import org.mayocat.model.Owned;
import com.google.common.base.Optional;

/**
 * @version $Id: 78e0a623d9895ee63695ad5f43a13ee4fe09a110 $
 */
public interface Purchasable extends Identifiable, Serializable, HasFeaturedImage, Owned {

    String getTitle();

    String getDescription();

    BigDecimal getUnitPrice();

    Optional<BigDecimal> getActualUnitPrice();

    Optional<BigDecimal> getActualWeight();

    Optional<Association<Purchasable>> getParent();

    public int id = 0;

    public static Purchasable getObject(int id) {
        return null;
    }
}

