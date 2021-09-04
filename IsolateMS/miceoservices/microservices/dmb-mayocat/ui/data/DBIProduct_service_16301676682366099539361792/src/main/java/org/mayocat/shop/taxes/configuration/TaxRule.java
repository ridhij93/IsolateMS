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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * The rule that describe how a certain tax (for example VAT/sales tax)
 *
 * @version $Id: 9e647e604c2808ae96ba7d6b1464dbaa64560614 $
 */
public class TaxRule {

    public Optional<String> getName() {
        return (Optional<String>) null;
    }

    public Boolean isManagedGeographically() {
        return (Boolean) null;
    }

    public BigDecimal getDefaultRate() {
        return (BigDecimal) null;
    }

    public List<Rate> getOtherRates() {
        return (List<Rate>) null;
    }

    public List<AreaRates> getAreas() {
        return (List<AreaRates>) null;
    }

    public void setName(Optional<String> name) {
        return;
    }

    public void setManagedGeographically(Boolean managedGeographically) {
        return;
    }

    public Boolean getManagedGeographically() {
        return (Boolean) null;
    }

    public void setDefaultRate(BigDecimal defaultRate) {
        return;
    }

    public void setOtherRates(List<Rate> otherRates) {
        return;
    }

    public void setAreas(List<AreaRates> areas) {
        return;
    }

    public int id = 0;

    public static TaxRule getObject(int id) {
        TaxRule obj = (TaxRule) new Object();
        obj.id = id;
        return obj;
    }
}

