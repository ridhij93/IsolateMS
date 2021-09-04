package com.acmeair.web;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ApplicationPath("/rest/api")
public class AcmeAirApp extends Application {

    public Set<Class<?>> getClasses() {
        return (Set<Class<?>>) null;
    }

    public int id = 0;

    public static AcmeAirApp getObject(int id) {
        AcmeAirApp obj = (AcmeAirApp) new Object();
        obj.id = id;
        return obj;
    }
}

