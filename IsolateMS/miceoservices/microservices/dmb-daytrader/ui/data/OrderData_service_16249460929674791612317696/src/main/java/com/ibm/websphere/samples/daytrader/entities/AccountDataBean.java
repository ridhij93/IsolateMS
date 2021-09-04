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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Entity(name = "accountejb")
@Table(name = "accountejb")
public class AccountDataBean implements Serializable {

    /* accountID */
    /* loginCount */
    /* logoutCount */
    /* lastLogin Date */
    /* creationDate */
    /* balance */
    /* open balance */
    public AccountDataBean() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/accountdatabeancallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public AccountDataBean(Integer accountID, int loginCount, int logoutCount, Date lastLogin, Date creationDate, BigDecimal balance, BigDecimal openBalance, String profileID) {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/accountdatabean?callerId=" + this.id + "&accountID=accountID&loginCount=loginCount&logoutCount=logoutCount&lastLogin=lastLogin&creationDate=creationDate&balance=balance&openBalance=openBalance&profileID=profileID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public AccountDataBean(int loginCount, int logoutCount, Date lastLogin, Date creationDate, BigDecimal balance, BigDecimal openBalance, String profileID) {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/accountdatabean?callerId=" + this.id + "&loginCount=loginCount&logoutCount=logoutCount&lastLogin=lastLogin&creationDate=creationDate&balance=balance&openBalance=openBalance&profileID=profileID";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public static AccountDataBean getRandomInstance() {
        return (AccountDataBean) null;
    }

    @Override
    public String toString() {
        return (String) null;
    }

    public String toHTML() {
        return (String) null;
    }

    public void print() {
        return;
    }

    public Integer getAccountID() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getaccountidcallerId=" + this.id + "";
        Integer resultTemp = new RestTemplate().getForObject(uri, Integer.class);
        Integer result = resultTemp;
        return result;
    }

    public void setAccountID(Integer accountID) {
        return;
    }

    public int getLoginCount() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getlogincountcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public void setLoginCount(int loginCount) {
        return;
    }

    public int getLogoutCount() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getlogoutcountcallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        int result = resultTemp;
        return result;
    }

    public void setLogoutCount(int logoutCount) {
        return;
    }

    public Date getLastLogin() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getlastlogincallerId=" + this.id + "";
        Date resultTemp = new RestTemplate().getForObject(uri, Date.class);
        Date result = resultTemp;
        return result;
    }

    public void setLastLogin(Date lastLogin) {
        return;
    }

    public Date getCreationDate() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getcreationdatecallerId=" + this.id + "";
        Date resultTemp = new RestTemplate().getForObject(uri, Date.class);
        Date result = resultTemp;
        return result;
    }

    public void setCreationDate(Date creationDate) {
        return;
    }

    public BigDecimal getBalance() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getbalancecallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public void setBalance(BigDecimal balance) {
        return;
    }

    public BigDecimal getOpenBalance() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getopenbalancecallerId=" + this.id + "";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public void setOpenBalance(BigDecimal openBalance) {
        return;
    }

    public String getProfileID() {
        String uri = MicroserviceApplication.projectUri + "/ms1/accountdatabean/getprofileidcallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setProfileID(String profileID) {
        return;
    }

    /*
     * Disabled for D185273 public String getUserID() { return getProfileID(); }
     */
    public Collection<OrderDataBean> getOrders() {
        return (Collection) null;
    }

    public void setOrders(Collection<OrderDataBean> orders) {
        return;
    }

    public Collection<HoldingDataBean> getHoldings() {
        return (Collection) null;
    }

    public void setHoldings(Collection<HoldingDataBean> holdings) {
        return;
    }

    public AccountProfileDataBean getProfile() {
        return (AccountProfileDataBean) null;
    }

    public void setProfile(AccountProfileDataBean profile) {
        return;
    }

    public void login(String password) {
        return;
    }

    public void logout() {
        return;
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

    public int id = 0;

    public static AccountDataBean getObject(int id) {
        AccountDataBean obj = (AccountDataBean) new Object();
        obj.id = id;
        return obj;
    }
}

