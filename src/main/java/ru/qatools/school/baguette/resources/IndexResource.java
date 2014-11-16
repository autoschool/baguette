package ru.qatools.school.baguette.resources;

import org.glassfish.jersey.server.mvc.Template;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by vladzx on 16.11.14.
 */
@Path("/")
@Produces(MediaType.TEXT_HTML)
public class IndexResource {

    @GET
    @Path("/")
    @Template(name = "/index.ftl")
    public String showHello() {
        return "baguette";
    }
}
