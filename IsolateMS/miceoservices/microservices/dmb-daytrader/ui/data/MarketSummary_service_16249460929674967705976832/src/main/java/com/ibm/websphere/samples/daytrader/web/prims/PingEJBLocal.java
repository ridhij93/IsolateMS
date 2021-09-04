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
package com.ibm.websphere.samples.daytrader.web.prims;

import javax.ejb.Local;
import javax.ejb.Stateful;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 */
@Stateful
@Local
public class PingEJBLocal implements PingEJBIFace {

    /*
     * (non-Javadoc)
     * 
     * @see com.ibm.websphere.samples.daytrader.web.prims.EJBIFace#getMsg()
     */
    @Override
    public String getMsg() {
        return (String) null;
    }

    public static void setHitCount(int hitCount) {
        return;
    }

    public static int getHitCount() {
        return (Integer) null;
    }

    public int id = 0;

    public static PingEJBLocal getObject(int id) {
        PingEJBLocal obj = (PingEJBLocal) new Object();
        obj.id = id;
        return obj;
    }
}

