package com.apirest.api.facturas;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

@Service
public class FacturasService {
    private final FacturasRepository facturasRepository;

    public FacturasService(FacturasRepository facturasRepository) {
        this.facturasRepository = facturasRepository;
    }

    public List<Facturas> getFacturas(){
        return facturasRepository.findAll();
    }

    public Optional<Facturas> getFacturaById(Long id){
        return facturasRepository.findById(id);
    }

    public ResponseEntity<Object> addFactura(Facturas factura){ 
        facturasRepository.save(factura);
        return ResponseEntity.ok().body("Factura creada");
    }

    public ResponseEntity<Object> updateFactura(Facturas factura){ 
        facturasRepository.save(factura);
        return ResponseEntity.ok().body("Factura actualizada");
    }

    /* public ResponseEntity<Object> deleteFactura(Facturas factura){ 
        facturasRepository.delete(factura);
        return ResponseEntity.ok().body("Factura eliminada");
    } */


}
