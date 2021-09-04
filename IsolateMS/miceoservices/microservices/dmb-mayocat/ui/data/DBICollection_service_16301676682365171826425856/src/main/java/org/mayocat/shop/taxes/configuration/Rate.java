/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes.configuration;

import java.math.BigDecimal;
import com.google.common.base.Optional;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * A tax rate, optionally named
 *
 * @version $Id: ebc5202170f0b363a71b17c3ba596f888f6451f1 $
 */
public class Rate {

    public BigDecimal getValue() {
        return (BigDecimal) null;
    }

    public Optional<String> getName() {
        return (Optional<String>) null;
    }

    public String getId() {
        return (String) null;
    }

    public void setValue(BigDecimal value) {
        return;
    }

    public void setName(Optional<String> name) {
        return;
    }

    public void setId(String id) {
        return;
    }

    public int id = 0;

    public static Rate getObject(int id) {
        Rate obj = (Rate) new Object();
        obj.id = id;
        return obj;
    }
}

