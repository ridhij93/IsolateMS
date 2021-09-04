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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Path("/bookings")
public class BookingsREST {

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Path("/bookflights")
    @Produces("text/plain")
    public /*BookingInfo*/
    Response bookFlights(@FormParam("userid") String userid, @FormParam("toFlightId") String toFlightId, @FormParam("toFlightSegId") String toFlightSegId, @FormParam("retFlightId") String retFlightId, @FormParam("retFlightSegId") String retFlightSegId, @FormParam("oneWayFlight") boolean oneWay) {
        String uri = MicroserviceApplication.projectUri + "/ms3/bookingsrest/bookflights?callerId=" + this.id + "&userid=userid&toFlightId=toFlightId&toFlightSegId=toFlightSegId&retFlightId=retFlightId&retFlightSegId=retFlightSegId&oneWay=oneWay";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        /*BookingInfo*/
        Response result = /*BookingInfo*/
        Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/byuser/{user}")
    @Produces("text/plain")
    public Response getBookingsByUser(@PathParam("user") String user) {
        String uri = MicroserviceApplication.projectUri + "/ms3/bookingsrest/getbookingsbyuser?callerId=" + this.id + "&user=user";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @Path("/cancelbooking")
    @Produces("text/plain")
    public Response cancelBookingsByNumber(@FormParam("number") String number, @FormParam("userid") String userid) {
        String uri = MicroserviceApplication.projectUri + "/ms3/bookingsrest/cancelbookingsbynumber?callerId=" + this.id + "&number=number&userid=userid";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    public void setBs(BookingService bs) {
        return;
    }

    public BookingService getBs() {
        return (BookingService) null;
    }

    public int id = 0;

    public static BookingsREST getObject(int id) {
        BookingsREST obj = (BookingsREST) new Object();
        obj.id = id;
        return obj;
    }
}

