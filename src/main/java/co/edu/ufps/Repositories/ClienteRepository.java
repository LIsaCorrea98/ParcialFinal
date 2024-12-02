package co.edu.ufps.Repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.Entities.*;
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Optional<Cliente> findByDocumentoAndTipoDocumento_Nombre(String documento, String tipoDocumento);
}

