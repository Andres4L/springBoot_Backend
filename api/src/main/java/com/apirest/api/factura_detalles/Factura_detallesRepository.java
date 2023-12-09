package com.apirest.api.factura_detalles;
//import com.apirest.api.facturas.Facturas;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Factura_detallesRepository extends JpaRepository<Factura_detalles, Long>{

    //void deleteAllByFactura(Facturas factura);
}
