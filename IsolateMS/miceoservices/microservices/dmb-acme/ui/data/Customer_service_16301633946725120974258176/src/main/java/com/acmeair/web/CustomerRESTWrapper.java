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

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import com.acmeair.service.CustomerService;
import com.acmeair.service.FlightService;
import com.acmeair.web.dto.CustomerInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Path("/customer")
public class CustomerRESTWrapper {

    @GET
    @Path("/byid/{custid}")
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "getcustomer")
    public @ResponseBody Integer getCustomer(@RequestParam int callerId, @CookieParam("sessionid") @RequestParam String sessionid, @PathParam("custid") @RequestParam String customerid) {
        CustomerRESTServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.getCustomer(sessionid, customerid);
        return result.id;
    }

    @POST
    @Path("/byid/{custid}")
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "putcustomer")
    public @ResponseBody Integer putCustomer(@RequestParam int callerId, @CookieParam("sessionid") @RequestParam String sessionid, @RequestParam int customerId) {
        CustomerRESTServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.putCustomer(sessionid, CustomerInfo.getObject(customerId));
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, CustomerRESTServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customerrest")
    public  @ResponseBody int CustomerREST() {
        CustomerRESTServer newServerObj = new CustomerRESTServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

