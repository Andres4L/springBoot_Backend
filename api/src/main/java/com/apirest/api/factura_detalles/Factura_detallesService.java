package com.apirest.api.factura_detalles;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class Factura_detallesService {
    
    private final Factura_detallesRepository factura_detallesRepository;

    public Factura_detallesService(Factura_detallesRepository factura_detallesRepository) {
        this.factura_detallesRepository = factura_detallesRepository;
    }

    public List<Factura_detalles> getFactura_detalles(){
        return factura_detallesRepository.findAll();
    }

    public Optional<Factura_detalles> getFactura_detallesById(Long id){
        return factura_detallesRepository.findById(id);
    }

    public ResponseEntity<Object> addFactura_detalles(Factura_detalles factura_detalles){ 
        factura_detallesRepository.save(factura_detalles);
        return ResponseEntity.ok().body("Factura_detalles creada");

    }

    public ResponseEntity<Object> updateFactura_detalles(Factura_detalles factura_detalles){ 
        factura_detallesRepository.save(factura_detalles);
        return ResponseEntity.ok().body("Factura_detalles actualizada");
    }
}
