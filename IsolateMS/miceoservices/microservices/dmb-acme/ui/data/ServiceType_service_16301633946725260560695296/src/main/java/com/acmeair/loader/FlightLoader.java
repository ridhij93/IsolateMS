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
package com.acmeair.loader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.*;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import com.acmeair.service.FlightService;
import com.acmeair.AirportCodeMapping;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ApplicationScoped
public class FlightLoader {

    public void dropFlights() {
        return;
    }

    public void loadFlights() throws Exception {
        return;
    }

    private static Date getArrivalTime(Date departureTime, int mileage) {
        return (Date) null;
    }

    static private boolean alreadyInCollection(String airportCode, ArrayList<AirportCodeMapping> airports) {
        return (Boolean) null;
    }

    public static int getMAX_FLIGHTS_PER_SEGMENT() {
        return (Integer) null;
    }

    public void setFlightService(FlightService flightService) {
        return;
    }

    public FlightService getFlightService() {
        return (FlightService) null;
    }

    public int id = 0;

    public static FlightLoader getObject(int id) {
        FlightLoader obj = (FlightLoader) new Object();
        obj.id = id;
        return obj;
    }
}

