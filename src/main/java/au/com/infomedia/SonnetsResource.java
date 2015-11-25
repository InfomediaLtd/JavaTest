package au.com.infomedia;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Sonnets web service JAX-RS definition.
 */
@Path("sonnets")
public class SonnetsResource {

    /**
     * Get a single sonnet.
     */
    @GET
    @Produces("application/json")
    public SonnetData get(@QueryParam("number") Integer sonnetNumber) {
        final SonnetData sonnetData = new SonnetData(1, new String[]{"Shall I ..."});
        return sonnetData;
    }
}
