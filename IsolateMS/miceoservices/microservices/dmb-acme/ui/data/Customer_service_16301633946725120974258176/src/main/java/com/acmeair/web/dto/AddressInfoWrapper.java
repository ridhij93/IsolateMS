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
package com.acmeair.web.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "CustomerAddress")
public class AddressInfoWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "getstreetaddress1")
    public @ResponseBody String getStreetAddress1(@RequestParam int callerId) {
        AddressInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getStreetAddress1();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getstreetaddress2")
    public @ResponseBody String getStreetAddress2(@RequestParam int callerId) {
        AddressInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getStreetAddress2();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcity")
    public @ResponseBody String getCity(@RequestParam int callerId) {
        AddressInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getCity();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getstateprovince")
    public @ResponseBody String getStateProvince(@RequestParam int callerId) {
        AddressInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getStateProvince();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcountry")
    public @ResponseBody String getCountry(@RequestParam int callerId) {
        AddressInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getCountry();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpostalcode")
    public @ResponseBody String getPostalCode(@RequestParam int callerId) {
        AddressInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getPostalCode();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, AddressInfoServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "addressinfo")
    public  @ResponseBody int AddressInfo() {
        AddressInfoServer newServerObj = new AddressInfoServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "addressinfo")
    public  @ResponseBody int AddressInfo(@RequestParam String streetAddress1, @RequestParam String streetAddress2, @RequestParam String city, @RequestParam String stateProvince, @RequestParam String country, @RequestParam String postalCode) {
        AddressInfoServer newServerObj = new AddressInfoServer(streetAddress1, streetAddress2, city, stateProvince, country, postalCode);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

