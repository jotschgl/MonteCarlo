/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.fhv.montecarlo;

import java.math.BigInteger;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Johannes
 */
@Path("MonteCarlo")
@RequestScoped
public class GenericResource {

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of
     * at.fhv.montecarlo.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("get")
    @Produces("text/plain")
     @Consumes("text/plain")
    public String getPI(@QueryParam("randoms")String randoms) {
        System.out.println("in method " + randoms);
        try {
            String pi = String.valueOf(MonteCarlo.computePI(Long.parseLong(randoms)));
            return pi;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "Bitte Zahl eingeben";
        }
    }   

  
}
