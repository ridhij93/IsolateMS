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
package com.ibm.websphere.samples.daytrader.ejb3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Singleton
public class MarketSummarySingleton {

    @PostConstruct
    private void setup() {
        return;
    }

    /* Update Market Summary every 20 seconds */
    @Schedule(second = "*/20", minute = "*", hour = "*", persistent = false)
    private void updateMarketSummary() {
        return;
    }

    @Lock(LockType.READ)
    public MarketSummaryDataBean getMarketSummaryDataBean() {
        String uri = MicroserviceApplication.projectUri + "/ms5/marketsummarysingleton/getmarketsummarydatabeancallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        MarketSummaryDataBean result = MarketSummaryDataBean.getObject(resultTemp);
        return result;
    }

    @Lock(LockType.WRITE)
    public void setMarketSummaryDataBean(MarketSummaryDataBean marketSummaryDataBean) {
        return;
    }

    public void setEntityManager(EntityManager entityManager) {
        return;
    }

    public EntityManager getEntityManager() {
        return (EntityManager) null;
    }

    public int id = 0;

    public static MarketSummarySingleton getObject(int id) {
        MarketSummarySingleton obj = (MarketSummarySingleton) new Object();
        obj.id = id;
        return obj;
    }
}

