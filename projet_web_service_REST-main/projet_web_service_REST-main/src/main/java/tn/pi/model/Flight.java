package tn.pi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vols")
public class Flight{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String compagnie;
    private String depart;
    private String arrivee;
    private String dateDepart;
    private double prix;
}
