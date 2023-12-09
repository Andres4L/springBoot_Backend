package com.apirest.api.tipo_identificaciones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Tipos_identificacionesRepository extends JpaRepository<Tipos_identificaciones, Long> {
    
}
