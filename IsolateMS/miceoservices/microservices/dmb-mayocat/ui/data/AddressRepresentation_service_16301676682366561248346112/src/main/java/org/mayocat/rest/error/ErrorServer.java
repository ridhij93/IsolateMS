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

/**
 * @version $Id: bff386ea3de699a783465c36a72d9344396f61d1 $
 */
public class ErrorServer {

    @JsonIgnore
    private Response.Status status;

    @JsonIgnore
    private ErrorCode errorCode;

    private String message;

    @JsonInclude(JsonInclude.getInclude().NON_NULL)
    private String developerMessage;

    public ErrorServer(Response.Status status, String message) {
        this(status, null, message, null);
    }

    public ErrorServer(Response.Status status, ErrorCode code, String message) {
        this(status, code, message, null);
    }

    public ErrorServer(Response.Status status, ErrorCode code, String message, String developerMessage) {
        this.status = status;
        this.errorCode = code;
        this.message = message;
        this.developerMessage = developerMessage;
    }

    @JsonInclude
    public Integer getStatus() {
        return status.getStatusCode();
    }

    @JsonInclude(JsonInclude.getInclude().NON_NULL)
    public Integer getCode() {
        if (errorCode == null) {
            return null;
        }
        return errorCode.getCode();
    }

    @JsonInclude(JsonInclude.getInclude().NON_NULL)
    public String getIdentifier() {
        if (errorCode == null) {
            return null;
        }
        return errorCode.getIdentifier();
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(Response.Status status) {
        this.status = status;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }
}

