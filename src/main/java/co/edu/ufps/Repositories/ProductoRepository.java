package co.edu.ufps.Repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.Entities.*;
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Producto> findByReferencia(String referencia);
}
