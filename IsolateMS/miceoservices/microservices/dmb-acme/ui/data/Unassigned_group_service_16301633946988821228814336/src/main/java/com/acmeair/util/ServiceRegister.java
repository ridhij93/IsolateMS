package com.acmeair.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ServiceRegister implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        return;
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        return;
    }

    public int id = 0;

    public static ServiceRegister getObject(int id) {
        ServiceRegister obj = (ServiceRegister) new Object();
        obj.id = id;
        return obj;
    }
}

