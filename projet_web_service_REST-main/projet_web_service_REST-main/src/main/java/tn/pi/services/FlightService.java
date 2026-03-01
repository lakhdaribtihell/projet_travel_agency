package tn.pi.services;

import org.springframework.stereotype.Service;
import tn.pi.model.Flight;
import tn.pi.repository.FlightRepository;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Flight> getFlightsByCompagnie(String compagnie) {
        return flightRepository.findByCompagnie(compagnie);
    }
}
