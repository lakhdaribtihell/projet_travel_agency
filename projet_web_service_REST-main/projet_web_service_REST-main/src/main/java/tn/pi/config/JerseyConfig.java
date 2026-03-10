package tn.pi.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import tn.pi.controllers.FlightController;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(FlightController.class);
    }
}
