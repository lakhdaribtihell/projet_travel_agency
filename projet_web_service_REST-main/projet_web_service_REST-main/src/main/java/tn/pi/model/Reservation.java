package tn.pi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vol_id")
    private Flight Flight;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    private String nomClient;
    private String emailClient;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
