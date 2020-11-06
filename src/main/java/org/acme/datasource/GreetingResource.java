package org.acme.datasource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.agroal.api.AgroalDataSource;

@Path("/hello")
public class GreetingResource {

    @Inject
    private AgroalDataSource agroalDataSource;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}
