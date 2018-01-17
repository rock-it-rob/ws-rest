package rob.example.ws.rest;

import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.Assert.*;

/**
 * @author rob
 */
public class HelloIT
{
  private static final String HELLO_URI = "http://localhost:8080/Simple/hello";


  private Client client;
  private WebTarget helloTarget;
  private Invocation helloInvocation;

  @Before
  public void before()
  {
    this.client = ClientBuilder.newClient();
    this.helloTarget = this.client.target(HELLO_URI);
    this.helloInvocation = this.helloTarget.request(MediaType.TEXT_PLAIN).buildGet();
  }

  @Test
  public void testHello()
  {
    String response = this.helloInvocation.invoke(String.class);
    assertNotNull(response);
    assertEquals(response, "hello");
  }
}
