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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Path("/customer")
public class CustomerREST {

    private boolean validate(String customerid) {
        return (Boolean) null;
    }

    @GET
    @Path("/byid/{custid}")
    @Produces("text/plain")
    public Response getCustomer(@CookieParam("sessionid") String sessionid, @PathParam("custid") String customerid) {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerrest/getcustomer?callerId=" + this.id + "&sessionid=sessionid&customerid=customerid";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @POST
    @Path("/byid/{custid}")
    @Produces("text/plain")
    public /* Customer */
    Response putCustomer(@CookieParam("sessionid") String sessionid, CustomerInfo customer) {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerrest/putcustomer?callerId=" + this.id + "&sessionid=sessionid&customerId=customer.id";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        /* Customer */
        Response result = /* Customer */
        Response.getObject(resultTemp);
        return result;
    }

    public void setCustomerService(CustomerService customerService) {
        return;
    }

    public CustomerService getCustomerService() {
        return (CustomerService) null;
    }

    public void setRequest(HttpServletRequest request) {
        return;
    }

    public HttpServletRequest getRequest() {
        return (HttpServletRequest) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public int id = 0;

    public static CustomerREST getObject(int id) {
        CustomerREST obj = (CustomerREST) new Object();
        obj.id = id;
        return obj;
    }
}

