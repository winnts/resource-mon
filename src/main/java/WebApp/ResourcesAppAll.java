package WebApp;

import Resources.GetAll;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by adyachenko on 29.08.16.
 */
@Path("/all")
@Produces(MediaType.APPLICATION_JSON)
public class ResourcesAppAll {
    private final String template;
//    private final String defaultName;
    private final AtomicLong counter;

    public ResourcesAppAll(String template){
        this.template = template;
//        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public SendAll sendAll(@QueryParam("processName") String processName) throws IOException {
        return new SendAll(counter.incrementAndGet(), GetAll.getAll(processName));
    }
}
