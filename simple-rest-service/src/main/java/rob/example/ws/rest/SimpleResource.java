package rob.example.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * SimpleResource is a JAX-RS resource class.
 * 
 * @author Rob Benton
 */
@Path("/Simple")
public class SimpleResource {
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "hello";
	}
}
