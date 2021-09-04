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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Util {

    public static void registerService() {
        return;
    }

    public static void sendHeartbeat(String heartbeatUrl, String BEARER_TOKEN, int SLEEP_TIME) throws Exception {
        return;
    }

    static class Not200Exception extends Exception {

        private static final long serialVersionUID = 1L;

        public Not200Exception(String message) {
            String uri = MicroserviceApplication.projectUri + "/msnull/not200exception/not200exception?callerId=" + this.id + "&message=message";
            int resultTemp = new RestTemplate().getForObject(uri, int.class);
            this.id = resultTemp;
        }
    }

    public static String getServiceProxy() {
        return (String) null;
    }

    public int id = 0;

    public static Util getObject(int id) {
        Util obj = (Util) new Object();
        obj.id = id;
        return obj;
    }
}

