/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.billing.model.stats;

import java.math.BigDecimal;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: c41c9027e5114f5de1c592e078003e527617fc51 $
 */
public class TurnoverStatEntry {

    public Integer getNumberOfOrders() {
        return (Integer) null;
    }

    public void setNumberOfOrders(Integer numberOfOrders) {
        return;
    }

    public BigDecimal getTotal() {
        return (BigDecimal) null;
    }

    public void setTotal(BigDecimal total) {
        return;
    }

    public int id = 0;

    public static TurnoverStatEntry getObject(int id) {
        TurnoverStatEntry obj = (TurnoverStatEntry) new Object();
        obj.id = id;
        return obj;
    }
}

