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
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Primitive designed to run within the TradeApplication and makes use of
 * {@link trade_client.TradeConfig} for config parameters and random stock
 * symbols. Servlet will generate a random stock symbol and get the price of
 * that symbol using a {@link trade.Quote} Entity EJB This tests the common path
 * of a Servlet calling an Entity EJB to get data
 */
public class PingServlet2Entity extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        return;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        return;
    }

    @Override
    public String getServletInfo() {
        return (String) null;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        return;
    }

    public static long getSerialVersionUID() {
        return (Long) null;
    }

    public static void setInitTime(String initTime) {
        return;
    }

    public static String getInitTime() {
        return (String) null;
    }

    public static void setHitCount(int hitCount) {
        return;
    }

    public static int getHitCount() {
        return (Integer) null;
    }

    public void setEm(EntityManager em) {
        return;
    }

    public EntityManager getEm() {
        return (EntityManager) null;
    }

    public int id = 0;

    public static PingServlet2Entity getObject(int id) {
        PingServlet2Entity obj = (PingServlet2Entity) new Object();
        obj.id = id;
        return obj;
    }
}

