package com.acmeair.mongo;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
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
@RequestMapping("/ms2/connectionmanager/")
public class ConnectionManagerWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, ConnectionManagerServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "connectionmanager")
    public  @ResponseBody int ConnectionManager() {
        ConnectionManagerServer newServerObj = new ConnectionManagerServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

