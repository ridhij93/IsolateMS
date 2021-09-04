/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.store.rdbms.dbi;

import java.util.List;
import org.mayocat.model.Entity;
import org.mayocat.store.HasOrderedCollections;
import org.mayocat.store.InvalidMoveOperation;
import org.mayocat.store.rdbms.dbi.dao.util.CollectionUtil;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms1/moveentityinlistoperation/")
public class MoveEntityInListOperationWrapper<E extends Entity> {

    private static int maxId = 0;

    public static HashMap<Integer, MoveEntityInListOperationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "moveentityinlistoperation")
    public  @ResponseBody int MoveEntityInListOperation(@RequestParam int entitiesId, @RequestParam String fromSlug, @RequestParam String toSlug, @RequestParam int relativePositionId) {
    }
}

