package ru.qatools.school.baguette.util;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.freemarker.FreemarkerMvcFeature;

/**
 * Created by vladzx on 16.11.14.
 */
public class Server extends ResourceConfig {
    public Server() {
        register(FreemarkerMvcFeature.class);

        packages("ru.qatools.school.baguette.resources");
    }
}
