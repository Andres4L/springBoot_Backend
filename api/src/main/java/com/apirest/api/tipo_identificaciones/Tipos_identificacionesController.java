package com.apirest.api.tipo_identificaciones;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/tipo_identificaciones")
public class Tipos_identificacionesController {
    private final Tipos_identificacionesService tipos_indentificacionesService;
    //@Autowired
    public Tipos_identificacionesController(Tipos_identificacionesService tipos_indentificacionesService) {
        this.tipos_indentificacionesService = tipos_indentificacionesService;
    }

    @GetMapping
    public List<Tipos_identificaciones> getTipos_indentificaciones(){
        return this.tipos_indentificacionesService.getTipos_indentificaciones();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewTipo_identificacion(@RequestBody Tipos_identificaciones tipo_identificacion){
       return this.tipos_indentificacionesService.addTipo_identificacion(tipo_identificacion); 
    }

    @PutMapping
    public ResponseEntity<Object> UpdateTipo_identificacion(@RequestBody Tipos_identificaciones tipo_identificacion){
       return this.tipos_indentificacionesService.addTipo_identificacion(tipo_identificacion); 
    }
    
}
