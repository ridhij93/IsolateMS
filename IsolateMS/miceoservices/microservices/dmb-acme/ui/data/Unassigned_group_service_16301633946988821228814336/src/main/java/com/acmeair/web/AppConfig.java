package com.acmeair.web;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import com.acmeair.config.AcmeAirConfiguration;
import com.acmeair.config.LoaderREST;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ApplicationPath("/rest/info")
public class AppConfig extends Application {

    public Set<Class<?>> getClasses() {
        return (Set<Class<?>>) null;
    }

    public int id = 0;

    public static AppConfig getObject(int id) {
        AppConfig obj = (AppConfig) new Object();
        obj.id = id;
        return obj;
    }
}

