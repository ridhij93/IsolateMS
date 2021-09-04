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
package com.ibm.websphere.samples.daytrader.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
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

/**
 * TradeBuildDB uses operations provided by the TradeApplication to (a) create the Database tables
 * (b)populate a DayTrader database without creating the tables. Specifically, a
 * new DayTrader User population is created using UserIDs of the form "uid:xxx"
 * where xxx is a sequential number (e.g. uid:0, uid:1, etc.). New stocks are also created of the
 * form "s:xxx", again where xxx represents sequential numbers (e.g. s:1, s:2, etc.)
 */
@Controller
@RequestMapping("/ms2/tradebuilddb/")
public class TradeBuildDBWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TradeBuildDBServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradebuilddb")
    public  @ResponseBody int TradeBuildDB() {
        TradeBuildDBServer newServerObj = new TradeBuildDBServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }

    @RequestMapping(method = RequestMethod.GET, value = "tradebuilddb")
    public  @ResponseBody int TradeBuildDB(@RequestParam int outId, @RequestParam int ddlFileId) {
        TradeBuildDBServer newServerObj = new TradeBuildDBServer(java.io.PrintWriter.getObject(outId), InputStream.getObject(ddlFileId));
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

