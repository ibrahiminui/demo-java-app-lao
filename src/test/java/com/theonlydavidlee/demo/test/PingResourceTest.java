package com.theonlydavidlee.demo.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.testng.annotations.Test;

import com.theonlydavidlee.demo.beans.PingGET;
import com.theonlydavidlee.demo.resources.PingResource;

public class PingResourceTest {

	@Test
	public void testHealthService() {
		PingResource resource = new PingResource();
		Response response = resource.ping();
		assertEquals(response.getStatus(), Status.OK.getStatusCode());

		PingGET entity = (PingGET) response.getEntity();
		assertNotNull(entity);
		assertEquals(entity.getStatus(), PingResource.DEFAULT_STATUS);
	}

}
