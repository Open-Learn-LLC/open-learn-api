package com.openlearn.api.config;

import com.openlearn.api.rest.UserRestControllerImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Jersey Rest Configuration
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

    /**
     * Registers the Rest Endpoints
     */
    public JerseyConfig() {
       register(UserRestControllerImpl.class);
    }
}
