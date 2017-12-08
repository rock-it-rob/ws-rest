package rob.example.ws.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * SimpleApplication is a JAX-RS resource application class.
 *
 * @author Rob Benton
 */
@ApplicationPath("/Simple")
public class SimpleApplication extends ResourceConfig
{
    public SimpleApplication()
    {
        packages(getClass().getPackage().getName());
    }
}
