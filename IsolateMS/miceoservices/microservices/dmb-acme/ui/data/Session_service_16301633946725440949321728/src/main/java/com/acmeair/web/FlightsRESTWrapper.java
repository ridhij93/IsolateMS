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

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.acmeair.service.FlightService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Path("/flights")
public class FlightsRESTWrapper {

    // TODO:  Consider a pure GET implementation of this service, but maybe not much value due to infrequent similar searches
    @POST
    @Path("/queryflights")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "gettripflights")
    public @ResponseBody String getTripFlights(@RequestParam int callerId, @FormParam("fromAirport") @RequestParam String fromAirport, @FormParam("toAirport") @RequestParam String toAirport, @FormParam("fromDate") @RequestParam int fromDateId, @FormParam("returnDate") @RequestParam int returnDateId, @FormParam("oneWay") @RequestParam boolean oneWay) {
        FlightsRESTServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getTripFlights(fromAirport, toAirport, DateParam.getObject(fromDateId), DateParam.getObject(returnDateId), oneWay);
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, FlightsRESTServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "flightsrest")
    public  @ResponseBody int FlightsREST() {
        FlightsRESTServer newServerObj = new FlightsRESTServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

