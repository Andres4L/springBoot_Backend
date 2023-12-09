package com.apirest.api.perfil;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

@Service
public class PerfilService {
    private final PerfilRepository perfilRepository;
    
    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }
    
    public List<Perfil> getPerfiles(){
        return perfilRepository.findAll();
    }

    public ResponseEntity<Object> addPerfil(Perfil perfil){ 
        perfilRepository.save(perfil);
        return ResponseEntity.ok().body("Perfil creado");
    }


}
