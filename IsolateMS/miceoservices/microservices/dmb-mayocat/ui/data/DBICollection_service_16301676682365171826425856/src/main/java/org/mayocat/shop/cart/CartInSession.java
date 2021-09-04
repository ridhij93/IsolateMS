/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.cart;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import org.mayocat.shop.shipping.ShippingOption;
import org.mayocat.shop.taxes.Taxable;
import com.google.common.collect.Maps;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: 24ae9bce25b834a858bc7e270794f57fa955725f $
 *
 * A serialization size optimized version of {@link CartContents}. We need this since cookie size is limited in
 * browsers, so we just can't serialize the whole purchasables (products, etc.).
 */
public class CartInSession implements Serializable {

    public static class IdAndType implements Serializable {

        private UUID id;

        private String type;

        private IdAndType(UUID id, String type) {
            String uri = MicroserviceApplication.projectUri + "/ms5/idandtype/idandtype?callerId=" + this.id + "&idId=id.id&type=type";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }

        public UUID getId() {
            return (UUID) null;
        }

        public String getType() {
            return (String) null;
        }
    }

    public CartInSession(CartContents cartContents) {
        String uri = MicroserviceApplication.projectUri + "/ms0/cartinsession/cartinsession?callerId=" + this.id + "&cartContentsId=cartContents.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Map<IdAndType, Long> getItems() {
        return (Map<IdAndType, Long>) null;
    }

    public String getCurrency() {
        return (String) null;
    }

    public ShippingOption getSelectedOption() {
        return (ShippingOption) null;
    }

    public void setItems(Map<IdAndType, Long> items) {
        return;
    }

    public void setCurrency(String currency) {
        return;
    }

    public void setSelectedOption(ShippingOption selectedOption) {
        return;
    }

    public int id = 0;

    public static CartInSession getObject(int id) {
        CartInSession obj = (CartInSession) new Object();
        obj.id = id;
        return obj;
    }
}

