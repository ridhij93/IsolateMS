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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Index
public class ProductWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getslug")
    public @ResponseBody String getSlug(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getSlug();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gettitle")
    public @ResponseBody String getTitle(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getTitle();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getid")
    public @ResponseBody Integer getId(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getonshelf")
    public @ResponseBody Boolean getOnShelf(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        Boolean result = callerObj.getOnShelf();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getprice")
    public @ResponseBody BigDecimal getPrice(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getPrice();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gettaxes")
    public @ResponseBody Integer getTaxes(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        Map<String, String> result = callerObj.getTaxes();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getweight")
    public @ResponseBody BigDecimal getWeight(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getWeight();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getfeaturedimageid")
    public @ResponseBody Integer getFeaturedImageId(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        UUID result = callerObj.getFeaturedImageId();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getstock")
    public @ResponseBody Integer getStock(@RequestParam int callerId) {
        ProductServer callerObj = idObjMap.get(callerId);
        Integer result = callerObj.getStock();
        return result;
    }

    // //////////////////////////////////////////////
    private static int maxId = 0;

    public static HashMap<Integer, ProductServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "product")
    public  @ResponseBody int Product() {
        ProductServer newServerObj = new ProductServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "product")
    public  @ResponseBody int Product(@RequestParam int idId) {
        ProductServer newServerObj = new ProductServer(UUID.getObject(idId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // //////////////////////////////////////////////
}

