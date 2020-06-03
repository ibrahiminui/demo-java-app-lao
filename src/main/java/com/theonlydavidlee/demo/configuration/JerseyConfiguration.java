package com.theonlydavidlee.demo.configuration;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.theonlydavidlee.demo.resources.PingResource;

@Configuration
public class JerseyConfiguration extends ResourceConfig {

	public JerseyConfiguration() {
		register(JacksonFeature.class);
		register(PingResource.class);
	}

}
