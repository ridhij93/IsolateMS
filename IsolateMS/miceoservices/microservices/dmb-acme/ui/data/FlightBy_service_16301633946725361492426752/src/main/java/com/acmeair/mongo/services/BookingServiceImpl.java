package com.acmeair.mongo.services;

import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.bson.Document;
import com.acmeair.mongo.MongoConstants;
import com.acmeair.service.BookingService;
import com.acmeair.service.FlightService;
import com.acmeair.service.KeyGenerator;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
// import com.mongodb.async.client.*;
import com.acmeair.mongo.ConnectionManager;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ApplicationScoped
public class BookingServiceImpl implements BookingService, MongoConstants {

    // private final static Logger logger = Logger.getLogger(BookingService.class.getName());
    @PostConstruct
    public void initialization() {
        return;
    }

    public String bookFlight(String customerId, String flightId) {
        return (String) null;
    }

    @Override
    public String bookFlight(String customerId, String flightSegmentId, String flightId) {
        return (String) null;
    }

    @Override
    public String getBooking(String user, String bookingId) {
        return (String) null;
    }

    @Override
    public List<String> getBookingsByUser(String user) {
        return (List<String>) null;
    }

    @Override
    public void cancelBooking(String user, String bookingId) {
        return;
    }

    @Override
    public Long count() {
        return (Long) null;
    }

    @Override
    public void dropBookings() {
        return;
    }

    @Override
    public String getServiceType() {
        return (String) null;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public void setBooking(MongoCollection<Document> booking) {
        return;
    }

    public void setKeyGenerator(KeyGenerator keyGenerator) {
        return;
    }

    public KeyGenerator getKeyGenerator() {
        return (KeyGenerator) null;
    }

    public int id = 0;

    public static BookingServiceImpl getObject(int id) {
        BookingServiceImpl obj = (BookingServiceImpl) new Object();
        obj.id = id;
        return obj;
    }
}

