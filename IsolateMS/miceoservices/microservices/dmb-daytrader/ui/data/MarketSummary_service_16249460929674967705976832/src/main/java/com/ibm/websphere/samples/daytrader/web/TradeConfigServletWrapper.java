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

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
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
 * TradeConfigServlet provides a servlet interface to adjust DayTrader runtime parameters.
 * TradeConfigServlet updates values in the {@link com.ibm.websphere.samples.daytrader.web.TradeConfig} JavaBean holding
 * all configuration and runtime parameters for the Trade application
 */
@WebServlet(name = "TradeConfigServlet", urlPatterns = { "/config" })
public class TradeConfigServletWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, TradeConfigServletServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "tradeconfigservlet")
    public  @ResponseBody int TradeConfigServlet() {
        TradeConfigServletServer newServerObj = new TradeConfigServletServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

