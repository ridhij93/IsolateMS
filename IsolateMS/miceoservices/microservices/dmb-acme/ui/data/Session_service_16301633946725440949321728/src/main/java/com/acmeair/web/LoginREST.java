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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Path("/login")
public class LoginREST {

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces("text/plain")
    public Response login(@FormParam("login") String login, @FormParam("password") String password) {
        String uri = MicroserviceApplication.projectUri + "/ms3/loginrest/login?callerId=" + this.id + "&login=login&password=password";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/logout")
    @Produces("text/plain")
    public Response logout(@QueryParam("login") String login, @CookieParam("acmeair_sessionid") String sessionid) {
        String uri = MicroserviceApplication.projectUri + "/ms3/loginrest/logout?callerId=" + this.id + "&login=login&sessionid=sessionid";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    public static void setSESSIONID_COOKIE_NAME(String SESSIONID_COOKIE_NAME) {
        return;
    }

    public static String getSESSIONID_COOKIE_NAME() {
        return (String) null;
    }

    public void setAuthService(AuthService authService) {
        return;
    }

    public AuthService getAuthService() {
        return (AuthService) null;
    }

    public void setCustomerService(CustomerService customerService) {
        return;
    }

    public CustomerService getCustomerService() {
        return (CustomerService) null;
    }

    public int id = 0;

    public static LoginREST getObject(int id) {
        LoginREST obj = (LoginREST) new Object();
        obj.id = id;
        return obj;
    }
}

