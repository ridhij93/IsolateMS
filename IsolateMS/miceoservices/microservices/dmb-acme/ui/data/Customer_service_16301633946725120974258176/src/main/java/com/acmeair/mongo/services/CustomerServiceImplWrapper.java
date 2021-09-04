package com.acmeair.mongo.services;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import org.bson.Document;
import com.acmeair.mongo.MongoConstants;
import com.acmeair.service.CustomerService;
import com.acmeair.web.dto.CustomerInfo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.acmeair.mongo.ConnectionManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@ApplicationScoped
public class CustomerServiceImplWrapper {

    // private final static Logger logger = Logger.getLogger(CustomerService.class.getName());
    private static int maxId = 0;

    public static HashMap<Integer, CustomerServiceImplServer> idObjMap = new HashMap<>();

    @RequestMapping(method = RequestMethod.GET, value = "customerserviceimpl")
    public  @ResponseBody int CustomerServiceImpl() {
        CustomerServiceImplServer newServerObj = new CustomerServiceImplServer();
        idObjMap.put(++maxId, newServerObj);
        return maxId;
    }
    // private final static Logger logger = Logger.getLogger(CustomerService.class.getName());
}

