
package tn.pi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tn.pi.model.Flight;
import tn.pi.model.Hotel;
import tn.pi.repository.FlightRepository;
import tn.pi.repository.HotelRepository;

@SpringBootApplication
public class AgenceVoyageWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgenceVoyageWebappApplication.class, args);
    }

    // Test automatique au démarrage
    @Bean
    CommandLineRunner start(FlightRepository flightRepository,
                            HotelRepository hotelRepository) {
        return args -> {


        };
    }
}
