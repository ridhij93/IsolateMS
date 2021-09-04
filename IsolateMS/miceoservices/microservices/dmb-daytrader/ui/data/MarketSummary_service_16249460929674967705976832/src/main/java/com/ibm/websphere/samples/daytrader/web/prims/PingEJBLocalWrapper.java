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
 */
@Stateful
@Local
public class PingEJBLocalWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, PingEJBLocalServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pingejblocal")
    public  @ResponseBody int PingEJBLocal() {
        PingEJBLocalServer newServerObj = new PingEJBLocalServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

