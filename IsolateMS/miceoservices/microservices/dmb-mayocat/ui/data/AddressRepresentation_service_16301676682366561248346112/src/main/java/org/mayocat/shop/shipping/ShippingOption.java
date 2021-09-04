/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping;

import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.UUID;
import org.mayocat.shop.taxes.PriceWithTaxes;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 23de59116d282a5d503e2e16f407c8874ddb5a38 $
 */
public class ShippingOption implements Serializable {

    public ShippingOption(UUID carrierId, String title, PriceWithTaxes price) {
        String uri = MicroserviceApplication.projectUri + "/ms2/shippingoption/shippingoption?callerId=" + this.id + "&carrierIdId=carrierId.id&title=title&priceId=price.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getTitle() {
        return (String) null;
    }

    public PriceWithTaxes getPrice() {
        return (PriceWithTaxes) null;
    }

    public UUID getCarrierId() {
        String uri = MicroserviceApplication.projectUri + "/ms2/shippingoption/getcarrieridcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    public void setCarrierId(UUID carrierId) {
        return;
    }

    public void setTitle(String title) {
        return;
    }

    public void setPrice(PriceWithTaxes price) {
        return;
    }

    public int id = 0;

    public static ShippingOption getObject(int id) {
        ShippingOption obj = (ShippingOption) new Object();
        obj.id = id;
        return obj;
    }
}

