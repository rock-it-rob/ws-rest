package rob.example.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * SimpleResource is a JAX-RS resource class.
 * 
 * @author Rob Benton
 */
@Path("/Simple")
public class SimpleResource {

	/**
	 * Simple method taking no arguments and returning a plain text string.
	 * 
	 * @return string message.
	 */
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "hello";
	}

	/**
	 * Sending an HTTP Get request to this uri with a query parameter named
	 * <code>param</code> will set its value in the returned JSON value.
	 * 
	 * @param param
	 *            <code>String</code>
	 * @return
	 */
	@GET
	@Path("/echo")
	@Produces(MediaType.APPLICATION_JSON)
	public EchoResponse echo(@QueryParam("param") String param) {
		EchoResponse echoResponse = new EchoResponse();
		echoResponse.setValue(param);

		return echoResponse;
	}
}
