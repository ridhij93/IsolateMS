package com.acmeair;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
// Not sure this is the right place for this class, or if we really need it.
@Controller
@RequestMapping("/ms2/airportcodemapping/")
public class AirportCodeMappingWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AirportCodeMappingServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "airportcodemapping")
    public  @ResponseBody int AirportCodeMapping() {
        AirportCodeMappingServer newServerObj = new AirportCodeMappingServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "airportcodemapping")
    public  @ResponseBody int AirportCodeMapping(@RequestParam String airportCode, @RequestParam String airportName) {
        AirportCodeMappingServer newServerObj = new AirportCodeMappingServer(airportCode, airportName);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

