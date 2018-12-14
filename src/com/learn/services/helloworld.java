package com.learn.services;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


//localhost:8080/SessionQuiz/rest/test/x
@Path("/test")
public class helloworld {
	
	@GET
	public Response getMessage(String xyz) {
		String x = "{ 'term' : 'HTML', 'definition':'hyperlink text markup language'}";
		return Response.status(200).entity(x).build();
	}
	
	@GET
	@Path("/x")
	public Response getX(String xyz) {
		String k = "{'x':5} ";
		return Response.status(200).entity(k).build();
	}
	
	
}
