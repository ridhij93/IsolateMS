/*
 * Copyright (c) 2012, Mayocat <hello@mayocat.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mayocat.search;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SearchEngineException extends Exception {

    public SearchEngineException() {
        String uri = MicroserviceApplication.projectUri + "/ms0/searchengineexception/searchengineexceptioncallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public SearchEngineException(String message) {
        String uri = MicroserviceApplication.projectUri + "/ms0/searchengineexception/searchengineexception?callerId=" + this.id + "&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public SearchEngineException(Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms0/searchengineexception/searchengineexception?callerId=" + this.id + "&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public SearchEngineException(String message, Throwable cause) {
        String uri = MicroserviceApplication.projectUri + "/ms0/searchengineexception/searchengineexception?callerId=" + this.id + "&message=message&causeId=cause.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static SearchEngineException getObject(int id) {
        SearchEngineException obj = (SearchEngineException) new Object();
        obj.id = id;
        return obj;
    }
}

