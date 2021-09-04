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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "CustomerAddress")
public class AddressInfo implements Serializable {

    public AddressInfo() {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/addressinfocallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public AddressInfo(String streetAddress1, String streetAddress2, String city, String stateProvince, String country, String postalCode) {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/addressinfo?callerId=" + this.id + "&streetAddress1=streetAddress1&streetAddress2=streetAddress2&city=city&stateProvince=stateProvince&country=country&postalCode=postalCode";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String getStreetAddress1() {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/getstreetaddress1callerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setStreetAddress1(String streetAddress1) {
        return;
    }

    public String getStreetAddress2() {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/getstreetaddress2callerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setStreetAddress2(String streetAddress2) {
        return;
    }

    public String getCity() {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/getcitycallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setCity(String city) {
        return;
    }

    public String getStateProvince() {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/getstateprovincecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setStateProvince(String stateProvince) {
        return;
    }

    public String getCountry() {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/getcountrycallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setCountry(String country) {
        return;
    }

    public String getPostalCode() {
        String uri = MicroserviceApplication.projectUri + "/ms0/addressinfo/getpostalcodecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setPostalCode(String postalCode) {
        return;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    @Override
    public boolean equals(Object obj) {
        return (Boolean) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static AddressInfo getObject(int id) {
        AddressInfo obj = (AddressInfo) new Object();
        obj.id = id;
        return obj;
    }
}

