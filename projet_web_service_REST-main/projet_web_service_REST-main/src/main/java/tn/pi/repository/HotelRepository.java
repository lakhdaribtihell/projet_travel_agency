package tn.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.pi.model.Hotel;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    // Rechercher les hôtels par ville
    List<Hotel> findByVille(String ville);

    // Rechercher les hôtels par nombre d'étoiles
    List<Hotel> findByEtoiles(int etoiles);

    // Rechercher les hôtels par ville et étoiles
    List<Hotel> findByVilleAndEtoiles(String ville, int etoiles);
}
