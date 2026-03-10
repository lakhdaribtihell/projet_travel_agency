package tn.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.pi.model.Suggestion;

import java.util.List;

@Repository
public interface SuggestionRepository extends JpaRepository<Suggestion, Long> {

    List<Suggestion> findByVille(String ville);

    List<Suggestion> findByType(String type);
}
