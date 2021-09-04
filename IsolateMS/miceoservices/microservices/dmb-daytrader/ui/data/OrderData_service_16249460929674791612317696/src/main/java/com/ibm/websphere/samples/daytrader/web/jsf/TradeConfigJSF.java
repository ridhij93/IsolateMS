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

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.web.TradeBuildDB;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Named("tradeconfig")
@RequestScoped
public class TradeConfigJSF {

    // private String cachingType = TradeConfig.cachingTypeNames[TradeConfig.getCachingType()];
    public void updateConfig() {
        String uri = MicroserviceApplication.projectUri + "/ms2/tradeconfigjsf/updateconfigcallerId=" + this.id + "";
        new RestTemplate().getForObject(uri, void.class);
    }

    public String resetTrade() {
        String uri = MicroserviceApplication.projectUri + "/ms2/tradeconfigjsf/resettradecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public String populateDatabase() {
        String uri = MicroserviceApplication.projectUri + "/ms2/tradeconfigjsf/populatedatabasecallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public String buildDatabaseTables() {
        String uri = MicroserviceApplication.projectUri + "/ms2/tradeconfigjsf/builddatabasetablescallerId=" + this.id + "";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public void setRuntimeMode(String runtimeMode) {
        return;
    }

    public String getRuntimeMode() {
        return (String) null;
    }

    public void setOrderProcessingMode(String orderProcessingMode) {
        return;
    }

    public String getOrderProcessingMode() {
        return (String) null;
    }

    /*
    public void setCachingType(String cachingType) {
        this.cachingType = cachingType;
    }

    public String getCachingType() {
        return cachingType;
    }

    public void setDistributedMapCacheSize(int distributedMapCacheSize) {
        this.distributedMapCacheSize = distributedMapCacheSize;
    }

    public int getDistributedMapCacheSize() {
        return distributedMapCacheSize;
    }*/
    public void setMaxUsers(int maxUsers) {
        return;
    }

    public int getMaxUsers() {
        return (Integer) null;
    }

    public void setmaxQuotes(int maxQuotes) {
        return;
    }

    public int getMaxQuotes() {
        return (Integer) null;
    }

    public void setMarketSummaryInterval(int marketSummaryInterval) {
        return;
    }

    public int getMarketSummaryInterval() {
        return (Integer) null;
    }

    public void setPrimIterations(int primIterations) {
        return;
    }

    public int getPrimIterations() {
        return (Integer) null;
    }

    public void setPublishQuotePriceChange(boolean publishQuotePriceChange) {
        return;
    }

    public boolean isPublishQuotePriceChange() {
        return (Boolean) null;
    }

    public void setPercentSentToWebsocket(int percentSentToWebsocket) {
        return;
    }

    public int getPercentSentToWebsocket() {
        return (Integer) null;
    }

    public void setDisplayOrderAlerts(boolean displayOrderAlerts) {
        return;
    }

    public boolean isDisplayOrderAlerts() {
        return (Boolean) null;
    }

    public void setUseRemoteEJBInterface(boolean useRemoteEJBInterface) {
        return;
    }

    public boolean isUseRemoteEJBInterface() {
        return (Boolean) null;
    }

    public void setLongRun(boolean longRun) {
        return;
    }

    public boolean isLongRun() {
        return (Boolean) null;
    }

    public void setTrace(boolean trace) {
        return;
    }

    public boolean isTrace() {
        return (Boolean) null;
    }

    public void setRuntimeModeList(String[] runtimeModeList) {
        return;
    }

    public String[] getRuntimeModeList() {
        return (String[]) null;
    }

    public void setOrderProcessingModeList(String[] orderProcessingModeList) {
        return;
    }

    public String[] getOrderProcessingModeList() {
        return (String[]) null;
    }

    /*public void setCachingTypeList(String[] cachingTypeList) {
        this.cachingTypeList = cachingTypeList;
    }

    public String[] getCachingTypeList() {
        return cachingTypeList;
    }*/
    public void setWebInterface(String webInterface) {
        return;
    }

    public String getWebInterface() {
        return (String) null;
    }

    public void setWebInterfaceList(String[] webInterfaceList) {
        return;
    }

    public String[] getWebInterfaceList() {
        return (String[]) null;
    }

    public void setActionTrace(boolean actionTrace) {
        return;
    }

    public boolean isActionTrace() {
        return (Boolean) null;
    }

    public void setResult(String result) {
        return;
    }

    public String getResult() {
        return (String) null;
    }

    public void setFacesExternalContext(ExternalContext facesExternalContext) {
        return;
    }

    public ExternalContext getFacesExternalContext() {
        return (ExternalContext) null;
    }

    public void setMaxQuotes(int maxQuotes) {
        return;
    }

    public boolean getPublishQuotePriceChange() {
        return (Boolean) null;
    }

    public boolean getLongRun() {
        return (Boolean) null;
    }

    public boolean getDisplayOrderAlerts() {
        return (Boolean) null;
    }

    public boolean getUseRemoteEJBInterface() {
        return (Boolean) null;
    }

    public boolean getActionTrace() {
        return (Boolean) null;
    }

    public boolean getTrace() {
        return (Boolean) null;
    }

    public int id = 0;

    public static TradeConfigJSF getObject(int id) {
        TradeConfigJSF obj = (TradeConfigJSF) new Object();
        obj.id = id;
        return obj;
    }
}

