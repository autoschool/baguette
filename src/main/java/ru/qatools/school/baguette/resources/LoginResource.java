package ru.qatools.school.baguette.resources;

import org.glassfish.jersey.server.mvc.Template;
import ru.qatools.school.baguette.models.User;
import ru.qatools.school.baguette.util.Authenticator;

import javax.security.auth.login.LoginException;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response;
import javax.xml.ws.*;
import java.net.URI;

/**
 * Created by vladzx on 23.11.14.
 */
@Path("login")
@Produces(MediaType.TEXT_HTML)
public class LoginResource {
    @GET
    @Template(name = "/login.ftl")
    public String showLogin() {
        return "";
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response login(@Context UriInfo uriInfo, @FormParam("name") String name, @FormParam("password") String password) {
        try {
            String authToken = Authenticator.login(name, password);
            URI postsPageUri = uriInfo.getBaseUriBuilder().path("../post/all").build();
            return Response.seeOther(postsPageUri).cookie(new NewCookie("authToken", authToken)).build();
        } catch (LoginException e) {
            return Response.status(Response.Status.UNAUTHORIZED).entity(e.getMessage()).build();
        }
    }
}
