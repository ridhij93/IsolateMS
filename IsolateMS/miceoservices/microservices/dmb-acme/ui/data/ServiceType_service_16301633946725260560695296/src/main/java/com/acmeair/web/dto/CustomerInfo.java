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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "Customer")
public class CustomerInfo implements Serializable {

    public CustomerInfo() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/customerinfocallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public CustomerInfo(String username, String password, String status, int total_miles, int miles_ytd, AddressInfo address, String phoneNumber, String phoneNumberType) {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/customerinfo?callerId=" + this.id + "&username=username&password=password&status=status&total_miles=total_miles&miles_ytd=miles_ytd&addressId=address.id&phoneNumber=phoneNumber&phoneNumberType=phoneNumberType";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public String get_id() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/get_idcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void set_id(String username) {
        return;
    }

    public String getPassword() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/getpasswordcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setPassword(String password) {
        return;
    }

    public String getStatus() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/getstatuscallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setStatus(String status) {
        return;
    }

    public int getTotal_miles() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/gettotal_milescallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public void setTotal_miles(int total_miles) {
        return;
    }

    public int getMiles_ytd() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/getmiles_ytdcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public void setMiles_ytd(int miles_ytd) {
        return;
    }

    public String getPhoneNumber() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/getphonenumbercallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setPhoneNumber(String phoneNumber) {
        return;
    }

    public String getPhoneNumberType() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/getphonenumbertypecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        return;
    }

    public AddressInfo getAddress() {
        String uri = MicroserviceApplication.projectUri + "/ms0/customerinfo/getaddresscallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        AddressInfo result = AddressInfo.getObject(resultTemp);
        return result;
    }

    public void setAddress(AddressInfo address) {
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

    public static CustomerInfo getObject(int id) {
        CustomerInfo obj = (CustomerInfo) new Object();
        obj.id = id;
        return obj;
    }
}

