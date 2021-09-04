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
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.util.Log;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Named("tradeapp")
@SessionScoped
public class TradeAppJSFWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "login")
    public @ResponseBody String login(@RequestParam int callerId) {
        TradeAppJSFServer callerObj = idObjMap.get(callerId);
        String result = callerObj.login();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "register")
    public @ResponseBody String register(@RequestParam int callerId) {
        TradeAppJSFServer callerObj = idObjMap.get(callerId);
        String result = callerObj.register();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "updateprofile")
    public @ResponseBody String updateProfile(@RequestParam int callerId) {
        TradeAppJSFServer callerObj = idObjMap.get(callerId);
        String result = callerObj.updateProfile();
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "logout")
    public @ResponseBody String logout(@RequestParam int callerId) {
        TradeAppJSFServer callerObj = idObjMap.get(callerId);
        String result = callerObj.logout();
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, TradeAppJSFServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradeappjsf")
    public  @ResponseBody int TradeAppJSF() {
        TradeAppJSFServer newServerObj = new TradeAppJSFServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

