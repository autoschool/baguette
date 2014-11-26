package ru.qatools.school.baguette.service;

import ru.qatools.school.baguette.util.Authenticator;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URI;
import java.util.Map;

/**
 * Created by vladzx on 26.11.14.
 */
public class AuthenticationFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        URI loginPageUri = containerRequestContext.getUriInfo().getBaseUriBuilder().path("../login").build();
        Map<String, Cookie> cookies = containerRequestContext.getCookies();
        if (cookies.get("authToken") != null) {
            String authToken = cookies.get("authToken").getValue();
            if (!Authenticator.isAuthTokenValid(authToken)) {
                throw new WebApplicationException(Response.seeOther(loginPageUri).build());
            }
        } else {
            throw new WebApplicationException(Response.seeOther(loginPageUri).build());
        }
    }
}
