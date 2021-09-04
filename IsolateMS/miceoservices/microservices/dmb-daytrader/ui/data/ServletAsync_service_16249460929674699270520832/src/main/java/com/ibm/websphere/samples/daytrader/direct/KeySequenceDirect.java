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
package com.ibm.websphere.samples.daytrader.direct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import com.ibm.websphere.samples.daytrader.util.KeyBlock;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class KeySequenceDirect {

    public static synchronized Integer getNextID(Connection conn, String keyName, boolean inSession, boolean inGlobalTxn) {
        String uri = MicroserviceApplication.projectUri + "/ms0/keysequencedirect/getnextid?connId=conn.id&keyName=keyName&inSession=inSession&inGlobalTxn=inGlobalTxn";
        ResponseEntity<Integer> resultTemp = new RestTemplate().getForEntity(uri, Integer.class);
        Integer result = resultTemp.getBody();
        return resultTemp.getStatusCode() == HttpStatus.OK ? result : (Integer) null;
    }

    private static Collection<?> allocNewBlock(Connection conn, String keyName, boolean inSession, boolean inGlobalTxn) throws Exception {
        return (Collection) null;
    }

    public static void setKeyMap(HashMap<String, Collection<?>> keyMap) {
        return;
    }

    public static HashMap<String, Collection<?>> getKeyMap() {
        return (HashMap<String, Collection<?>>) null;
    }

    public static String getGetKeyForUpdateSQL() {
        return (String) null;
    }

    public static String getCreateKeySQL() {
        return (String) null;
    }

    public static String getUpdateKeyValueSQL() {
        return (String) null;
    }

    public int id = 0;

    public static KeySequenceDirect getObject(int id) {
        KeySequenceDirect obj = (KeySequenceDirect) new Object();
        obj.id = id;
        return obj;
    }
}

