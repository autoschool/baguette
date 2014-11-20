package ru.qatools.school.baguette.resources;

import org.glassfish.jersey.server.mvc.Template;
import ru.qatools.school.baguette.models.Post;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by vladzx on 19.11.14.
 */
@Path("post")
@Produces(MediaType.TEXT_HTML)
public class PostResource {

    @GET
    @Path("/{id}")
    @Template(name = "/post/showPost.ftl")
    public Post showPost(@PathParam("id") int id) {
        return Post.findById(id);
    }

    @GET
    @Path("/all")
    @Template(name = "/post/showPosts.ftl")
    public List<Post> showPosts() {
        return Post.findAll();
    }

    @GET
    @Path("/new")
    @Template(name = "/post/newPost.ftl")
    public Post newPost() {
        return new Post();
    }

    @GET
    @Path("/edit/{id}")
    @Template(name = "/post/newPost.ftl")
    public Post showEditPostPage(@PathParam("id") int id) {
        return Post.findById(id);
    }

    @POST
    @Path("/edit/{id}")
    @Template(name = "/post/showPost.ftl")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Post editPost(@PathParam("id") int id,
                         @FormParam("title") String title,
                         @FormParam("body") String body) {
        Post post = Post.findById(id);
        if (post != null) {
            post.setTitle(title);
            post.setBody(body);
            post.save();
        }
        return post;
    }

    @POST
    @Template(name = "/post/showPost.ftl")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Post createPost(@FormParam("title") String title,
                           @FormParam("body") String body) {
        Post post = new Post();
        post.setTitle(title);
        post.setBody(body);
        post.saveIt();
        return post;
    }
}
