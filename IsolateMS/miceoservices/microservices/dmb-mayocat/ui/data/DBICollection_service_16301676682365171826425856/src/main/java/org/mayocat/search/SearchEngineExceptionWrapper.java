/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search;

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
@RequestMapping("/ms0/searchengineexception/")
public class SearchEngineExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, SearchEngineExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "searchengineexception")
    public  @ResponseBody int SearchEngineException() {
        SearchEngineExceptionServer newServerObj = new SearchEngineExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "searchengineexception")
    public  @ResponseBody int SearchEngineException(@RequestParam String message) {
        SearchEngineExceptionServer newServerObj = new SearchEngineExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "searchengineexception")
    public  @ResponseBody int SearchEngineException(@RequestParam int causeId) {
        SearchEngineExceptionServer newServerObj = new SearchEngineExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "searchengineexception")
    public  @ResponseBody int SearchEngineException(@RequestParam String message, @RequestParam int causeId) {
        SearchEngineExceptionServer newServerObj = new SearchEngineExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

