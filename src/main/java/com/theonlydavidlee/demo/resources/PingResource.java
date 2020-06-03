package com.theonlydavidlee.demo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.theonlydavidlee.demo.beans.PingGET;

@Component
@Path("/api/v1/ping")
public class PingResource {

	public static final String DEFAULT_STATUS = "Healthy";

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response ping() {
		return Response.ok()
				.entity(new PingGET(DEFAULT_STATUS))
				.build();
	}

}
