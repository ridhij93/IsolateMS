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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@ApplicationScoped
public class FlightServiceImplWrapper {

    // private final static Logger logger = Logger.getLogger(FlightService.class.getName());
    private static int maxId = 0;

    public static HashMap<Integer, FlightServiceImplServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "flightserviceimpl")
    public  @ResponseBody int FlightServiceImpl() {
        FlightServiceImplServer newServerObj = new FlightServiceImplServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // private final static Logger logger = Logger.getLogger(FlightService.class.getName());
}

