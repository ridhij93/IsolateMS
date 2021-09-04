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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Path("/config")
public class AcmeAirConfiguration {

    public AcmeAirConfiguration() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/acmeairconfigurationcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @GET
    @Path("/activeDataService")
    @Produces("application/json")
    public Response getActiveDataServiceInfo() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/getactivedataserviceinfocallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    /**
     *  Get runtime info.
     */
    @GET
    @Path("/runtime")
    @Produces("application/json")
    public String getRuntimeInfo() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/getruntimeinfocallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    @GET
    @Path("/countBookings")
    @Produces("application/json")
    public Response countBookings() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/countbookingscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/countCustomers")
    @Produces("application/json")
    public Response countCustomer() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/countcustomercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/countSessions")
    @Produces("application/json")
    public Response countCustomerSessions() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/countcustomersessionscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/countFlights")
    @Produces("application/json")
    public Response countFlights() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/countflightscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/countFlightSegments")
    @Produces("application/json")
    public Response countFlightSegments() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/countflightsegmentscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/countAirports")
    @Produces("application/json")
    public Response countAirports() {
        String uri = MicroserviceApplication.projectUri + "/ms3/acmeairconfiguration/countairportscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    public static void setLogger(Logger logger) {
        return;
    }

    public static Logger getLogger() {
        return (Logger) null;
    }

    public void setBs(BookingService bs) {
        return;
    }

    public BookingService getBs() {
        return (BookingService) null;
    }

    public void setCustomerService(CustomerService customerService) {
        return;
    }

    public CustomerService getCustomerService() {
        return (CustomerService) null;
    }

    public void setAuthService(AuthService authService) {
        return;
    }

    public AuthService getAuthService() {
        return (AuthService) null;
    }

    public void setFlightService(FlightService flightService) {
        return;
    }

    public FlightService getFlightService() {
        return (FlightService) null;
    }

    public int id = 0;

    public static AcmeAirConfiguration getObject(int id) {
        AcmeAirConfiguration obj = (AcmeAirConfiguration) new Object();
        obj.id = id;
        return obj;
    }
}

