package ru.qatools.school.baguette.resources;

import org.glassfish.jersey.server.mvc.Template;
import ru.qatools.school.baguette.models.User;

import javax.security.auth.login.LoginException;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author alexandr.gudulin@gmail.com
 */
@Path("user")
@Produces(MediaType.TEXT_HTML)
public class UserResource {
    @GET
    @Path("/{id}")
    @Template(name = "/user/profile.ftl")
    public User showUserProfile(@PathParam("id") int id) {
        return User.findById(id);
    }
}
