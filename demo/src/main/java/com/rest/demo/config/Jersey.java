package com.rest.demo.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/")
public class Jersey extends ResourceConfig {
    public Jersey() {
        this.packages("com.rest.demo.controllers");
    }
}
