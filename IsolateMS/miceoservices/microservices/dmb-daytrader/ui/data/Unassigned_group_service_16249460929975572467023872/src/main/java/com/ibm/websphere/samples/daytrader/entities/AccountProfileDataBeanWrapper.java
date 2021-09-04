/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.websphere.samples.daytrader.entities;

// import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Entity(name = "accountprofileejb")
@Table(name = "accountprofileejb")
public class AccountProfileDataBeanWrapper {

    /* Accessor methods for persistent fields */
    /* userID */
    /* password */
    /* fullName */
    /* address */
    /* email */
    /* creditCard */
    @RequestMapping(method = RequestMethod.GET, value = "tohtml")
    public @ResponseBody String toHTML(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.toHTML();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getuserid")
    public @ResponseBody String getUserID(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getUserID();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getpassword")
    public @ResponseBody String getPassword(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getPassword();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setpassword")
    public @ResponseBody ResponseEntity<Void> setPassword(@RequestParam int callerId, @RequestParam String password) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setPassword(password);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getfullname")
    public @ResponseBody String getFullName(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getFullName();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setfullname")
    public @ResponseBody ResponseEntity<Void> setFullName(@RequestParam int callerId, @RequestParam String fullName) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setFullName(fullName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaddress")
    public @ResponseBody String getAddress(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getAddress();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setaddress")
    public @ResponseBody ResponseEntity<Void> setAddress(@RequestParam int callerId, @RequestParam String address) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setAddress(address);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getemail")
    public @ResponseBody String getEmail(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getEmail();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setemail")
    public @ResponseBody ResponseEntity<Void> setEmail(@RequestParam int callerId, @RequestParam String email) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setEmail(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcreditcard")
    public @ResponseBody String getCreditCard(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getCreditCard();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setcreditcard")
    public @ResponseBody ResponseEntity<Void> setCreditCard(@RequestParam int callerId, @RequestParam String creditCard) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setCreditCard(creditCard);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getaccount")
    public @ResponseBody Integer getAccount(@RequestParam int callerId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        AccountDataBean result = callerObj.getAccount();
        return result.id;
    }

    @RequestMapping(method = RequestMethod.GET, value = "setaccount")
    public @ResponseBody ResponseEntity<Void> setAccount(@RequestParam int callerId, @RequestParam int accountId) {
        AccountProfileDataBeanServer callerObj = idObjMap.get(callerId);
        callerObj.setAccount(AccountDataBean.getObject(accountId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private static int maxId = 0;

    public static HashMap<Integer, AccountProfileDataBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "accountprofiledatabean")
    public  @ResponseBody int AccountProfileDataBean() {
        AccountProfileDataBeanServer newServerObj = new AccountProfileDataBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "accountprofiledatabean")
    public  @ResponseBody int AccountProfileDataBean(@RequestParam String userID, @RequestParam String password, @RequestParam String fullName, @RequestParam String address, @RequestParam String email, @RequestParam String creditCard) {
        AccountProfileDataBeanServer newServerObj = new AccountProfileDataBeanServer(userID, password, fullName, address, email, creditCard);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

