package ru.qatools.school.baguette.util;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.freemarker.FreemarkerMvcFeature;
import ru.qatools.school.baguette.service.AuthenticationFilter;
import ru.qatools.school.baguette.annotations.AuthenticationRequired;
import ru.qatools.school.baguette.service.DatabaseProvider;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;

/**
 * Created by vladzx on 16.11.14.
 */
public class Server extends ResourceConfig {
    public Server() {
        register(FreemarkerMvcFeature.class);

        packages("ru.qatools.school.baguette.resources");

        register(new DynamicFeature() {
            @Override
            public void configure(ResourceInfo resourceInfo, FeatureContext context) {
                context.register(DatabaseProvider.class);

                if (resourceInfo.getResourceMethod().isAnnotationPresent(AuthenticationRequired.class)) {
                    context.register(AuthenticationFilter.class);
                }
            }
        });
    }
}
