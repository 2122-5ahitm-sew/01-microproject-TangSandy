package at.htl.restaurant.control;

import at.htl.restaurant.boundary.CookRepository;
import at.htl.restaurant.entity.Cook;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.List;

@Path("/cook")
public class CookService {

    @Inject
    public CookRepository cookRepository;

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Cook generateCook() {
        LocalDate date1 = LocalDate.of(2017, 1, 13);
        Cook cook = new Cook("Max","Muster",1200,date1);

        logger.info("New Cook " + cook);

        return cook;
    }
}
