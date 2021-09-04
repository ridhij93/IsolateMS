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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConnectionManager implements MongoConstants {

    public static ConnectionManager getConnectionManager() {
        return (ConnectionManager) null;
    }

    private ConnectionManager() {
        String uri = MicroserviceApplication.projectUri + "/ms2/connectionmanager/connectionmanagercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        this.id = resultTemp;
    }

    public MongoDatabase getDB() {
        return (MongoDatabase) null;
    }

    public static void setConnectionManager(AtomicReference<ConnectionManager> connectionManager) {
        return;
    }

    public static Logger getLogger() {
        return (Logger) null;
    }

    public void setMongoClient(MongoClient mongoClient) {
        return;
    }

    public MongoClient getMongoClient() {
        return (MongoClient) null;
    }

    public void setDb(MongoDatabase db) {
        return;
    }

    public MongoDatabase getDb() {
        return (MongoDatabase) null;
    }

    public int id = 0;

    public static ConnectionManager getObject(int id) {
        ConnectionManager obj = (ConnectionManager) new Object();
        obj.id = id;
        return obj;
    }
}

