package com.acmeair.config;

import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.acmeair.loader.Loader;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Path("/loader")
public class LoaderREST {

    // private static Logger logger = Logger.getLogger(LoaderREST.class.getName());
    /*
 * Disabling to test out the new acmeair code frist
 */
    @GET
    @Path("/query")
    @Produces("text/plain")
    public Response queryLoader() {
        String uri = MicroserviceApplication.projectUri + "/ms1/loaderrest/queryloadercallerId=" + this.id + "";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    @GET
    @Path("/load")
    @Produces("text/plain")
    public Response loadDB(@DefaultValue("-1") @QueryParam("numCustomers") long numCustomers) {
        String uri = MicroserviceApplication.projectUri + "/ms1/loaderrest/loaddb?callerId=" + this.id + "&numCustomers=numCustomers";
        int resultTemp = new RestTemplate().getForObject(uri, int.class);
        Response result = Response.getObject(resultTemp);
        return result;
    }

    public void setLoader(Loader loader) {
        return;
    }

    public Loader getLoader() {
        return (Loader) null;
    }

    public int id = 0;

    public static LoaderREST getObject(int id) {
        LoaderREST obj = (LoaderREST) new Object();
        obj.id = id;
        return obj;
    }
}

