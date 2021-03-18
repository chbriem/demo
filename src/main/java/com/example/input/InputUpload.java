package com.example.input;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Path("/input")
public class InputUpload {

    @Path("text")
    @Consumes(MediaType.TEXT_PLAIN)
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Secured("ROLE_INTERFACES")
    public String upload(String a_text) {
        System.out.println(a_text);
        return "OK";
    }
}
