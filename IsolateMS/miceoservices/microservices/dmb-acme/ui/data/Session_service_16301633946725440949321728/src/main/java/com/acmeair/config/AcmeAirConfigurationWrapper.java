package com.acmeair.config;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonBuilderFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.acmeair.service.AuthService;
import com.acmeair.service.BookingService;
import com.acmeair.service.CustomerService;
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

@Path("/config")
public class AcmeAirConfigurationWrapper {

    @GET
    @Path("/activeDataService")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "getactivedataserviceinfo")
    public @ResponseBody Integer getActiveDataServiceInfo(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.getActiveDataServiceInfo();
        return result.id;
    }

    /**
     *  Get runtime info.
     */
    @GET
    @Path("/runtime")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "getruntimeinfo")
    public @ResponseBody String getRuntimeInfo(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getRuntimeInfo();
        return result;
    }

    @GET
    @Path("/countBookings")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "countbookings")
    public @ResponseBody Integer countBookings(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.countBookings();
        return result.id;
    }

    @GET
    @Path("/countCustomers")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "countcustomer")
    public @ResponseBody Integer countCustomer(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.countCustomer();
        return result.id;
    }

    @GET
    @Path("/countSessions")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "countcustomersessions")
    public @ResponseBody Integer countCustomerSessions(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.countCustomerSessions();
        return result.id;
    }

    @GET
    @Path("/countFlights")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "countflights")
    public @ResponseBody Integer countFlights(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.countFlights();
        return result.id;
    }

    @GET
    @Path("/countFlightSegments")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "countflightsegments")
    public @ResponseBody Integer countFlightSegments(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.countFlightSegments();
        return result.id;
    }

    @GET
    @Path("/countAirports")
    @Produces("application/json")
    @RequestMapping(method = RequestMethod.GET, value = "countairports")
    public @ResponseBody Integer countAirports(@RequestParam int callerId) {
        AcmeAirConfigurationServer callerObj = idObjMap.get(callerId);
        Response result = callerObj.countAirports();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, AcmeAirConfigurationServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "acmeairconfiguration")
    public  @ResponseBody int AcmeAirConfiguration() {
        AcmeAirConfigurationServer newServerObj = new AcmeAirConfigurationServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

