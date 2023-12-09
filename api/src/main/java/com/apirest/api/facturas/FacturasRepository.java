package com.apirest.api.facturas;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FacturasRepository  extends JpaRepository<Facturas, Long>{
    
}
