package au.com.infomedia;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import static junit.framework.Assert.assertEquals;

public class SonnetsResourceTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        // start the server
        server = Main.startServer();
        // create the client
        Client c = ClientBuilder.newClient();

        target = c.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void testGet() {
        final Integer expectedSonnetNumber = 1;

        SonnetData sonnet = target.path("sonnets").request().get(SonnetData.class);

        assertEquals(expectedSonnetNumber, sonnet.getNumber());
    }
}
