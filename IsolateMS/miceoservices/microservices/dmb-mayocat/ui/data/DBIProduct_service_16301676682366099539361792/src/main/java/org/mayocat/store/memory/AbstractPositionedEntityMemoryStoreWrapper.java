/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.memory;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.validation.Valid;
import org.mayocat.model.Identifiable;
import org.mayocat.model.Slug;
import org.mayocat.store.EntityAlreadyExistsException;
import org.mayocat.store.EntityDoesNotExistException;
import org.mayocat.store.InvalidEntityException;
import org.mayocat.store.Store;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Ordering;
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
 * Abstract memory store for entities that maintain a relative order in between their instances.
 *
 * @version $Id: 2dd3877b3a05467951d0752a6ffa328dace56829 $
 */
@Controller
@RequestMapping("/ms1/abstractpositionedentitymemorystore/")
public abstract class AbstractPositionedEntityMemoryStoreWrapper<T extends Identifiable, P extends PositionedEntity<T>> {

    private static int maxId = 0;

    public static HashMap<Integer, AbstractPositionedEntityMemoryStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "abstractpositionedentitymemorystore")
    public  @ResponseBody int AbstractPositionedEntityMemoryStore() {
        AbstractPositionedEntityMemoryStoreServer newServerObj = new AbstractPositionedEntityMemoryStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

