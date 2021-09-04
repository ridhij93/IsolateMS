/**
 * ****************************************************************************
 *  Copyright (c) 2013-2015 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * *****************************************************************************
 */
package com.acmeair.service;

import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
@RequestMapping("/ms3/authservice/")
public abstract class AuthServiceWrapper {

    // TODO: Do I really need to create a JSONObject here or just return a Json string?
    private static int maxId = 0;

    public static HashMap<Integer, AuthServiceServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "authservice")
    public  @ResponseBody int AuthService() {
        AuthServiceServer newServerObj = new AuthServiceServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // TODO: Do I really need to create a JSONObject here or just return a Json string?
}

