/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.memory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.validation.Valid;
import org.mayocat.model.Child;
import org.mayocat.model.Entity;
import org.mayocat.model.Identifiable;
import org.mayocat.model.Slug;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.Store;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version $Id: ef18ce797d573853cb79a635279e79f74664842e $
 */
@Controller
@RequestMapping("/ms5/baseentitymemorystore/")
public class BaseEntityMemoryStoreWrapper<T extends Identifiable> {

    private static int maxId = 0;

    public static HashMap<Integer, BaseEntityMemoryStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "baseentitymemorystore")
    public  @ResponseBody int BaseEntityMemoryStore() {
        BaseEntityMemoryStoreServer newServerObj = new BaseEntityMemoryStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

