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

import java.io.Serializable;
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
 * An object that contains approximately 1024 bits of information. This is used
 * by {@link PingSession3}
 */
@Controller
@RequestMapping("/ms5/pingsession3object/")
public class PingSession3ObjectWrapper {

    // PingSession3Object represents a BLOB of session data of various.
    // Each instantiation of this class is approximately 1K in size (not
    // including overhead for arrays and Strings)
    // Using different datatype exercises the various serialization algorithms
    // for each type
    // Primitive type size = ~5*128= 640
    // String type size = ~2*12*16 = 384
    // Total blob size (w/o overhead) = 1024
    // The Session blob must be filled with data to avoid compression of the
    /**
     * Main method to test the serialization of the Session Data blob object
     * Creation date: (4/3/2000 3:07:34 PM)
     *
     * @param args
     *            java.lang.String[]
     */
    /**
     * Since the following main method were written for testing purpose, we
     * comment them out public static void main(String[] args) { try {
     * PingSession3Object data = new PingSession3Object();
     *
     * FileOutputStream ostream = new
     * FileOutputStream("c:\\temp\\datablob.xxx"); ObjectOutputStream p = new
     * ObjectOutputStream(ostream); p.writeObject(data); p.flush();
     * ostream.close(); } catch (Exception e) { System.out.println("Exception: "
     * + e.toString()); } }
     */
    private static int maxId = 0;

    public static HashMap<Integer, PingSession3ObjectServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "pingsession3object")
    public  @ResponseBody int PingSession3Object() {
        PingSession3ObjectServer newServerObj = new PingSession3ObjectServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // PingSession3Object represents a BLOB of session data of various.
    // Each instantiation of this class is approximately 1K in size (not
    // including overhead for arrays and Strings)
    // Using different datatype exercises the various serialization algorithms
    // for each type
    // Primitive type size = ~5*128= 640
    // String type size = ~2*12*16 = 384
    // Total blob size (w/o overhead) = 1024
    // The Session blob must be filled with data to avoid compression of the
    /**
     * Main method to test the serialization of the Session Data blob object
     * Creation date: (4/3/2000 3:07:34 PM)
     *
     * @param args
     *            java.lang.String[]
     */
    /**
     * Since the following main method were written for testing purpose, we
     * comment them out public static void main(String[] args) { try {
     * PingSession3Object data = new PingSession3Object();
     *
     * FileOutputStream ostream = new
     * FileOutputStream("c:\\temp\\datablob.xxx"); ObjectOutputStream p = new
     * ObjectOutputStream(ostream); p.writeObject(data); p.flush();
     * ostream.close(); } catch (Exception e) { System.out.println("Exception: "
     * + e.toString()); } }
     */
}

