/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.cms.pages.store.memory;

import java.util.List;
import org.mayocat.cms.pages.model.Page;
import org.mayocat.cms.pages.store.PageStore;
import org.mayocat.store.memory.BaseEntityMemoryStore;
import com.google.common.collect.FluentIterable;
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
 * In-memory implementation of {@link PageStore}.
 *
 * @version $Id: 11314d66d3c5383c51b8e16d06f6f81b9b09a308 $
 */
@Controller
@RequestMapping("/ms2/memorypagestore/")
public class MemoryPageStoreWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, MemoryPageStoreServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "memorypagestore")
    public  @ResponseBody int MemoryPageStore() {
        MemoryPageStoreServer newServerObj = new MemoryPageStoreServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

