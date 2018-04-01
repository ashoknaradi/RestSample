package com.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/restHelloWorld")
public class HelloWorldService {

	static int count = 0;
	
	/*Simple web service Testing*/
	@GET
	@Path("/test")
	public Response getTestMsg() {
		try {
			count ++;
			System.out.println("Test Connection Triggered " + count);
			return Response.status(200).entity("Test Connection").build();
		} catch (Exception e) {
			System.out.println("Test Connection failed");
			return Response.status(500).entity("Error at server side ").build();
		}
	}
	
	/*Simple web service Testing with path parameter*/
	@GET
	@Path("/{param}")
	public Response pathParamMsg(@PathParam("param") String paramMessage) {
		try {
			count ++;
			System.out.println("Test Connection Triggered " + count);
			String pathOutput = "path Param message is : " + paramMessage;
			System.out.println(pathOutput);
			return Response.status(200).entity(pathOutput).build();
		} catch (Exception e) {
			return Response.status(500).entity("Error at server side ").build();
		}
	}

	/*Simple web service Testing with query parameter*/
	@GET
	@Path("/query")
	public Response queryParamMsg(@QueryParam("queryParam") String queryMessage) {
		try {
			count ++;
			System.out.println("Test Connection Triggered " + count);
			String queyOutput = "Query Param message is : " + queryMessage;
			System.out.println(queyOutput);
			return Response.status(200).entity(queyOutput).build();
		} catch (Exception e) {
			return Response.status(500).entity("Error at server side ").build();
		}
	}

}