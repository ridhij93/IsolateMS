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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Entity(name = "accountprofileejb")
@Table(name = "accountprofileejb")
public class AccountProfileDataBean implements java.io.Serializable {

    /* Accessor methods for persistent fields */
    /* userID */
    /* password */
    /* fullName */
    /* address */
    /* email */
    /* creditCard */
    public AccountProfileDataBean() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/accountprofiledatabeancallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public AccountProfileDataBean(String userID, String password, String fullName, String address, String email, String creditCard) {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/accountprofiledatabean?callerId=" + this.id + "&userID=userID&password=password&fullName=fullName&address=address&email=email&creditCard=creditCard";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static AccountProfileDataBean getRandomInstance() {
        return (AccountProfileDataBean) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public String toHTML() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/tohtmlcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void print() {
        return;
    }

    public String getUserID() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/getuseridcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setUserID(String userID) {
        return;
    }

    public String getPassword() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/getpasswordcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setPassword(String password) {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/setpassword?callerId=" + this.id + "&password=password";
        new RestTemplate().getForObject(uri, void.class);
    }

    public String getFullName() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/getfullnamecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setFullName(String fullName) {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/setfullname?callerId=" + this.id + "&fullName=fullName";
        new RestTemplate().getForObject(uri, void.class);
    }

    public String getAddress() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/getaddresscallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setAddress(String address) {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/setaddress?callerId=" + this.id + "&address=address";
        new RestTemplate().getForObject(uri, void.class);
    }

    public String getEmail() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/getemailcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setEmail(String email) {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/setemail?callerId=" + this.id + "&email=email";
        new RestTemplate().getForObject(uri, void.class);
    }

    public String getCreditCard() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/getcreditcardcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setCreditCard(String creditCard) {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/setcreditcard?callerId=" + this.id + "&creditCard=creditCard";
        new RestTemplate().getForObject(uri, void.class);
    }

    public AccountDataBean getAccount() {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/getaccountcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        AccountDataBean result = AccountDataBean.getObject(resultTemp);
        return result;
    }

    public void setAccount(AccountDataBean account) {
        String uri = MicroserviceApplication.projectUri + "/ms8/accountprofiledatabean/setaccount?callerId=" + this.id + "&accountId=account.id";
        new RestTemplate().getForObject(uri, void.class);
    }

    @Override
    public int hashCode() {
        return (Integer) null;
    }

    @Override
    public boolean equals(Object object) {
        return (Boolean) null;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public void setPasswd(String passwd) {
        return;
    }

    public String getPasswd() {
        return (String) null;
    }

    public int id = 0;

    public static AccountProfileDataBean getObject(int id) {
        AccountProfileDataBean obj = (AccountProfileDataBean) new Object();
        obj.id = id;
        return obj;
    }
}

