package rob.example.ws.rest;

/**
 * EchoResponse is a class for holding data used in the response of the
 * {@link SimpleResource.echo} web service. It is a POJO that uses Jackson
 * databind for translation into JSON.
 * 
 * @author Rob Benton
 */
public class EchoResponse {

	private String value;

	public EchoResponse() {
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
