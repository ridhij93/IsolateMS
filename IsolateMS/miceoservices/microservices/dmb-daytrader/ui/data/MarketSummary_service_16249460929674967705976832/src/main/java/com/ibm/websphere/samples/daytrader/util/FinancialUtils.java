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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class FinancialUtils {

    public static BigDecimal computeGain(BigDecimal currentBalance, BigDecimal openBalance) {
        String uri = MicroserviceApplication.projectUri + "/ms7/financialutils/computegain?currentBalance=currentBalance&openBalance=openBalance";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public static BigDecimal computeGainPercent(BigDecimal currentBalance, BigDecimal openBalance) {
        String uri = MicroserviceApplication.projectUri + "/ms7/financialutils/computegainpercent?currentBalance=currentBalance&openBalance=openBalance";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public static BigDecimal computeHoldingsTotal(Collection<?> holdingDataBeans) {
        String uri = MicroserviceApplication.projectUri + "/ms7/financialutils/computeholdingstotal?holdingDataBeans=holdingDataBeans";
        BigDecimal resultTemp = new RestTemplate().getForObject(uri, BigDecimal.class);
        BigDecimal result = resultTemp;
        return result;
    }

    public static String printGainHTML(BigDecimal gain) {
        String uri = MicroserviceApplication.projectUri + "/ms7/financialutils/printgainhtml?gain=gain";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String printChangeHTML(double change) {
        return (String) null;
    }

    public static String printGainPercentHTML(BigDecimal gain) {
        String uri = MicroserviceApplication.projectUri + "/ms7/financialutils/printgainpercenthtml?gain=gain";
        String resultTemp = new RestTemplate().getForObject(uri, String.class);
        String result = resultTemp;
        return result;
    }

    public static String printQuoteLink(String symbol) {
        return (String) null;
    }

    public static int getROUND() {
        return (Integer) null;
    }

    public static int getSCALE() {
        return (Integer) null;
    }

    public static BigDecimal getZERO() {
        return (BigDecimal) null;
    }

    public static BigDecimal getONE() {
        return (BigDecimal) null;
    }

    public static BigDecimal getHUNDRED() {
        return (BigDecimal) null;
    }

    public int id = 0;

    public static FinancialUtils getObject(int id) {
        FinancialUtils obj = (FinancialUtils) new Object();
        obj.id = id;
        return obj;
    }
}

