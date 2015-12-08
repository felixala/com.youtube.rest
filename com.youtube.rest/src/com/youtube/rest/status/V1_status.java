package com.youtube.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {
	private static final String api_version = "00.00.01";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnStatus(){
		return "Java REST Service Return";
	}
	
	@GET
	@Path("/version")
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "Returning Version: " + api_version;
	}

}
