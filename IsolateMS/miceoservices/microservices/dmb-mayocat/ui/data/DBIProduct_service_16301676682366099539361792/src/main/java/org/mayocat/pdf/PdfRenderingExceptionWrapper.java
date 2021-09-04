/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.pdf;

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
 * @version $Id: 7bb191b962bb8e61fe8258b9363ca5533983eadb $
 */
@Controller
@RequestMapping("/ms1/pdfrenderingexception/")
public class PdfRenderingExceptionWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PdfRenderingExceptionServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pdfrenderingexception")
    public  @ResponseBody int PdfRenderingException() {
        PdfRenderingExceptionServer newServerObj = new PdfRenderingExceptionServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "pdfrenderingexception")
    public  @ResponseBody int PdfRenderingException(@RequestParam String message) {
        PdfRenderingExceptionServer newServerObj = new PdfRenderingExceptionServer(message);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "pdfrenderingexception")
    public  @ResponseBody int PdfRenderingException(@RequestParam String message, @RequestParam int causeId) {
        PdfRenderingExceptionServer newServerObj = new PdfRenderingExceptionServer(message, Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "pdfrenderingexception")
    public  @ResponseBody int PdfRenderingException(@RequestParam int causeId) {
        PdfRenderingExceptionServer newServerObj = new PdfRenderingExceptionServer(Throwable.getObject(causeId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "pdfrenderingexception")
    public  @ResponseBody int PdfRenderingException(@RequestParam String message, @RequestParam int causeId, @RequestParam boolean enableSuppression, @RequestParam boolean writableStackTrace) {
        PdfRenderingExceptionServer newServerObj = new PdfRenderingExceptionServer(message, Throwable.getObject(causeId), enableSuppression, writableStackTrace);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

