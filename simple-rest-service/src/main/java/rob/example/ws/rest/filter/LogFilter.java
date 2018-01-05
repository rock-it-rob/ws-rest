package rob.example.ws.rest.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.util.logging.Logger;

/**
 * @author Rob Benton
 */
@Provider
public class LogFilter implements ContainerRequestFilter
{
    private static final Logger log = Logger.getLogger(LogFilter.class.getName());

    @Override
    public void filter(ContainerRequestContext requestContext)
    {
        log.info("Running filter on request");
    }
}
