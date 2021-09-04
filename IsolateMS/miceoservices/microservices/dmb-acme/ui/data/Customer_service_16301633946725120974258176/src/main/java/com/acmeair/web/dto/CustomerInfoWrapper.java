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
import javax.xml.bind.annotation.XmlElement;
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
@XmlRootElement(name = "Customer")
public class CustomerInfoWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "get_id")
    public @ResponseBody String get_id(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.get_id();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpassword")
    public @ResponseBody String getPassword(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getPassword();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getstatus")
    public @ResponseBody String getStatus(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getStatus();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "gettotal_miles")
    public  @ResponseBody int getTotal_miles(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        int result = callerObj.getTotal_miles();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getmiles_ytd")
    public  @ResponseBody int getMiles_ytd(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        int result = callerObj.getMiles_ytd();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getphonenumber")
    public @ResponseBody String getPhoneNumber(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getPhoneNumber();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getphonenumbertype")
    public @ResponseBody String getPhoneNumberType(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getPhoneNumberType();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaddress")
    public @ResponseBody Integer getAddress(@RequestParam int callerId) {
        CustomerInfoServer callerObj = idObjMap.get(callerId);
        AddressInfo result = callerObj.getAddress();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, CustomerInfoServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customerinfo")
    public  @ResponseBody int CustomerInfo() {
        CustomerInfoServer newServerObj = new CustomerInfoServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "customerinfo")
    public  @ResponseBody int CustomerInfo(@RequestParam String username, @RequestParam String password, @RequestParam String status, @RequestParam int total_miles, @RequestParam int miles_ytd, @RequestParam int addressId, @RequestParam String phoneNumber, @RequestParam String phoneNumberType) {
        CustomerInfoServer newServerObj = new CustomerInfoServer(username, password, status, total_miles, miles_ytd, AddressInfo.getObject(addressId), phoneNumber, phoneNumberType);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

