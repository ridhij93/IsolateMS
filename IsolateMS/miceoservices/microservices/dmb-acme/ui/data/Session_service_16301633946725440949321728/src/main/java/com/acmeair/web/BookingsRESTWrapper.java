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
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.acmeair.service.BookingService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Path("/bookings")
public class BookingsRESTWrapper {

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Path("/bookflights")
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "bookflights")
    public @ResponseBody Integer bookFlights(@RequestParam int callerId, @FormParam("userid") @RequestParam String userid, @FormParam("toFlightId") @RequestParam String toFlightId, @FormParam("toFlightSegId") @RequestParam String toFlightSegId, @FormParam("retFlightId") @RequestParam String retFlightId, @FormParam("retFlightSegId") @RequestParam String retFlightSegId, @FormParam("oneWayFlight") @RequestParam boolean oneWay) {
        BookingsRESTServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.bookFlights(userid, toFlightId, toFlightSegId, retFlightId, retFlightSegId, oneWay);
        return result.id;
    }

    @GET
    @Path("/byuser/{user}")
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "getbookingsbyuser")
    public @ResponseBody Integer getBookingsByUser(@RequestParam int callerId, @PathParam("user") @RequestParam String user) {
        BookingsRESTServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.getBookingsByUser(user);
        return result.id;
    }

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Path("/cancelbooking")
    @Produces("text/plain")
    @RequestMapping(method = RequestMethod.GET, value = "cancelbookingsbynumber")
    public @ResponseBody Integer cancelBookingsByNumber(@RequestParam int callerId, @FormParam("number") @RequestParam String number, @FormParam("userid") @RequestParam String userid) {
        BookingsRESTServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.cancelBookingsByNumber(number, userid);
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, BookingsRESTServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "bookingsrest")
    public  @ResponseBody int BookingsREST() {
        BookingsRESTServer newServerObj = new BookingsRESTServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

