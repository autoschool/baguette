package ru.qatools.school.baguette.resources;

import org.glassfish.jersey.server.mvc.Template;
import ru.qatools.school.baguette.annotations.AuthenticationRequired;
import ru.qatools.school.baguette.models.User;

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

    @GET
    @AuthenticationRequired
    @Path("/edit")
    @Template(name = "/user/editProfile.ftl")
    public User showEditProfile() {
        // TODO: return context user
        return new User();
    }

    @POST
    @AuthenticationRequired
    @Path("/edit")
    @Template(name = "/user/editProfile.ftl")
    public User editProfile(@FormParam("full-name") String fullName,
                            @FormParam("email") String email,
                            @FormParam("website") String website,
                            @FormParam("password") String password) {
        // TODO: change context user
        return showEditProfile();
    }
}
