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
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
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
@RequestMapping("/ms7/financialutils/")
public class FinancialUtilsWrapper {

    @RequestMapping(method = RequestMethod.GET, value = "computegain")
    public static @ResponseBody BigDecimal computeGain(@RequestParam BigDecimal currentBalance, @RequestParam BigDecimal openBalance) {
        BigDecimal result = FinancialUtilsServer.computeGain(currentBalance, openBalance);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "computegainpercent")
    public static @ResponseBody BigDecimal computeGainPercent(@RequestParam BigDecimal currentBalance, @RequestParam BigDecimal openBalance) {
        BigDecimal result = FinancialUtilsServer.computeGainPercent(currentBalance, openBalance);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "computeholdingstotal")
    public static @ResponseBody BigDecimal computeHoldingsTotal(@RequestParam Collection<?> holdingDataBeans) {
        BigDecimal result = FinancialUtilsServer.computeHoldingsTotal(holdingDataBeans);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "printgainhtml")
    public static @ResponseBody String printGainHTML(@RequestParam BigDecimal gain) {
        String result = FinancialUtilsServer.printGainHTML(gain);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "printgainpercenthtml")
    public static @ResponseBody String printGainPercentHTML(@RequestParam BigDecimal gain) {
        String result = FinancialUtilsServer.printGainPercentHTML(gain);
        return result;
    }

    private static int maxId = 0;

    public static HashMap<Integer, FinancialUtilsServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "financialutils")
    public  @ResponseBody int FinancialUtils() {
        FinancialUtilsServer newServerObj = new FinancialUtilsServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

