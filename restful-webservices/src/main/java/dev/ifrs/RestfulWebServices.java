package dev.ifrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**Depois escrevam um Web Service em Rest que possibilite as seguintes conversões:
Quilômetro por hora para milhas por hora (1=0.621371) – esse método deve consumir por POST e produzir dados em texto.
Nós para quilometro por hora (1=1.852) – esse método deve consumir dados por GET e produzir dados em em JSON. */

@Path("/conversor")
public class RestfulWebServices {

    @Path("/kmmilhas/{a}")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public Double conversorKmMilhas(@FormParam("a") Double a) {
        return a*0.621371;
    }

    @Path("/noskm/{b}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Double conversorNosKm(@PathParam("b") Double b) {
            return b*1.852;
        }
}