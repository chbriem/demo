package com.example.output;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.micronaut.security.annotation.Secured;

@Path("result")
public class ResultDownload {

    @GET
    //@GZIP
    @Produces(MediaType.TEXT_PLAIN)
    @Secured("ROLE_INTERFACES")
    public String getResult() {
        return "This is the Result: Everything OK";
    }
}
