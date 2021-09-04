package com.acmeair;

import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

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
public class AirportCodeMapping {

    public AirportCodeMapping() {
        String uri = MicroserviceApplication.projectUri + "/ms2/airportcodemapping/airportcodemappingcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public AirportCodeMapping(String airportCode, String airportName) {
        String uri = MicroserviceApplication.projectUri + "/ms2/airportcodemapping/airportcodemapping?callerId=" + this.id + "&airportCode=airportCode&airportName=airportName";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getAirportCode() {
        return (String) null;
    }

    public void setAirportCode(String airportCode) {
        return;
    }

    public String getAirportName() {
        return (String) null;
    }

    public void setAirportName(String airportName) {
        return;
    }

    public String toJson() {
        return (String) null;
    }

    public void set_id(String _id) {
        return;
    }

    public String get_id() {
        return (String) null;
    }

    public int id = 0;

    public static AirportCodeMapping getObject(int id) {
        AirportCodeMapping obj = (AirportCodeMapping) new Object();
        obj.id = id;
        return obj;
    }
}

