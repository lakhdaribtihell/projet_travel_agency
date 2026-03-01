package tn.pi.controllers;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin; // ✅ import ajouté
import tn.pi.model.Flight;
import tn.pi.services.FlightService;

import java.util.List;

@Component
@Path("/flights")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GET
    public List<Flight> getAllFlights(@QueryParam("compagnie") String compagnie) {

        if (compagnie == null || compagnie.trim().isEmpty()) {
            return flightService.getAllFlights();
        }

        return flightService.getFlightsByCompagnie(compagnie);
    }
}