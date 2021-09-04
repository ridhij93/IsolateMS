package com.acmeair.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
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
@RequestMapping("/ms6/util/")
public class UtilWrapper {

    static class Not200Exception extends Exception {

        private static final long serialVersionUID = 1L;

        public Not200Exception(String message) {
            super(message);
        }
    }

    private static int maxId = 0;

    public static HashMap<Integer, UtilServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "util")
    public  @ResponseBody int Util() {
        UtilServer newServerObj = new UtilServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

