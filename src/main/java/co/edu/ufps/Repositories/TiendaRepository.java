package co.edu.ufps.Repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.Entities.*;
public interface TiendaRepository extends JpaRepository<Tienda, Integer> {
    Optional<Tienda> findByUuid(String uuid);
}