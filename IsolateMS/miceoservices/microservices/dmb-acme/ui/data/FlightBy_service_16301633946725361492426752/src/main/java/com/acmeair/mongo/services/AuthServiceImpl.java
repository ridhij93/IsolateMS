package com.acmeair.mongo.services;

import static com.mongodb.client.model.Filters.eq;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import org.bson.Document;
import com.acmeair.mongo.MongoConstants;
import com.acmeair.service.AuthService;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.acmeair.mongo.ConnectionManager;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ApplicationScoped
public class AuthServiceImpl extends AuthService implements MongoConstants {

    // private final static Logger logger = Logger.getLogger(CustomerService.class.getName());
    @PostConstruct
    public void initialization() {
        return;
    }

    @Override
    public Long countSessions() {
        return (Long) null;
    }

    @Override
    protected String getSession(String sessionid) {
        return (String) null;
    }

    @Override
    protected void removeSession(String sessionJson) {
        return;
    }

    @Override
    protected String createSession(String sessionId, String customerId, Date creation, Date expiration) {
        return (String) null;
    }

    @Override
    public void invalidateSession(String sessionid) {
        return;
    }

    @Override
    public void dropSessions() {
        return;
    }

    public void setCustomerSession(MongoCollection<Document> customerSession) {
        return;
    }

    public MongoCollection<Document> getCustomerSession() {
        return (MongoCollection<Document>) null;
    }

    public int id = 0;

    public static AuthServiceImpl getObject(int id) {
        AuthServiceImpl obj = (AuthServiceImpl) new Object();
        obj.id = id;
        return obj;
    }
}

