/**
 * ****************************************************************************
 *  Copyright (c) 2013-2015 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * *****************************************************************************
 */
package com.acmeair.service;

import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public abstract class AuthService {

    // TODO: Do I really need to create a JSONObject here or just return a Json string?
    public JSONObject validateSession(String sessionid) {
        return (JSONObject) null;
    }

    protected abstract String getSession(String sessionid) {
        return (String) null;
    }

    protected abstract void removeSession(String sessionJson) {
        return;
    }

    // TODO: Do I really need to create a JSONObject here or just return a Json string?
    // TODO: Maybe simplify as Moss did, but need to change node.js version first
    public JSONObject createSession(String customerId) {
        return (JSONObject) null;
    }

    protected abstract String createSession(String sessionId, String customerId, Date creation, Date expiration) {
        return (String) null;
    }

    public abstract void invalidateSession(String sessionid) {
        return;
    }

    public abstract Long countSessions() {
        return (Long) null;
    }

    public abstract void dropSessions() {
        return;
    }

    public static int getDAYS_TO_ALLOW_SESSION() {
        return (Integer) null;
    }

    public void setKeyGenerator(KeyGenerator keyGenerator) {
        return;
    }

    public KeyGenerator getKeyGenerator() {
        return (KeyGenerator) null;
    }

    public int id = 0;

    public static AuthService getObject(int id) {
        AuthService obj = (AuthService) new Object();
        obj.id = id;
        return obj;
    }
}

