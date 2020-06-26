package org.redwine;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.panache.common.Sort;

@Path("/redwine/backend")
public class WineResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String welcome() {
        return "Welcome to Red Wine";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/wines")
    public List<Wine> getAll() {
        return Wine.listAll(Sort.by("origin"));
    }
}