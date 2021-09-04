/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.taxes;

import java.io.Serializable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Represents a price with taxes. Right now only VAT is supported.
 *
 * This is a container, immutable object.
 *
 * PriceWithTaxes objects holds strictly no information about how the taxes were calculated (what rate, what country,
 * etc.), they just hold the inclusive, exclusive and tax amounts.
 *
 * @version $Id: 26fa00d4a56ad7575b5af83cdf9bf0f2bedbf7d1 $
 */
public class PriceWithTaxes implements Serializable {

    @JsonCreator
    public PriceWithTaxes(@JsonProperty("incl") BigDecimal incl, @JsonProperty("excl") BigDecimal excl, @JsonProperty("vat") BigDecimal vat) {
        String uri = MicroserviceApplication.projectUri + "/ms0/pricewithtaxes/pricewithtaxes?callerId=" + this.id + "&incl=incl&excl=excl&vat=vat";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public BigDecimal excl() {
        return (BigDecimal) null;
    }

    public BigDecimal incl() {
        return (BigDecimal) null;
    }

    public BigDecimal vat() {
        return (BigDecimal) null;
    }

    // 
    public PriceWithTaxes add(PriceWithTaxes price) {
        return (PriceWithTaxes) null;
    }

    public PriceWithTaxes multiply(Long quantity) {
        return (PriceWithTaxes) null;
    }

    // 
    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public BigDecimal getIncl() {
        String uri = MicroserviceApplication.projectUri + "/ms0/pricewithtaxes/getinclcallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public BigDecimal getExcl() {
        String uri = MicroserviceApplication.projectUri + "/ms0/pricewithtaxes/getexclcallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public BigDecimal getVat() {
        String uri = MicroserviceApplication.projectUri + "/ms0/pricewithtaxes/getvatcallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public int id = 0;

    public static PriceWithTaxes getObject(int id) {
        PriceWithTaxes obj = (PriceWithTaxes) new Object();
        obj.id = id;
        return obj;
    }
}

