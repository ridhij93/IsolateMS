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
package com.ibm.websphere.samples.daytrader.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
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

@Controller
@RequestMapping("/ms5/marketsummarydatabean/")
public class MarketSummaryDataBeanWrapper {

    /*
                                                  * Collection of top losing
                                                  * stocks
                                                  */
    // FUTURE private Collection topVolume; /* Collection of top stocks by
    /* Date this summary was taken */
    private static int maxId = 0;

    public static HashMap<Integer, MarketSummaryDataBeanServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "marketsummarydatabean")
    public  @ResponseBody int MarketSummaryDataBean() {
        MarketSummaryDataBeanServer newServerObj = new MarketSummaryDataBeanServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "marketsummarydatabean")
    public  @ResponseBody int MarketSummaryDataBean(// , Collection topVolume
    @RequestParam BigDecimal TSIA, // , Collection topVolume
    @RequestParam BigDecimal openTSIA, // , Collection topVolume
    @RequestParam double volume, // , Collection topVolume
    @RequestParam int topGainersId, // , Collection topVolume
    @RequestParam int topLosersId) {
        MarketSummaryDataBeanServer newServerObj = new MarketSummaryDataBeanServer(TSIA, openTSIA, volume, (Collection<QuoteDataBean>) new Object(), (Collection<QuoteDataBean>) new Object());
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    /*
                                                  * Collection of top losing
                                                  * stocks
                                                  */
    // FUTURE private Collection topVolume; /* Collection of top stocks by
    /* Date this summary was taken */
}

