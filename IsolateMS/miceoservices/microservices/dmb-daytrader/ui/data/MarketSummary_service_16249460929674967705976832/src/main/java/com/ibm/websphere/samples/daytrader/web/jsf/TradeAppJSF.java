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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named("tradeapp")
@SessionScoped
public class TradeAppJSF implements Serializable {

    public String login() {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeappjsf/logincallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public String register() {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeappjsf/registercallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public String updateProfile() {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeappjsf/updateprofilecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public String logout() {
        String uri = MicroserviceApplication.projectUri + "/ms5/tradeappjsf/logoutcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public String getUserID() {
        return (String) null;
    }

    public void setUserID(String userID) {
        return;
    }

    public String getPassword() {
        return (String) null;
    }

    public void setPassword(String password) {
        return;
    }

    public String getCpassword() {
        return (String) null;
    }

    public void setCpassword(String cpassword) {
        return;
    }

    public String getFullname() {
        return (String) null;
    }

    public void setFullname(String fullname) {
        return;
    }

    public String getResults() {
        return (String) null;
    }

    public void setResults(String results) {
        return;
    }

    public String getAddress() {
        return (String) null;
    }

    public void setAddress(String address) {
        return;
    }

    public String getEmail() {
        return (String) null;
    }

    public void setEmail(String email) {
        return;
    }

    public String getCcn() {
        return (String) null;
    }

    public void setCcn(String ccn) {
        return;
    }

    public String getMoney() {
        return (String) null;
    }

    public void setMoney(String money) {
        return;
    }

    public void setFacesExternalContext(ExternalContext facesExternalContext) {
        return;
    }

    public ExternalContext getFacesExternalContext() {
        return (ExternalContext) null;
    }

    public void setTradeAction(TradeAction tradeAction) {
        return;
    }

    public TradeAction getTradeAction() {
        return (TradeAction) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public int id = 0;

    public static TradeAppJSF getObject(int id) {
        TradeAppJSF obj = (TradeAppJSF) new Object();
        obj.id = id;
        return obj;
    }
}

