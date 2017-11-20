package Drehorte_CIC_Boehm_Patrick;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/drehorte")
public class DrehortResource {

    // This method is called if JSON is requested
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Drehort getJSON() {
        Drehort ort = new Drehort();
        ort.setOrt("Application JSON Drehort - Drehort");
        ort.setName("Application JSON Drehort - Filmname");
        return ort;
    }

}