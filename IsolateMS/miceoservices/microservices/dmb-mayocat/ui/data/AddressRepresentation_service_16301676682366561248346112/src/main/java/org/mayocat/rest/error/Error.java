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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id: bff386ea3de699a783465c36a72d9344396f61d1 $
 */
public class Error {

    public Error(Response.Status status, String message) {
        String uri = MicroserviceApplication.projectUri + "/ms2/error/error?callerId=" + this.id + "&statusId=status.id&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Error(Response.Status status, ErrorCode code, String message) {
        String uri = MicroserviceApplication.projectUri + "/ms2/error/error?callerId=" + this.id + "&statusId=status.id&codeId=code.id&message=message";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public Error(Response.Status status, ErrorCode code, String message, String developerMessage) {
        String uri = MicroserviceApplication.projectUri + "/ms2/error/error?callerId=" + this.id + "&statusId=status.id&codeId=code.id&message=message&developerMessage=developerMessage";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @JsonInclude
    public Integer getStatus() {
        return (Integer) null;
    }

    @JsonInclude(JsonInclude.getInclude().NON_NULL)
    public Integer getCode() {
        return (Integer) null;
    }

    @JsonInclude(JsonInclude.getInclude().NON_NULL)
    public String getIdentifier() {
        return (String) null;
    }

    public String getMessage() {
        return (String) null;
    }

    public void setStatus(Response.Status status) {
        return;
    }

    public void setErrorCode(ErrorCode errorCode) {
        return;
    }

    public ErrorCode getErrorCode() {
        return (ErrorCode) null;
    }

    public void setMessage(String message) {
        return;
    }

    public void setDeveloperMessage(String developerMessage) {
        return;
    }

    public String getDeveloperMessage() {
        return (String) null;
    }

    public int id = 0;

    public static Error getObject(int id) {
        Error obj = (Error) new Object();
        obj.id = id;
        return obj;
    }
}

