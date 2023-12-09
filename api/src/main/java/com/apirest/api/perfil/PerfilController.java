package com.apirest.api.perfil;
import java.util.List;

import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(path = "api/perfiles")
public class PerfilController {
    private final PerfilService perfilService;
    
    //@Autowired
    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }
    
    @GetMapping
    public List<Perfil> getPerfiles(){
        return perfilService.getPerfiles();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewPerfil(@RequestBody Perfil perfil){
       return this.perfilService.addPerfil(perfil); 
    }
    
    /* @PutMapping
    public ResponseEntity<Object> UpdatePerfil(@RequestBody Perfil perfil){
       return this.perfilService.addPerfil(perfil); 
    } */
}
