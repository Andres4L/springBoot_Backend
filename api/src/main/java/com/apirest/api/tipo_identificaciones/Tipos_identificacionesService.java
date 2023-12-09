package com.apirest.api.tipo_identificaciones;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

@Service
public class Tipos_identificacionesService {
private final Tipos_identificacionesRepository tipos_indentificacionesRepository;

    public Tipos_identificacionesService(Tipos_identificacionesRepository tipos_indentificacionesRepository) {
        this.tipos_indentificacionesRepository = tipos_indentificacionesRepository;
    }

    public List<Tipos_identificaciones> getTipos_indentificaciones(){
        return tipos_indentificacionesRepository.findAll();
    }

    public ResponseEntity<Object> addTipo_identificacion(Tipos_identificaciones tipo_identificacion){ 
        tipos_indentificacionesRepository.save(tipo_identificacion);
        return ResponseEntity.ok().body("Tipo_identificacion creada");

    }
    
}
