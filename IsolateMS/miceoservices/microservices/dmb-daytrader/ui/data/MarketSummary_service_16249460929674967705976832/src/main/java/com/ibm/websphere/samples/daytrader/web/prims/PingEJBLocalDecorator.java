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

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class PingEJBLocalDecorator implements PingEJBIFace {

    @Override
    public String getMsg() {
        return (String) null;
    }

    public void setEjb(PingEJBIFace ejb) {
        return;
    }

    public PingEJBIFace getEjb() {
        return (PingEJBIFace) null;
    }

    public int id = 0;

    public static PingEJBLocalDecorator getObject(int id) {
        PingEJBLocalDecorator obj = (PingEJBLocalDecorator) new Object();
        obj.id = id;
        return obj;
    }
}

