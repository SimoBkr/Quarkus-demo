package org.acme.quickstart;

import org.acme.quickstart.service.GreetingService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Path("/greeting/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloSimo(@PathParam("name") String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello RESTEasy";
    }
}