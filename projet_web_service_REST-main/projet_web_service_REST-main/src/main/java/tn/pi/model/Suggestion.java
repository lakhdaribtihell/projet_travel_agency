package tn.pi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "suggestions")
public class Suggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;        // monument, parc, restaurant
    private String nom;
    private String ville;
    private String description;
}

