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

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import javax.ejb.EJBException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
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

@Entity(name = "accountejb")
@Table(name = "accountejb")
public class AccountDataBeanWrapper {

    /* accountID */
    /* loginCount */
    /* logoutCount */
    /* lastLogin Date */
    /* creationDate */
    /* balance */
    /* open balance */
    @RequestMapping(method = RequestMethod.GET, value = "getaccountid")
    public @ResponseBody Integer getAccountID(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        Integer result = callerObj.getAccountID();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getlogincount")
    public  @ResponseBody int getLoginCount(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        int result = callerObj.getLoginCount();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getlogoutcount")
    public  @ResponseBody int getLogoutCount(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        int result = callerObj.getLogoutCount();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getlastlogin")
    public @ResponseBody Date getLastLogin(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        Date result = callerObj.getLastLogin();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcreationdate")
    public @ResponseBody Date getCreationDate(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        Date result = callerObj.getCreationDate();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getbalance")
    public @ResponseBody BigDecimal getBalance(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getBalance();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getopenbalance")
    public @ResponseBody BigDecimal getOpenBalance(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        BigDecimal result = callerObj.getOpenBalance();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getprofileid")
    public @ResponseBody String getProfileID(@RequestParam int callerId) {
        AccountDataBeanServer callerObj = idObjMap.get(callerId);
        String result = callerObj.getProfileID();
        return result;
    }

    /*
     * Disabled for D185273 public String getUserID() { return getProfileID(); }
     */
    private static int maxId = 0;

    public static HashMap<Integer, AccountDataBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "accountdatabean")
    public  @ResponseBody int AccountDataBean() {
        AccountDataBeanServer newServerObj = new AccountDataBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "accountdatabean")
    public  @ResponseBody int AccountDataBean(@RequestParam Integer accountID, @RequestParam int loginCount, @RequestParam int logoutCount, @RequestParam Date lastLogin, @RequestParam Date creationDate, @RequestParam BigDecimal balance, @RequestParam BigDecimal openBalance, @RequestParam String profileID) {
        AccountDataBeanServer newServerObj = new AccountDataBeanServer(accountID, loginCount, logoutCount, lastLogin, creationDate, balance, openBalance, profileID);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "accountdatabean")
    public  @ResponseBody int AccountDataBean(@RequestParam int loginCount, @RequestParam int logoutCount, @RequestParam Date lastLogin, @RequestParam Date creationDate, @RequestParam BigDecimal balance, @RequestParam BigDecimal openBalance, @RequestParam String profileID) {
        AccountDataBeanServer newServerObj = new AccountDataBeanServer(loginCount, logoutCount, lastLogin, creationDate, balance, openBalance, profileID);
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    /*
     * Disabled for D185273 public String getUserID() { return getProfileID(); }
     */
}

