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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Singleton
public class MarketSummarySingletonWrapper {

    @Lock(LockType.READ)
    @RequestMapping(method = RequestMethod.GET, value = "getmarketsummarydatabean")
    public @ResponseBody Integer getMarketSummaryDataBean(@RequestParam int callerId) {
        MarketSummarySingletonServer callerObj = idObjMap.get(callerId);
        MarketSummaryDataBean result = callerObj.getMarketSummaryDataBean();
        return result.id;
    }

    private static int maxId = 0;

    public static HashMap<Integer, MarketSummarySingletonServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "marketsummarysingleton")
    public  @ResponseBody int MarketSummarySingleton() {
        MarketSummarySingletonServer newServerObj = new MarketSummarySingletonServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

