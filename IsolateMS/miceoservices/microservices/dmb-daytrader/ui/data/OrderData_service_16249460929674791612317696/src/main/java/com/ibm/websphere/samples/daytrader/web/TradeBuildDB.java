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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * TradeBuildDB uses operations provided by the TradeApplication to (a) create the Database tables
 * (b)populate a DayTrader database without creating the tables. Specifically, a
 * new DayTrader User population is created using UserIDs of the form "uid:xxx"
 * where xxx is a sequential number (e.g. uid:0, uid:1, etc.). New stocks are also created of the
 * form "s:xxx", again where xxx represents sequential numbers (e.g. s:1, s:2, etc.)
 */
public class TradeBuildDB {

    /**
     * Populate a Trade DB using standard out as a log
     */
    public TradeBuildDB() throws Exception {
        String uri = MicroserviceApplication.projectUri + "/ms2/tradebuilddb/tradebuilddbcallerId=" + this.id + "";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    /**
     * Re-create the DayTrader db tables and populate them OR just populate a DayTrader DB, logging to the provided output stream
     */
    public TradeBuildDB(java.io.PrintWriter out, InputStream ddlFile) throws Exception {
        String uri = MicroserviceApplication.projectUri + "/ms2/tradebuilddb/tradebuilddb?callerId=" + this.id + "&outId=out.id&ddlFileId=ddlFile.id";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, int.class);
        this.id = resultTemp;
    }

    public Object[] parseDDLToBuffer(InputStream ddlFile) throws Exception {
        return (Object[]) null;
    }

    public static void main(String[] args) throws Exception {
        return;
    }

    public int id = 0;

    public static TradeBuildDB getObject(int id) {
        TradeBuildDB obj = (TradeBuildDB) new Object();
        obj.id = id;
        return obj;
    }
}

