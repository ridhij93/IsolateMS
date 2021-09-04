/**
 * ****************************************************************************
 *  Copyright (c) 2013-2015 IBM Corp.
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
package com.acmeair.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.acmeair.AirportCodeMapping;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public abstract class FlightService {

    protected FlightService() {
        String uri = MicroserviceApplication.projectUri + "/ms2/flightservice/flightservicecallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getFlightByFlightId(String flightId, String flightSegment) {
        return (String) null;
    }

    protected abstract String getFlight(String flightId, String flightSegment) {
        return (String) null;
    }

    public List<String> getFlightByAirportsAndDepartureDate(String fromAirport, String toAirport, Date deptDate) {
        return (List<String>) null;
    }

    // NOTE:  This is not cached
    public List<String> getFlightByAirports(String fromAirport, String toAirport) {
        return (List<String>) null;
    }

    protected abstract String getFlightSegment(String fromAirport, String toAirport) {
        return (String) null;
    }

    protected abstract List<String> getFlightBySegment(String segment, Date deptDate) {
        return (List<String>) null;
    }

    public abstract void storeAirportMapping(AirportCodeMapping mapping) {
        return;
    }

    public abstract AirportCodeMapping createAirportCodeMapping(String airportCode, String airportName) {
        return (AirportCodeMapping) null;
    }

    public abstract void createNewFlight(String flightSegmentId, Date scheduledDepartureTime, Date scheduledArrivalTime, int firstClassBaseCost, int economyClassBaseCost, int numFirstClassSeats, int numEconomyClassSeats, String airplaneTypeId) {
        return;
    }

    public abstract void storeFlightSegment(String flightSeg) {
        return;
    }

    public abstract void storeFlightSegment(String flightName, String origPort, String destPort, int miles) {
        return;
    }

    public abstract Long countFlightSegments() {
        return (Long) null;
    }

    public abstract Long countFlights() {
        return (Long) null;
    }

    public abstract Long countAirports() {
        return (Long) null;
    }

    public abstract void dropFlights() {
        return;
    }

    public void setLogger(Logger logger) {
        return;
    }

    public Logger getLogger() {
        return (Logger) null;
    }

    public static void setUseFlightDataRelatedCaching(Boolean useFlightDataRelatedCaching) {
        return;
    }

    public static Boolean getUseFlightDataRelatedCaching() {
        return (Boolean) null;
    }

    public static void setAcmeairDir(String acmeairDir) {
        return;
    }

    public static String getAcmeairDir() {
        return (String) null;
    }

    public static void setOriginAndDestPortToSegmentCache(ConcurrentHashMap<String, String> originAndDestPortToSegmentCache) {
        return;
    }

    public static ConcurrentHashMap<String, String> getOriginAndDestPortToSegmentCache() {
        return (ConcurrentHashMap<String, String>) null;
    }

    public static void setFlightSegmentAndDataToFlightCache(ConcurrentHashMap<String, List<String>> flightSegmentAndDataToFlightCache) {
        return;
    }

    public static ConcurrentHashMap<String, List<String>> getFlightSegmentAndDataToFlightCache() {
        return (ConcurrentHashMap<String, List<String>>) null;
    }

    public static void setFlightPKtoFlightCache(ConcurrentHashMap<String, String> flightPKtoFlightCache) {
        return;
    }

    public static ConcurrentHashMap<String, String> getFlightPKtoFlightCache() {
        return (ConcurrentHashMap<String, String>) null;
    }

    public int id = 0;

    public static FlightService getObject(int id) {
        FlightService obj = (FlightService) new Object();
        obj.id = id;
        return obj;
    }
}

