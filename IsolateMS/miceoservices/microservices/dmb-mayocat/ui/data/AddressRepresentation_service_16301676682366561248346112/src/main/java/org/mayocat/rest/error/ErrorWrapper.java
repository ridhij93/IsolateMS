/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.rest.error;

import javax.ws.rs.core.Response;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * @version $Id: bff386ea3de699a783465c36a72d9344396f61d1 $
 */
@Controller
@RequestMapping("/ms2/error/")
public class ErrorWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ErrorServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public  @ResponseBody int Error(@RequestParam int statusId, @RequestParam String message) {
        ErrorServer newServerObj = new ErrorServer(Response.Status.getObject(statusId), message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public  @ResponseBody int Error(@RequestParam int statusId, @RequestParam int codeId, @RequestParam String message) {
        ErrorServer newServerObj = new ErrorServer(Response.Status.getObject(statusId), ErrorCode.getObject(codeId), message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "error")
    public  @ResponseBody int Error(@RequestParam int statusId, @RequestParam int codeId, @RequestParam String message, @RequestParam String developerMessage) {
        ErrorServer newServerObj = new ErrorServer(Response.Status.getObject(statusId), ErrorCode.getObject(codeId), message, developerMessage);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

