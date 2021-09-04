/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.model;

import java.math.BigDecimal;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 21504499ccbc2f6c83ab952311ff0671a35dc7cf $
 */
public class CarrierRule {

    public BigDecimal getUpToValue() {
        return (BigDecimal) null;
    }

    public void setUpToValue(BigDecimal upToValue) {
        return;
    }

    public BigDecimal getPrice() {
        return (BigDecimal) null;
    }

    public void setPrice(BigDecimal price) {
        return;
    }

    public int id = 0;

    public static CarrierRule getObject(int id) {
        CarrierRule obj = (CarrierRule) new Object();
        obj.id = id;
        return obj;
    }
}

