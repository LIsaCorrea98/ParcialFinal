package co.edu.ufps.Repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.Entities.*;
public interface CajeroRepository extends JpaRepository<Cajero, Integer> {
    Optional<Cajero> findByToken(String token);
}
