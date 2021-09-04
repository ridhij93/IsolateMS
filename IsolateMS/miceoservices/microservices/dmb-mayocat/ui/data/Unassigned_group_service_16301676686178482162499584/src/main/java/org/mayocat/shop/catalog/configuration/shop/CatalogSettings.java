/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.configuration.shop;

import javax.validation.Valid;
import org.mayocat.configuration.ExposedSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CatalogSettings implements ExposedSettings {

    @JsonIgnore
    public ProductsSettings getProductsSettings() {
        return (ProductsSettings) null;
    }

    public CurrenciesSettings getCurrencies() {
        return (CurrenciesSettings) null;
    }

    @Override
    @JsonIgnore
    public String getKey() {
        return (String) null;
    }

    public void setCurrencies(CurrenciesSettings currencies) {
        return;
    }

    public void setProducts(ProductsSettings products) {
        return;
    }

    public ProductsSettings getProducts() {
        return (ProductsSettings) null;
    }

    public int id = 0;

    public static CatalogSettings getObject(int id) {
        CatalogSettings obj = (CatalogSettings) new Object();
        obj.id = id;
        return obj;
    }
}

