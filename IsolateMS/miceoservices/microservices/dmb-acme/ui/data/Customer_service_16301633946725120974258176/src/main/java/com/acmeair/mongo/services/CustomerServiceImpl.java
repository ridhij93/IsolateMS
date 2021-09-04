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
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ApplicationScoped
public class CustomerServiceImpl extends CustomerService implements MongoConstants {

    // private final static Logger logger = Logger.getLogger(CustomerService.class.getName());
    @PostConstruct
    public void initialization() {
        return;
    }

    @Override
    public Long count() {
        return (Long) null;
    }

    @Override
    public void createCustomer(String username, String password, String status, int total_miles, int miles_ytd, String phoneNumber, String phoneNumberType, String addressJson) {
        return;
    }

    @Override
    public String createAddress(String streetAddress1, String streetAddress2, String city, String stateProvince, String country, String postalCode) {
        return (String) null;
    }

    @Override
    public void updateCustomer(String username, CustomerInfo customerInfo) {
        return;
    }

    @Override
    protected String getCustomer(String username) {
        return (String) null;
    }

    @Override
    public String getCustomerByUsername(String username) {
        return (String) null;
    }

    @Override
    public void dropCustomers() {
        return;
    }

    public void setCustomer(MongoCollection<Document> customer) {
        return;
    }

    public int id = 0;

    public static CustomerServiceImpl getObject(int id) {
        CustomerServiceImpl obj = (CustomerServiceImpl) new Object();
        obj.id = id;
        return obj;
    }
}

