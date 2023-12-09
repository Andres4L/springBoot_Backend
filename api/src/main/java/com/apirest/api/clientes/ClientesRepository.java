package com.apirest.api.clientes;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    Optional<Clientes> findByidentificacion(String identificacion);
    
}
