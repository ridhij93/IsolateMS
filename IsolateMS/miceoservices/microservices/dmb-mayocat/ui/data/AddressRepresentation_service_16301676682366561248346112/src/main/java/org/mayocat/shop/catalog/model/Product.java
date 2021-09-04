/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.shop.catalog.model;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.mayocat.model.AddonGroup;
import org.mayocat.model.Association;
import org.mayocat.model.Child;
import org.mayocat.model.Entity;
import org.mayocat.model.HasAddons;
import org.mayocat.model.HasFeaturedImage;
import org.mayocat.model.HasModel;
import org.mayocat.model.HasType;
import org.mayocat.model.Localized;
import org.mayocat.model.annotation.DoNotIndex;
import org.mayocat.model.annotation.Index;
import org.mayocat.model.annotation.LocalizedField;
import org.mayocat.shop.taxes.Taxable;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Index
public class Product implements Entity, HasAddons, HasModel, HasFeaturedImage, Taxable, Localized, HasType, Child {

    public Product() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/productcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Product(UUID id) {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/product?callerId=" + this.id + "&idId=id.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public UUID getTenantId() {
        return (UUID) null;
    }

    public void setTenantId(UUID tenantId) {
        return;
    }

    public String getSlug() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/getslugcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setSlug(String slug) {
        return;
    }

    public String getTitle() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/gettitlecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
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

    public UUID getId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/getidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setId(UUID id) {
        return;
    }

    public Boolean getOnShelf() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/getonshelfcallerId=" + this.id + "";
        Boolean resultTemp = new RestTemplate().getForObject(uri, Boolean.class);
        Boolean result = resultTemp;
        return result;
    }

    public void setOnShelf(Boolean onShelf) {
        return;
    }

    public BigDecimal getPrice() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/getpricecallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public BigDecimal getUnitPrice() {
        return (BigDecimal) null;
    }

    public void setPrice(BigDecimal price) {
        return;
    }

    public Optional<BigDecimal> getActualUnitPrice() {
        return (Optional<BigDecimal>) null;
    }

    public Map<String, String> getTaxes() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/gettaxescallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Map<String, String> result = (Map<String, String>) new Object();
        return result;
    }

    public void setTaxes(Map<String, String> taxes) {
        return;
    }

    public Optional<String> getVatRateId() {
        return (Optional<String>) null;
    }

    public void setVatRateId(String vatRateId) {
        return;
    }

    public BigDecimal getWeight() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/getweightcallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public void setWeight(BigDecimal weight) {
        return;
    }

    public Optional<BigDecimal> getActualWeight() {
        return (Optional<BigDecimal>) null;
    }

    @Override
    public Association<Map<String, AddonGroup>> getAddons() {
        return (Association<Map<String, AddonGroup>>) null;
    }

    @Override
    public void setAddons(Map<String, AddonGroup> addons) {
        return;
    }

    public Association<Collection> getFeaturedCollection() {
        return (Association<Collection>) null;
    }

    public void setFeaturedCollection(Collection featuredCollection) {
        return;
    }

    public Association<List<Collection>> getCollections() {
        return (Association<List<Collection>>) null;
    }

    public void setCollections(List<Collection> collections) {
        return;
    }

    public void setModel(String model) {
        return;
    }

    public Optional<String> getModel() {
        return (Optional<String>) null;
    }

    public UUID getFeaturedImageId() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/getfeaturedimageidcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        UUID result = UUID.getObject(resultTemp);
        return result;
    }

    public void setFeaturedImageId(UUID featuredImageId) {
        return;
    }

    public Integer getStock() {
        String uri = MicroserviceApplication.projectUri + "/ms1/product/getstockcallerId=" + this.id + "";
        Integer resultTemp = new RestTemplate().getForObject(uri, Integer.class);
        Integer result = resultTemp;
        return result;
    }

    public void setStock(Integer stock) {
        return;
    }

    public Date getCreationDate() {
        return (Date) null;
    }

    public void setCreationDate(Date creationDate) {
        return;
    }

    public void setLocalizedVersions(Map<Locale, Map<String, Object>> versions) {
        return;
    }

    public Map<Locale, Map<String, Object>> getLocalizedVersions() {
        return (Map<Locale, Map<String, Object>>) null;
    }

    public Optional<String> getType() {
        return (Optional<String>) null;
    }

    public void setType(String type) {
        return;
    }

    public List<UUID> getFeatures() {
        return (List<UUID>) null;
    }

    public void setFeatures(List<UUID> features) {
        return;
    }

    public boolean isVirtual() {
        return (Boolean) null;
    }

    public void setVirtual(boolean virtual) {
        return;
    }

    public UUID getParentId() {
        return (UUID) null;
    }

    public void setParentId(UUID parentId) {
        return;
    }

    public void setParent(@Nullable Purchasable purchasable) {
        return;
    }

    @Override
    public Optional<Association<Purchasable>> getParent() {
        return (Optional<Association<Purchasable>>) null;
    }

    // //////////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public static String getVAT() {
        return (String) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public boolean getVirtual() {
        return (Boolean) null;
    }

    public int id = 0;

    public static Product getObject(int id) {
        Product obj = (Product) new Object();
        obj.id = id;
        return obj;
    }
}

