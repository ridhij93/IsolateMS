/**
 * ****************************************************************************
 *  Copyright (c) 2015 IBM Corp.
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
package com.acmeair.mongo.services;

import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.bson.Document;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.acmeair.AirportCodeMapping;
import com.acmeair.mongo.MongoConstants;
import com.acmeair.service.FlightService;
import com.acmeair.service.KeyGenerator;
import com.mongodb.BasicDBObject;
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
public class FlightServiceImpl extends FlightService implements MongoConstants {

    // private final static Logger logger = Logger.getLogger(FlightService.class.getName());
    @PostConstruct
    public void initialization() {
        return;
    }

    @Override
    public Long countFlights() {
        return (Long) null;
    }

    @Override
    public Long countFlightSegments() {
        return (Long) null;
    }

    @Override
    public Long countAirports() {
        return (Long) null;
    }

    protected String getFlight(String flightId, String segmentId) {
        return (String) null;
    }

    @Override
    protected String getFlightSegment(String fromAirport, String toAirport) {
        return (String) null;
    }

    @Override
    protected List<String> getFlightBySegment(String segment, Date deptDate) {
        return (List<String>) null;
    }

    @Override
    public void storeAirportMapping(AirportCodeMapping mapping) {
        return;
    }

    @Override
    public AirportCodeMapping createAirportCodeMapping(String airportCode, String airportName) {
        return (AirportCodeMapping) null;
    }

    @Override
    public void createNewFlight(String flightSegmentId, Date scheduledDepartureTime, Date scheduledArrivalTime, int firstClassBaseCost, int economyClassBaseCost, int numFirstClassSeats, int numEconomyClassSeats, String airplaneTypeId) {
        return;
    }

    @Override
    public void storeFlightSegment(String flightSeg) {
        return;
    }

    @Override
    public void storeFlightSegment(String flightName, String origPort, String destPort, int miles) {
        return;
    }

    @Override
    public void dropFlights() {
        return;
    }

    public void setFlight(MongoCollection<Document> flight) {
        return;
    }

    public void setFlightSegment(MongoCollection<Document> flightSegment) {
        return;
    }

    public void setAirportCodeMapping(MongoCollection<Document> airportCodeMapping) {
        return;
    }

    public MongoCollection<Document> getAirportCodeMapping() {
        return (MongoCollection<Document>) null;
    }

    public void setKeyGenerator(KeyGenerator keyGenerator) {
        return;
    }

    public KeyGenerator getKeyGenerator() {
        return (KeyGenerator) null;
    }

    public int id = 0;

    public static FlightServiceImpl getObject(int id) {
        FlightServiceImpl obj = (FlightServiceImpl) new Object();
        obj.id = id;
        return obj;
    }
}

