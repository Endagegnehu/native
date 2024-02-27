package org.acme;

import org.acme.service.XJBoostTest;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    XJBoostTest xJBoostTest;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String modelLoaded = "";
        try {
            modelLoaded = xJBoostTest.loadModelForPrediction();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelLoaded; 
    }
}