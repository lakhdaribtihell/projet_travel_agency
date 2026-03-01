package tn.pi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String ville;
    private int etoiles;
    private double prixNuit;
}
