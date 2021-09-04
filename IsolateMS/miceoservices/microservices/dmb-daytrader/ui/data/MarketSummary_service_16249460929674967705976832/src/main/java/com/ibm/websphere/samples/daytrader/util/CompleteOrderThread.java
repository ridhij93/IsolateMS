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

import javax.ejb.EJBException;
import javax.naming.InitialContext;
import javax.transaction.UserTransaction;
import com.ibm.websphere.samples.daytrader.TradeServices;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.ejb3.TradeSLSBBean;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CompleteOrderThread implements Runnable {

    public CompleteOrderThread(Integer id, boolean twoPhase) {
        String uri = MicroserviceApplication.projectUri + "/ms7/completeorderthread/completeorderthread?callerId=" + this.id + "&id=id&twoPhase=twoPhase";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    @Override
    public void run() {
        return;
    }

    public Integer getOrderID() {
        return (Integer) null;
    }

    public void setTwoPhase(boolean twoPhase) {
        return;
    }

    public boolean getTwoPhase() {
        return (Boolean) null;
    }

    public int id = 0;

    public static CompleteOrderThread getObject(int id) {
        CompleteOrderThread obj = (CompleteOrderThread) new Object();
        obj.id = id;
        return obj;
    }
}

