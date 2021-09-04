/**
 * ****************************************************************************
 *  Copyright (c) 2013 IBM Corp.
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
package com.acmeair.web;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;
import com.acmeair.service.AuthService;
import com.acmeair.service.CustomerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Path("/login")
public class LoginRESTWrapper {

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "login")
    public @ResponseBody Integer login(@RequestParam int callerId, @FormParam("login") @RequestParam String login, @FormParam("password") @RequestParam String password) {
        LoginRESTServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.login(login, password);
        return result.id;
    }

    @GET
    @Path("/logout")
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "logout")
    public @ResponseBody Integer logout(@RequestParam int callerId, @QueryParam("login") @RequestParam String login, @CookieParam("acmeair_sessionid") @RequestParam String sessionid) {
        LoginRESTServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.logout(login, sessionid);
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, LoginRESTServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "loginrest")
    public  @ResponseBody int LoginREST() {
        LoginRESTServer newServerObj = new LoginRESTServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

