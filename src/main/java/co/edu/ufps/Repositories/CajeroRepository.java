package co.edu.ufps.Repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.Entities.*;
@Repository
public interface CajeroRepository extends JpaRepository<Cajero, Integer> {
    Optional<Cajero> findByToken(String token);
}
