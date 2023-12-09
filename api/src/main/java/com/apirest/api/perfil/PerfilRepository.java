package com.apirest.api.perfil;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    
}
