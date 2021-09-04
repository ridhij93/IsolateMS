package com.acmeair.web;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import com.acmeair.config.AcmeAirConfiguration;
import com.acmeair.config.LoaderREST;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@ApplicationPath("/rest/info")
public class AppConfigWrapper {

    private static int maxId = 0;

    public static HashMap<Integer, AppConfigServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "appconfig")
    public  @ResponseBody int AppConfig() {
        AppConfigServer newServerObj = new AppConfigServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
}

