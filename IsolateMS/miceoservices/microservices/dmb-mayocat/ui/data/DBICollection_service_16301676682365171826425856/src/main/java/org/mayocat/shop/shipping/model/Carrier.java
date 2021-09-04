/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.shipping.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.mayocat.model.Identifiable;
import org.mayocat.shop.shipping.Strategy;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: f50cf4c3806a23c197299a4264c564d9517af2d2 $
 */
public class Carrier implements Identifiable {

    public UUID getId() {
        return (UUID) null;
    }

    public void setId(UUID id) {
        return;
    }

    public UUID getTenantId() {
        return (UUID) null;
    }

    public void setTenantId(UUID tenantId) {
        return;
    }

    public List<String> getDestinations() {
        return (List<String>) null;
    }

    public void setDestinations(List<String> destinations) {
        return;
    }

    public Strategy getStrategy() {
        return (Strategy) null;
    }

    public void setStrategy(Strategy strategy) {
        return;
    }

    public String getTitle() {
        return (String) null;
    }

    public void setTitle(String title) {
        return;
    }

    public String getDescription() {
        return (String) null;
    }

    public void setDescription(String description) {
        return;
    }

    public Integer getMinimumDays() {
        return (Integer) null;
    }

    public void setMinimumDays(Integer minimumDays) {
        return;
    }

    public Integer getMaximumDays() {
        return (Integer) null;
    }

    public void setMaximumDays(Integer maximumDays) {
        return;
    }

    public List<CarrierRule> getRules() {
        return (List<CarrierRule>) null;
    }

    public void addRule(CarrierRule rule) {
        return;
    }

    public BigDecimal getPerShipping() {
        return (BigDecimal) null;
    }

    public void setPerShipping(BigDecimal perShipping) {
        return;
    }

    public BigDecimal getPerItem() {
        return (BigDecimal) null;
    }

    public void setPerItem(BigDecimal perItem) {
        return;
    }

    public BigDecimal getPerAdditionalUnit() {
        return (BigDecimal) null;
    }

    public void setPerAdditionalUnit(BigDecimal perAdditionalUnit) {
        return;
    }

    public BigDecimal getVatRate() {
        return (BigDecimal) null;
    }

    public void setVatRate(BigDecimal vatRate) {
        return;
    }

    public Integer getPosition() {
        return (Integer) null;
    }

    public void setPosition(Integer position) {
        return;
    }

    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    public void setRules(List<CarrierRule> rules) {
        return;
    }

    public int id = 0;

    public static Carrier getObject(int id) {
        Carrier obj = (Carrier) new Object();
        obj.id = id;
        return obj;
    }
}

